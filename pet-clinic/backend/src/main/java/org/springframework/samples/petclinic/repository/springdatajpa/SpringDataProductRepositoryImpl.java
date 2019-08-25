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

/**
 * @author Vitaliy Fedoriv
 *
 */

@Profile("spring-data-jpa")
public class SpringDataProductRepositoryImpl implements ProductRepositoryOverride {
	
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

	@Override
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

	b USING(pack_id,pid) JOIN channel USING(channel_id) WHERE msisdn=2347865987124 GROUP BY pack_id UNION ALL SELECT action,IF(ACTION=1,'In-Retry','Unsub-Req In-Progress') STATUS,msisdn,pack_id,pid,prod_name,channel_desc,0.00,0,'-',0.00,IF(trans_id IS NULL,'-',trans_id) trans_id,IF(trans_resp IS NULL,'-',trans_resp) trans_resp,IF(cr_dt IS NULL,'-',cr_dt) req_dt,'-',IF(mod_dt IS NULL,'-',mod_dt) mod_dt FROM subscriber_queue a JOIN product

	b USING(pack_id,pid) JOIN channel USING(channel_id) WHERE msisdn=2347865987124 GROUP BY pack_id;	 
	*/
}
