/*
 * Copyright 2002-2017 the original author or authors.
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
package org.springframework.samples.petclinic.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.samples.petclinic.model.AuditVisitDTO;
import org.springframework.samples.petclinic.model.Channel;
import org.springframework.samples.petclinic.model.ConsolidatedReportRangeDTO;
import org.springframework.samples.petclinic.model.DndBlacklist;
import org.springframework.samples.petclinic.model.Operator;
import org.springframework.samples.petclinic.model.PriceDetails;
import org.springframework.samples.petclinic.model.Product;
import org.springframework.samples.petclinic.model.ReportHourly;
import org.springframework.samples.petclinic.model.SmsDTO;
import org.springframework.samples.petclinic.model.SubscriberQueue;
import org.springframework.samples.petclinic.model.SubscriptionDTO;
import org.springframework.samples.petclinic.model.SubscriptionRequestDTO;
import org.springframework.samples.petclinic.model.TempMsisdnUpload;
import org.springframework.samples.petclinic.repository.ChannelRepository;
//import org.springframework.samples.petclinic.repository.DndBlacklistRepository;
import org.springframework.samples.petclinic.repository.OperatorRepository;
import org.springframework.samples.petclinic.repository.PriceRepository;
import org.springframework.samples.petclinic.repository.ProductRepository;
import org.springframework.samples.petclinic.repository.ReportHourlyRepository;
import org.springframework.samples.petclinic.repository.SmsRepository;
import org.springframework.samples.petclinic.repository.SubscriberRepository;
import org.springframework.samples.petclinic.repository.TempMsisdnUploadRepository;
import org.springframework.samples.petclinic.repository.springdatajpa.SpringDataDndBlacklistRepository;
import org.springframework.samples.petclinic.repository.springdatajpa.SpringDataSubscriberQueueRepository;
import org.springframework.samples.petclinic.repository.springdatajpa.SpringDataTempMsisdnUploadRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Mostly used as a facade so all controllers have a single point of entry
 *
 * @author Michael Isvy
 * @author Vitaliy Fedoriv
 */
@Service

public class ContentProviderServiceImpl implements ContentProviderService {

	@Autowired
	private OperatorRepository operatorRepository;
	@Autowired
	private ReportHourlyRepository reportHourlyRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private SpringDataDndBlacklistRepository dndBlacklistRepository;
//	private DndBlacklistRepository dndBlacklistRepository;

	@Autowired
	private SpringDataSubscriberQueueRepository springDataSubscriberQueueRepository;
	
	@Autowired
	private ChannelRepository channelRepository;
	
	@Autowired
	private PriceRepository priceRepository;

	@Autowired
	private SubscriberRepository subscriberRepository;
	
	@Autowired
	private SmsRepository smsRepository;
	
	@Autowired
	private SpringDataTempMsisdnUploadRepository tempMsidnUploadRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Operator findOperatorById(int id) throws DataAccessException {
		Operator operator = null;
		try {
			operator = operatorRepository.findById(id);
		} catch (ObjectRetrievalFailureException | EmptyResultDataAccessException e) {
			// just ignore not found exceptions for Jdbc/Jpa realization
			return null;
		}
		return operator;
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Operator> findAllOperators() throws DataAccessException {
		return operatorRepository.findAll();
	}

	@Override
	@Transactional
	public void saveOperator(Operator operator) throws DataAccessException {
		operatorRepository.save(operator);
	}

	@Override
	@Transactional
	public void deleteOperator(Operator operator) throws DataAccessException {
		operatorRepository.delete(operator);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Operator> findOperatorByName(String name) throws DataAccessException {
		return operatorRepository.findByName(name);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<ReportHourly> findAllReportHourly() throws DataAccessException {
		return reportHourlyRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<ReportHourly> findAllDailyReport(Date startDate, Date endDate) throws DataAccessException {
		return reportHourlyRepository.findByDateAfterAndDateBefore(startDate, endDate);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<ConsolidatedReportRangeDTO> findAggregatedDailyReport(Date startDate, Date endDate, String packId,
			String pId) throws DataAccessException {
		return reportHourlyRepository.findConsolidatedReportRange(startDate, endDate, packId, pId);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Product> findAllProducts() throws DataAccessException {
		return productRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<AuditVisitDTO> findAuditVisitDetails(String msisdn, Date startDate, Date endDate) throws DataAccessException {
		return productRepository.findAuditVisitDetails(msisdn, startDate, endDate);
	}

	@Override
	public Collection<Product> findActiveProducts() {
		return productRepository.findByState(1);
	}

	@Override
	@Transactional
	public Iterable<DndBlacklist> saveDndBlacklist(@Valid String csvBlackListStr) {
		String[] blackList = csvBlackListStr.split(",");
		ArrayList<DndBlacklist> blackListItems = new ArrayList<DndBlacklist>();
		Date todaysDate = new Date();
		for (String blackListNum: blackList) {
			System.out.println("blackListNum::: " + blackListNum);
			DndBlacklist item = new DndBlacklist();
			item.setMsisdn(Long.parseLong(blackListNum));
			item.setCreatedDate(todaysDate);
			blackListItems.add(item);
		}
		return dndBlacklistRepository.saveAll(blackListItems);
	}

	@Override
	@Transactional(readOnly = true)
	public DndBlacklist findDndBlacklistByMsisdn(long msisdn) {
		return dndBlacklistRepository.findByMsisdn(msisdn);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<DndBlacklist> findAllDndBlacklist() {
		return dndBlacklistRepository.findAll();
	}

	@Override
	public void deleteDndBlacklist(DndBlacklist dndBlacklist) {
		dndBlacklistRepository.delete(dndBlacklist);
	}

	@Override
	public DndBlacklist saveDndBlacklist(DndBlacklist dndBlacklist) {
		return dndBlacklistRepository.save(dndBlacklist);		
	}

	@Override
	@Transactional(readOnly = true)
	public Channel findChannelById(int id) throws DataAccessException {
		return channelRepository.findByChannelId(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Channel> findAllChannels() throws DataAccessException {
		return channelRepository.findAll();
	}

	@Override
	public void saveChannel(Channel channel) throws DataAccessException {
		channelRepository.save(channel);
	}

	@Override
	public void deleteChannel(Channel channel) throws DataAccessException {
		channelRepository.delete(channel);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Channel> findByChannelDesc(String name) throws DataAccessException {
		return channelRepository.findByChannelDesc(name);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<PriceDetails> findActivePriceDetails() {
		return priceRepository.findByState(1);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<SubscriptionDTO> findSubscriptionStatus(String msisdn) {
		System.out.println("Within find subscription status");
		Collection<SubscriptionDTO> subResult = subscriberRepository.findSubscriptionStatus(msisdn);
		Collection<SubscriptionDTO> subQueueResult = subscriberRepository.findSubscriptionQueueStatus(msisdn);
		Collection<SubscriptionDTO> finalResult = new ArrayList<SubscriptionDTO>(subResult);
		finalResult.addAll(subQueueResult);
		return finalResult;
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<SubscriptionDTO> findSubscriptionHistory(String msisdn, Date startDate, Date endDate) {
		System.out.println("Within find subscription status");
		Collection<SubscriptionDTO> finalResult = subscriberRepository.findSubscriptionHistory(msisdn, startDate, endDate);
		System.out.println("findSubscriptionHistory result::: " + finalResult);
		return finalResult;
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<SubscriptionDTO> findSubscriptionChurn(String packId, String pid, String churnStartDate,
			String churnEndDate, String subStartDate, String subEndDate, String msisdn, String churnType, String subChannelId,
			String unsubChannelId) {
		System.out.println("Within find subscription status");
		System.out.println("packIdStr:" + packId+ "pidStr:" + pid+ "churnStartDateStr:" + churnStartDate
				+ "churnEndDateStr:" + churnEndDate+ "subStartDateStr:" + subStartDate+ "subEndDateStr:"
				+ subEndDate+ "msisdnStr:" + msisdn+ "churnTypeStr:" + churnType+ "subChannelIdStr:"
				+ subChannelId+ "unsubChannelIdStr:" + unsubChannelId);
		

		Collection<SubscriptionDTO> finalResult = subscriberRepository.findSubscriptionChurn(packId, pid,
				churnStartDate, churnEndDate, subStartDate, subEndDate, msisdn, churnType, subChannelId,
				unsubChannelId);
		System.out.println("findSubscriptionHistory result::: " + finalResult);
		return finalResult;
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<SmsDTO> findAllSms(String msisdnStr, String startDateStr, String endDateStr) {
		Collection<SmsDTO> smsMoResult = smsRepository.findSmsMO(msisdnStr, startDateStr, endDateStr);
		Collection<SmsDTO> smsMtResult = smsRepository.findSmsMT(msisdnStr, startDateStr, endDateStr);
		Collection<SmsDTO> finalResult = new ArrayList<SmsDTO>(smsMoResult);
		finalResult.addAll(smsMtResult);
		return finalResult;
	}

	@Override
	@Transactional
	public Iterable<SubscriberQueue> saveBulkSubscriptions(SubscriptionRequestDTO subRequest) {
		String[] msisdnList = subRequest.getMsisdnNumbers().split(",");
		
		ArrayList<TempMsisdnUpload> tempUploadList = new ArrayList<TempMsisdnUpload>();
		for (String msisdn: msisdnList) {
			System.out.println("Backend to be added msisdn::: " + msisdn);
			TempMsisdnUpload item = new TempMsisdnUpload();
			item.setMsisdn(Long.parseLong(msisdn));
			tempUploadList.add(item);
		}
		tempMsidnUploadRepository.saveAll(tempUploadList);
		
		ArrayList<TempMsisdnUpload> tempUploadListWithoutDupes = (ArrayList<TempMsisdnUpload>) tempMsidnUploadRepository.findMsisdnsNotAvailableInSystem();
				
		ArrayList<SubscriberQueue> subscriptionList = new ArrayList<SubscriberQueue>();
		Date todaysDate = new Date();
		for (TempMsisdnUpload msisdnItem: tempUploadListWithoutDupes) {
			System.out.println("Backend to be added msisdn::: " + msisdnItem.getMsisdn());
			SubscriberQueue item = new SubscriberQueue();
			item.setMsisdn(msisdnItem.getMsisdn());
			//
			// INSERT INTO subscriber_queue(`action`, msisdn, pack_id, pid, catid, price, channel_id, sms_flg, cr_dt) SELECT 1, msisdn, ?, ?, ?, ?, ?, ?, ADDTIME(NOW(), ?) from upload_msisdn;
			// skipping catid and sms_flg
			//
			item.setAction(1);
			//item.setMsisdn(Long.valueOf(msisdn));
			item.setPackId(Integer.parseInt(subRequest.getSelectedProduct().getPackId()));
			item.setPid(Integer.parseInt(subRequest.getSelectedProduct().getPidServiceId().getPid()));
			item.setPrice(subRequest.getSelectedPriceDetails().getPrice());
			item.setChannelId(subRequest.getSelectedChannel().getChannelId());
			item.setFirstChargedDate(todaysDate);
			subscriptionList.add(item);
		}
		// return null;
		ArrayList<SubscriberQueue> subscriptionListStatus = (ArrayList<SubscriberQueue>) springDataSubscriberQueueRepository.saveAll(subscriptionList);
		tempMsidnUploadRepository.deleteAll(tempUploadList);
		return subscriptionListStatus;
	}

}
