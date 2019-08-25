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

import java.util.Collection;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.dao.DataAccessException;
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

/**
 * Mostly used as a facade so all controllers have a single point of entry
 *
 * @author Michael Isvy
 * @author Vitaliy Fedoriv
 */
public interface ContentProviderService {

	Operator findOperatorById(int id) throws DataAccessException;

	Collection<Operator> findAllOperators() throws DataAccessException;

	void saveOperator(Operator operator) throws DataAccessException;

	void deleteOperator(Operator operator) throws DataAccessException;

	Collection<Operator> findOperatorByName(String name) throws DataAccessException;

	Collection<ReportHourly> findAllReportHourly() throws DataAccessException;

	Collection<ReportHourly> findAllDailyReport(Date startDate, Date endDate) throws DataAccessException;

	Collection<ConsolidatedReportRangeDTO> findAggregatedDailyReport(Date startDate, Date endDate, String packId,
			String pId) throws DataAccessException;

	Collection<Product> findAllProducts() throws DataAccessException;

	Collection<AuditVisitDTO> findAuditVisitDetails(String msisdn, Date startDate, Date endDate)
			throws DataAccessException;

	Collection<Product> findActiveProducts();

	Iterable<DndBlacklist> saveDndBlacklist(@Valid String csvBlackListStr);

	DndBlacklist findDndBlacklistByMsisdn(long msisdn);

	Collection<DndBlacklist> findAllDndBlacklist();

	void deleteDndBlacklist(DndBlacklist dndBlacklist);

	DndBlacklist saveDndBlacklist(DndBlacklist dndBlacklist);

	Channel findChannelById(int id) throws DataAccessException;

	Collection<Channel> findAllChannels() throws DataAccessException;

	void saveChannel(Channel channel) throws DataAccessException;

	void deleteChannel(Channel channel) throws DataAccessException;

	Collection<Channel> findByChannelDesc(String name) throws DataAccessException;

	Collection<PriceDetails> findActivePriceDetails();

	Collection<SubscriptionDTO> findSubscriptionStatus(String msisdn);

	Collection<SubscriptionDTO> findSubscriptionHistory(String msisdn, Date startDate, Date endDate);

	Collection<SubscriptionDTO> findSubscriptionChurn(String packId, String pid, String churnStartDate,
			String churnEndDate, String subStartDate, String subEndDate, String msisdn, String churnType, String subChannelId,
			String unsubChannelId);

	Collection<SmsDTO> findAllSms(String msisdnStr, String startDateStr, String endDateStr);

	Iterable<SubscriberQueue> saveBulkSubscriptions(SubscriptionRequestDTO subRequest);

}

