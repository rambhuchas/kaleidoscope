/*
 * Copyright 2016-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.petclinic.repository.springdatajpa;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Profile;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.AuditVisitDTO;
import org.springframework.samples.petclinic.model.ConsolidatedReportRangeDTO;
import org.springframework.samples.petclinic.model.Subscriber;
import org.springframework.samples.petclinic.model.SubscriptionDTO;

/**
 * @author Vitaliy Fedoriv
 *
 */

@Profile("spring-data-jpa")
public class SpringDataSubscriberRepositoryImpl implements SubscriberRepositoryOverride {
	
	@PersistenceContext
    private EntityManager em;

//	@Override
	//public Collection<ConsolidatedReportRangeDTO> findConsolidatedReportRange(@Param("startDate") Date startDate, @Param("endDate") Date endDate)
	public Collection<ConsolidatedReportRangeDTO> findConsolidatedReportRange(Date startDate, Date endDate, String packId, String pId)
			throws DataAccessException {
		String groupQueryStr = "SELECT " +
		           " new org.springframework.samples.petclinic.model.ConsolidatedReportRangeDTO("
		           + "repperhr.date, "
		           + "SUM(repperhr.totalClicks) AS totalClicks, "
		           + "SUM(repperhr.totalClicksOnlyMsisdn) AS totalClicksOnlyMsisdn, "
		           + "SUM(repperhr.totalClicksUniqueMsisdn) AS totalClicksUniqueMsisdn, "
		           + "SUM(repperhr.firstConformPgVisit) AS firstConformPgVisit, "
		           + "SUM(repperhr.secondConformPgVisit) AS secondConformPgVisit, "
		           + "SUM(repperhr.subRequest) AS subRequest, "
		           + "SUM(repperhr.subFailed) AS subFailed, "
		           + "SUM(repperhr.subSuccess) AS subSuccess, "
		           + "SUM(repperhr.subSuccess * repperhr.price) AS subRevenue, "
		           + "SUM(repperhr.subretryFailed) AS subretryFailed, "
		           + "SUM(repperhr.subretrySuccess) AS subretrySuccess, "
		           + "SUM(repperhr.subretrySuccess * repperhr.price) AS subretryRevenue, "
		           + "SUM(repperhr.renewalFailed) AS renewalFailed, "
		           + "SUM(repperhr.renewalSuccess) AS renewalSuccess, "
		           + "SUM(repperhr.renewalSuccess * repperhr.price) AS renewalRevenue, "
		           + "SUM((repperhr.subSuccess + repperhr.subretrySuccess + repperhr.renewalSuccess) * repperhr.price) AS totalRevenue, "
		           + "SUM(repperhr.unsubRequest) AS unsubRequest, "
		           + "SUM(repperhr.unsub) AS unsub, "
		           + "SUM(repperhr.churnSubRetry) AS churnSubRetry, "
		           + "SUM(repperhr.churnRenewal) AS churnRenewal "
		           + ") "
		           + "FROM "
		           + "ReportHourly repperhr "
		           + "WHERE repperhr.date >= :startDate "
		           + "AND repperhr.date <= :endDate  ";
		
		if (packId!=null && !"".equals(packId)) {
			groupQueryStr = groupQueryStr + "AND repperhr.packId = :packId ";
		}
		if (pId!=null && !"".equals(pId)) {
			groupQueryStr = groupQueryStr + "AND repperhr.pId = :pId ";
		}
		groupQueryStr = groupQueryStr + "GROUP BY " + "repperhr.date";
		Query groupQuery = em.createQuery(groupQueryStr);
		groupQuery.setParameter("startDate", startDate);
		groupQuery.setParameter("endDate", endDate);
		if (packId!=null && !"".equals(packId)) {
			groupQuery.setParameter("packId", Integer.parseInt(packId));
		}
		if (pId!=null && !"".equals(pId)) {
			groupQuery.setParameter("pId", Integer.parseInt(pId));
		}
		List<ConsolidatedReportRangeDTO> reportResult = groupQuery.getResultList();
		return reportResult;
		
		//CriteriaBuilder cb = em.getCriteriaBuilder();
		//CriteriaQuery<ConsolidatedReportRangeDTO> cbGroupQuery = cb.createQuery(ConsolidatedReportRangeDTO.class);
		//Root<ConsolidatedReportRangeDTO> reportQueryRoot = cbGroupQuery.from(ConsolidatedReportRangeDTO.class);
		//cbGroupQuery.groupBy(reportQueryRoot.get(""));
		//cbGroupQuery.multiselect(reportQueryRoot.get(""));
		//cb.count(reportQueryRoot);
		//TypedQuery<ConsolidatedReportRangeDTO> typedQuery = em.createQuery(cbGroupQuery);
		//Path<String> emailPath = reportQueryRoot.get("packId");
		//List<Predicate> predicates = new ArrayList<>();
		/*
		 *         for (String email : emails) {
		 *             predicates.add(cb.like(emailPath, email));         }
		 */
		//cbGroupQuery.select(reportQueryRoot).where(cb.or(predicates.toArray(new Predicate[predicates.size()])));
		//return em.createQuery(cbGroupQuery).getResultList();
	}
	
//	@Override
//	public void findWapHistory(String msisdn, Date startDate, Date endDate)
//			throws DataAccessException {
	/*String groupQueryStr = "SELECT " +
		           " new org.springframework.samples.petclinic.model.ConsolidatedReportRangeDTO(";
	Tuple postViewCount = entityManager.createQuery(
		    "select p as post, count(pv) as page_views " +
		    "from Post p " +
		    "left join PageView pv on p.slug = pv.slug " +
		    "where p.title = :title " +
		    "group by p", Tuple.class)
		.setParameter("title", "High-Performance Java Persistence")
		.getSingleResult();*/
		// SELECT msisdn,prod_name,pp,user_agent,user_ip,ref_url,click_url,vs,cr_dt FROM
		// audit_visit JOIN product USING(pack_id,pid) WHERE DATE(cr_dt) BETWEEN
		// "2019-07-01" AND "2019-08-19" ORDER BY cr_dt DESC
//	}

//	@Override
	public Collection<AuditVisitDTO> findAuditVisitDetails(String msisdn, Date startDate, Date endDate)
			throws DataAccessException {
		String auditVisitsDescOrderStr = "SELECT " +
		           " new org.springframework.samples.petclinic.model.AuditVisitDTO( "
		           + "auditVisit.visitedDate, "
		           + "product.prodName AS productName, "
		           + "auditVisit.pp AS price, "
		           + "auditVisit.userAgent, "
		           + "auditVisit.userIp, "
		           + "auditVisit.refUrl, "
		           + "auditVisit.clickUrl "
		           + ") "
		           + "FROM "
		           + "AuditVisit auditVisit "
		           + "JOIN Product product "
		           + "ON auditVisit.packid = product.packId  "
		           + "AND auditVisit.pid = product.pidServiceId.pid  "
		           + "WHERE auditVisit.visitedDate >= :startDate "
		           + "AND auditVisit.visitedDate <= :endDate ";
		if (msisdn!=null && !"".equals(msisdn)) {
			auditVisitsDescOrderStr = auditVisitsDescOrderStr + "AND auditVisit.msisdn = :msisdn ";
		}
		auditVisitsDescOrderStr = auditVisitsDescOrderStr + "ORDER BY auditVisit.visitedDate DESC";
		
		Query auditVisitsDescOrder = em.createQuery(auditVisitsDescOrderStr, AuditVisitDTO.class);
		auditVisitsDescOrder.setParameter("startDate", startDate);
		auditVisitsDescOrder.setParameter("endDate", endDate);
		if (msisdn!=null && !"".equals(msisdn)) {
			auditVisitsDescOrder.setParameter("msisdn", Long.parseLong(msisdn));
		}
		List<AuditVisitDTO> auditVisitResult = auditVisitsDescOrder.getResultList();
		return auditVisitResult;
	}

	@Override
	public Collection<SubscriptionDTO> findSubscriptionStatus(String msisdn) {
		/*
		Date operationDate, int action, String prodName, String subChannelName, double amountCharged,
			int lastValidity, Date expiryDate, String lastTransactionId, String lastTransactionResponse,
			Date requestDate, String status, long msisdn, int packId, int pid, double totalChargedTillNow,
			Date firstChargedDate, Date lastChargeTriedDate, int subChannelId, int unsubChannelId,
			String unsubChannelName, int totalReTriedTillNow, String churnType, Date churnedDate, int viaSub
		*/

		String subsQueryStr = "SELECT " +
		           " new org.springframework.samples.petclinic.model.SubscriptionDTO("
		           + "subscriber.firstChargedDate AS operationDate, " //since this is not used in subscriber, and throwing NPE setting dummy
		           + "1 AS action, "
		           + "product.prodName, "
		           + "channel.mode, "
		           + "subscriber.amountCharged, "
		           + "subscriber.validity, "
		           + "subscriber.endDate, "
		           + "subscriber.transId, "
		           + "subscriber.transResp, "
		           + "subscriber.reqDate, "
		           + "'' AS status, "
		           + "subscriber.msisdn, "
		           + "subscriber.packId, "
		           + "subscriber.pid, "
		           + "subscriber.tillGot, "
		           + "subscriber.firstChargedDate, "
		           + "subscriber.modDate, "
		           + "subscriber.channelId AS subChannelId, "
		           + "0 AS unsubChannelId, "
		           + "'' AS unsubChannelName, "
		           + "0 AS totalReTriedTillNow, "
		           + "'' AS churnType, "
		           + "subscriber.firstChargedDate AS churnedDate, "
		           + "0 AS viaSub"
		           + ") "
		           + "FROM "
		           + "Subscriber subscriber "
		           + "JOIN Product product "
		           + "ON (subscriber.packId = product.packId  "
		           + "AND subscriber.pid = product.pidServiceId.pid) "
		           + "JOIN Channel channel "
		           + "ON subscriber.channelId = channel.channelId "
		           + "WHERE msisdn = :msisdn";

		String subQueueQueryStr = "SELECT " +
		           " new org.springframework.samples.petclinic.model.SubscriptionDTO("
		           + "subscriber.firstChargedDate AS operationDate, " //since this is not used in subscriber, and throwing NPE setting dummy
		           + "subscriber.action AS action, "
		           + "product.prodName, "
		           + "channel.mode, "
		           + "0.00, "
		           + "0, "
		           + "subscriber.firstChargedDate, " //dummy - endDate
		           + "subscriber.transId, "
		           + "subscriber.transResp, "
		           + "subscriber.firstChargedDate, " //dummy - reqDate
		           + "'In-Retry' AS status, "
		           + "subscriber.msisdn, "
		           + "subscriber.packId, "
		           + "subscriber.pid, "
		           + "0.00, "
		           + "subscriber.firstChargedDate, "
		           + "subscriber.modDate, "
		           + "subscriber.channelId AS subChannelId, "
		           + "0 AS unsubChannelId, "
		           + "'' AS unsubChannelName, "
		           + "0 AS totalReTriedTillNow, "
		           + "'' AS churnType, "
		           + "subscriber.firstChargedDate AS churnedDate, " //dummy - churnedDate
		           + "0 AS viaSub"
		           + ") "
		           + "FROM "
		           + "SubscriberQueue subscriber "
		           + "JOIN Product product "
		           + "ON (subscriber.packId = product.packId  "
		           + "AND subscriber.pid = product.pidServiceId.pid) "
		           + "JOIN Channel channel "
		           + "ON subscriber.channelId = channel.channelId "
		           + "WHERE msisdn = :msisdn";

		String unionQueryStr = subsQueryStr + " UNION ALL " + subsQueryStr;
		
		System.out.println("MSISDN Status Query:" + unionQueryStr);
		
		Query groupQuery = em.createQuery(subsQueryStr);
		System.out.println("After groupQuery from em:");
		groupQuery.setParameter("msisdn", msisdn);
		System.out.println("After groupQuery.setParameter:");
		

		List<SubscriptionDTO> reportResult = groupQuery.getResultList();
		System.out.println("Result of MSISDN Status Query:" + reportResult);
		
		return reportResult;
		// TODO Auto-generated method stub
	}
	
	@Override
	public Collection<SubscriptionDTO> findSubscriptionQueueStatus(String msisdn) {
		/*
		Date operationDate, int action, String prodName, String subChannelName, double amountCharged,
			int lastValidity, Date expiryDate, String lastTransactionId, String lastTransactionResponse,
			Date requestDate, String status, long msisdn, int packId, int pid, double totalChargedTillNow,
			Date firstChargedDate, Date lastChargeTriedDate, int subChannelId, int unsubChannelId,
			String unsubChannelName, int totalReTriedTillNow, String churnType, Date churnedDate, int viaSub
		*/

		String subsQueryStr = "SELECT " +
		           " new org.springframework.samples.petclinic.model.SubscriptionDTO("
		           + "subscriber.firstChargedDate AS operationDate, " //since this is not used in subscriber, and throwing NPE setting dummy
		           + "1 AS action, "
		           + "product.prodName, "
		           + "channel.mode, "
		           + "subscriber.amountCharged, "
		           + "subscriber.validity, "
		           + "subscriber.endDate, "
		           + "subscriber.transId, "
		           + "subscriber.transResp, "
		           + "subscriber.reqDate, "
		           + "'' AS status, "
		           + "subscriber.msisdn, "
		           + "subscriber.packId, "
		           + "subscriber.pid, "
		           + "subscriber.tillGot, "
		           + "subscriber.firstChargedDate, "
		           + "subscriber.modDate, "
		           + "subscriber.channelId AS subChannelId, "
		           + "0 AS unsubChannelId, "
		           + "'' AS unsubChannelName, "
		           + "0 AS totalReTriedTillNow, "
		           + "'' AS churnType, "
		           + "subscriber.firstChargedDate AS churnedDate, "
		           + "0 AS viaSub"
		           + ") "
		           + "FROM "
		           + "Subscriber subscriber "
		           + "JOIN Product product "
		           + "ON (subscriber.packId = product.packId  "
		           + "AND subscriber.pid = product.pidServiceId.pid) "
		           + "JOIN Channel channel "
		           + "ON subscriber.channelId = channel.channelId "
		           + "WHERE msisdn = :msisdn";

		String subQueueQueryStr = "SELECT " +
		           " new org.springframework.samples.petclinic.model.SubscriptionDTO("
		           + "subscriber.firstChargedDate AS operationDate, " //since this is not used in subscriber, and throwing NPE setting dummy
		           + "subscriber.action AS action, "
		           + "product.prodName, "
		           + "channel.mode, "
		           + "0.00, "
		           + "0, "
		           + "subscriber.firstChargedDate, " //dummy - endDate
		           + "subscriber.transId, "
		           + "subscriber.transResp, "
		           + "subscriber.firstChargedDate, " //dummy - reqDate
		           //+ "'In-Retry' AS status, "
		           //+ "IF(subscriber.action = 1,'In-Retry','Unsub-Req In-Progress') AS status, "
		           + "CASE WHEN (subscriber.action = 1) THEN 'In-Retry' ELSE 'Unsub-Req In-Progress' END, "
		           + "subscriber.msisdn, "
		           + "subscriber.packId, "
		           + "subscriber.pid, "
		           + "0.00, "
		           + "subscriber.firstChargedDate, "
		           + "subscriber.modDate, "
		           + "subscriber.channelId AS subChannelId, "
		           + "0 AS unsubChannelId, "
		           + "'' AS unsubChannelName, "
		           + "0 AS totalReTriedTillNow, "
		           + "'' AS churnType, "
		           + "subscriber.firstChargedDate AS churnedDate, " //dummy - churnedDate
		           + "0 AS viaSub"
		           + ") "
		           + "FROM "
		           + "SubscriberQueue subscriber "
		           + "JOIN Product product "
		           + "ON (subscriber.packId = product.packId  "
		           + "AND subscriber.pid = product.pidServiceId.pid) "
		           + "JOIN Channel channel "
		           + "ON subscriber.channelId = channel.channelId "
		           + "WHERE msisdn = :msisdn";

		String unionQueryStr = subsQueryStr + " UNION ALL " + subsQueryStr;
		
		System.out.println("MSISDN Status Query:" + unionQueryStr);
		
		Query groupQuery = em.createQuery(subQueueQueryStr);
		System.out.println("After groupQuery from em:");
		groupQuery.setParameter("msisdn", msisdn);
		System.out.println("After groupQuery.setParameter:");
		

		List<SubscriptionDTO> reportResult = groupQuery.getResultList();
		System.out.println("Result of MSISDN Status Query:" + reportResult);
		
		return reportResult;
		// TODO Auto-generated method stub
	}

	@Override
	public Collection<SubscriptionDTO> findSubscriptionHistory(String msisdn, Date startDate, Date endDate) {
		String subHistoryQueryStr = "SELECT " +
		           " new org.springframework.samples.petclinic.model.SubscriptionDTO("
		           + "auditSub.opDate, "
		           + "auditSub.action, "
		           + "product.prodName, "
		           + "channel.mode, "
		           + "auditSub.amountCharged, "
		           + "auditSub.validity, "
		           + "auditSub.endDate, "
		           + "auditSub.transId, "
		           + "auditSub.transResp, "
		           + "auditSub.reqDate, "
		           + "' ' AS status, " //dummy - space
		           + "auditSub.msisdn, "
		           + "auditSub.packId, "
		           + "auditSub.pid, "
		           + "0.00, " //dummy - tillGot 0.00
		           + "auditSub.opDate, " //dummy - firstChargedDate aka createdDate
		           + "auditSub.opDate, " //dummy - modDate
		           + "0 AS subChannelId, "
		           + "0 AS unsubChannelId, "
		           + "'' AS unsubChannelName, "
		           + "0 AS totalReTriedTillNow, "
		           + "'' AS churnType, "
		           + "auditSub.opDate AS churnedDate, " //dummy - churnedDate
		           + "0 AS viaSub, "
		           + "auditConstants.name"
		           + ") "
		           + "FROM "
		           + "AuditSub auditSub "
		           + "JOIN Product product "
		           + "ON (auditSub.packId = product.packId  "
		           + "AND auditSub.pid = product.pidServiceId.pid) "
		           + "JOIN Channel channel "
		           + "ON auditSub.channelId = channel.channelId "
		           + "JOIN AuditConstants auditConstants "
		           + "ON auditSub.action = auditConstants.action "
		           + "WHERE msisdn = :msisdn "
		           + "AND auditSub.opDate >= :startDate "
		           + "AND auditSub.opDate <= :endDate  ";

		System.out.println("MSISDN Status Query:" + subHistoryQueryStr);
		
		Query groupQuery = em.createQuery(subHistoryQueryStr);
		System.out.println("After groupQuery from em:");
		groupQuery.setParameter("msisdn", msisdn);
		groupQuery.setParameter("startDate", startDate);
		groupQuery.setParameter("endDate", endDate);
		System.out.println("After groupQuery.setParameter:");
		

		List<SubscriptionDTO> reportResult = groupQuery.getResultList();
		System.out.println("Result of MSISDN Status Query:" + reportResult);
		
		return reportResult;
	}

	@Override
	public Collection<SubscriptionDTO> findSubscriptionChurn(String packIdStr, String pidStr, String churnStartDateStr,
			String churnEndDateStr, String subStartDateStr, String subEndDateStr, String msisdnStr, String churnTypeStr,
			String subChannelIdStr, String unsubChannelIdStr) {
		System.out.println("packIdStr:" + packIdStr + "pidStr:" + pidStr + "churnStartDateStr:" + churnStartDateStr
				+ "churnEndDateStr:" + churnEndDateStr + "subStartDateStr:" + subStartDateStr + "subEndDateStr:"
				+ subEndDateStr + "msisdnStr:" + msisdnStr + "churnTypeStr:" + churnTypeStr + "subChannelIdStr:"
				+ subChannelIdStr + "unsubChannelIdStr:" + unsubChannelIdStr);
		
        /*
		long msisdn, String prodName, String churnType, String subChannelName,
			String unsubChannelName, int lastValidity, double amountCharged, Date expiryDate,
			double totalChargedTillNow, Date requestDate, Date firstChargedDate, Date churnedDate, int viaSub;
        */
		String subChurnQueryStr = "SELECT " +
		           " new org.springframework.samples.petclinic.model.SubscriptionDTO("
		           + "subscriber.msisdn, "
		           + "product.prodName, "
		           + "CASE WHEN (subscriber.churnType = 1) THEN 'VOLUNTARY_UNSUB' WHEN (subscriber.churnType = 2) THEN 'SUBRETRY_CHURN' ELSE 'RENEWAL_CHURN' END, "
		           + "subChannel.mode, "
		           + "churnChannel.mode, "
		           + "subscriber.lastValidity, "
		           + "subscriber.lastAmountCharged, "
		           + "subscriber.endDate, "
		           + "subscriber.tillGot, "
		           + "subscriber.reqDate, "
		           + "subscriber.firstChargedDate, "
		           + "subscriber.churnDate, "
		           + "subscriber.viaSub"
		           + ") "
		           + "FROM "
		           + "SubscriberChurn subscriber "
		           + "JOIN Product product "
		           + "ON (subscriber.packId = product.packId  "
		           + "AND subscriber.pid = product.pidServiceId.pid) "
		           + "JOIN Channel subChannel "
		           + "ON subscriber.subscriptionChannelId = subChannel.channelId "
		           + "JOIN Channel churnChannel "
		           + "ON subscriber.churnChannelId = churnChannel.channelId "
		           //MANDATORY search conditions are added
		           + "WHERE "
		           + "subscriber.churnDate >= :churnStartDate "
		           + "AND subscriber.churnDate <= :churnEndDate  ";

        //OPTIONAL search conditions are added
		if (packIdStr!=null && !"".equals(packIdStr)) {
			subChurnQueryStr = subChurnQueryStr + "AND subscriber.packId = :packId ";
		}
		if (pidStr!=null && !"".equals(pidStr)) {
			subChurnQueryStr = subChurnQueryStr + "AND subscriber.pid = :pid ";
		}
		if (subStartDateStr!=null && !"".equals(subStartDateStr)) {
			subChurnQueryStr = subChurnQueryStr + "AND subscriber.firstChargedDate >= :subStartDate ";
		}
		if (subEndDateStr!=null && !"".equals(subEndDateStr)) {
			subChurnQueryStr = subChurnQueryStr + "AND subscriber.firstChargedDate <= :subEndDate ";
		}
		if (msisdnStr!=null && !"".equals(msisdnStr)) {
			subChurnQueryStr = subChurnQueryStr + "AND subscriber.msisdn = :msisdn ";
		}
		if (churnTypeStr!=null && !"".equals(churnTypeStr)) {
			subChurnQueryStr = subChurnQueryStr + "AND subscriber.churnType = :churnType ";
		}
		if (subChannelIdStr!=null && !"".equals(subChannelIdStr)) {
			subChurnQueryStr = subChurnQueryStr + "AND subscriber.subscriptionChannelId = :subscriptionChannelId ";
		}
		if (unsubChannelIdStr!=null && !"".equals(unsubChannelIdStr)) {
			subChurnQueryStr = subChurnQueryStr + "AND subscriber.churnChannelId = :unsubChannelId ";
		}
		subChurnQueryStr = subChurnQueryStr + "ORDER BY subscriber.churnDate DESC";
		
		//Util
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Query groupQuery = em.createQuery(subChurnQueryStr);
		
        //MANDATORY search values are passed
		try {
			groupQuery.setParameter("churnStartDate", sdf.parse(churnStartDateStr));
			groupQuery.setParameter("churnEndDate", sdf.parse(churnEndDateStr));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
        //OPTIONAL search values are passed		
		if (packIdStr!=null && !"".equals(packIdStr)) {
			groupQuery.setParameter("packId", Integer.valueOf(packIdStr));
		}
		if (pidStr!=null && !"".equals(pidStr)) {
			groupQuery.setParameter("pid", Integer.valueOf(pidStr));
		}
		try {
			if (subStartDateStr != null && !"".equals(subStartDateStr)) {
				groupQuery.setParameter("subStartDate", sdf.parse(subStartDateStr));
			}
			if (subEndDateStr != null && !"".equals(subEndDateStr)) {
				groupQuery.setParameter("subEndDate", sdf.parse(subEndDateStr));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		if (msisdnStr!=null && !"".equals(msisdnStr)) {
			groupQuery.setParameter("msisdn", Long.valueOf(msisdnStr));
		}
		if (churnTypeStr!=null && !"".equals(churnTypeStr)) {
			groupQuery.setParameter("churnType", Integer.valueOf(churnTypeStr));
		}
		if (subChannelIdStr!=null && !"".equals(subChannelIdStr)) {
			groupQuery.setParameter("subscriptionChannelId", Integer.valueOf(subChannelIdStr));
		}
		if (unsubChannelIdStr!=null && !"".equals(unsubChannelIdStr)) {
			groupQuery.setParameter("unsubChannelId", Integer.valueOf(unsubChannelIdStr));
		}

		List<SubscriptionDTO> reportResult = groupQuery.getResultList();
		System.out.println("Result of MSISDN Status Query:" + reportResult);
		
		return reportResult;

	}
	
	/*
	subVO.setOperationDate(rSet.getString("op_dt"));
	subVO.setAction(rSet.getInt("action"));
	subVO.setProdName(rSet.getString("prod_name"));
	subVO.setSubChannelName(rSet.getString("channel_desc"));
	subVO.setAmountCharged(rSet.getDouble("amt_charged"));
	subVO.setLastValidity(rSet.getInt("validity"));
	subVO.setExpiryDate(rSet.getString("end_dt"));
	subVO.setLastTransactionId(rSet.getString("trans_id"));
	subVO.setLastTransactionResponse(rSet.getString("trans_resp"));
	subVO.setRequestDate(rSet.getString("req_dt"));
	*/
	/*
	SELECT msisdn, prod_name, IF(churn_type=1,'VOLUNTARY_UNSUB',IF(churn_type=2,'SUBRETRY_CHURN','RENEWAL_CHURN')) churn_type, c.mode sub_channel, d.mode churn_channel, last_validity, last_amt_charged, end_dt, till_got, req_dt, cr_dt, churn_dt, via_sub 
	FROM subscriber_churn a JOIN

	product USING(pack_id,pid) JOIN channel

	c ON(a.sub_channel_id=c.channel_id) JOIN channel

	d ON (a.churn_channel_id=d.channel_id)

	WHERE   DATE(churn_dt) BETWEEN '2019-07-01' AND '2019-08-20' ORDER BY DATE(churn_dt) DESC
	
	*/
	
	
	/*
	SELECT 1

	as action,IF(end_dt>=CURDATE(),'Active',(IF(end_dt=DATE_SUB(CURDATE(),INTERVAL 1 DAY),'Grace','Suspended'))) STATUS,msisdn,pack_id,pid,prod_name,channel_desc,amt_charged,validity,end_dt,till_got,

	IF(trans_id IS NULL,'-',trans_id) trans_id,IF(trans_resp IS NULL,'-',trans_resp) trans_resp,IF(req_dt IS NULL,'-',req_dt) req_dt,IF(cr_dt IS NULL,'-',cr_dt) cr_dt,IF(mod_dt IS NULL,'-',mod_dt) mod_dt FROM subscriber a JOIN product

	b USING(pack_id,pid) JOIN channel USING(channel_id) WHERE msisdn=2347865987124 GROUP BY pack_id UNION ALL

	SELECT action,IF(ACTION=1,'In-Retry','Unsub-Req In-Progress') STATUS,msisdn,pack_id,pid,prod_name,channel_desc,0.00,0,'-',0.00,IF(trans_id IS NULL,'-',trans_id) trans_id,IF(trans_resp IS NULL,'-',trans_resp) trans_resp,IF(cr_dt IS NULL,'-',cr_dt) req_dt,'-',IF(mod_dt IS NULL,'-',mod_dt) mod_dt FROM subscriber_queue a JOIN product

	b USING(pack_id,pid) JOIN channel USING(channel_id) WHERE msisdn=2347865987124 GROUP BY pack_id;	 
	*/
}
