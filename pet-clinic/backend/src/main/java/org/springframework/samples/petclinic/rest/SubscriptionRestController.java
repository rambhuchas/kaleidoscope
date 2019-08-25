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

package org.springframework.samples.petclinic.rest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
//import org.springframework.samples.petclinic.model.ConsolidatedReportRangeDTO;
//import org.springframework.samples.petclinic.model.ReportHourly;
import org.springframework.samples.petclinic.service.ContentProviderService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.samples.petclinic.model.DndBlacklist;
import org.springframework.samples.petclinic.model.SubscriberQueue;
import org.springframework.samples.petclinic.model.SubscriptionDTO;
import org.springframework.samples.petclinic.model.SubscriptionRequestDTO;
import org.springframework.samples.petclinic.model.Vet;

/**
 * @author Vitaliy Fedoriv
 *
 */

@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")
@RequestMapping("/api/subscriptions")
public class SubscriptionRestController {

	@Autowired
	private ContentProviderService contentProviderService;

	@PreAuthorize("hasRole(@roles.OWNER_ADMIN)")
	@RequestMapping(value = "/status/{msisdn}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Collection<SubscriptionDTO>> getAllReport(@PathVariable("msisdn") String msisdn) {
		System.out.println("Within Sub Rest Controller getAllReport");

		Collection<SubscriptionDTO> subscriptionStatusCollection = this.contentProviderService.findSubscriptionStatus(msisdn);
		
		System.out.println("After result from content provider service::: " + subscriptionStatusCollection);
		if (subscriptionStatusCollection.isEmpty()) {
			return new ResponseEntity<Collection<SubscriptionDTO>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<SubscriptionDTO>>(subscriptionStatusCollection, HttpStatus.OK);
	}

	@PreAuthorize("hasRole(@roles.OWNER_ADMIN)")
	@RequestMapping(value = "/history/{msisdn}/{startDate}/{endDate}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Collection<SubscriptionDTO>> getDailyReport(@PathVariable("msisdn") String msisdn,
			@PathVariable("startDate") String startDateStr, @PathVariable("endDate") String endDateStr) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = new Date();
		Date endDate = new Date();
		try {
			startDate = sdf.parse(startDateStr);
			endDate = sdf.parse(endDateStr);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		Collection<SubscriptionDTO> subscriptionHistoryCollection = this.contentProviderService.findSubscriptionHistory(msisdn, startDate, endDate);
		if (subscriptionHistoryCollection.isEmpty()) {
			return new ResponseEntity<Collection<SubscriptionDTO>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<SubscriptionDTO>>(subscriptionHistoryCollection, HttpStatus.OK);
	}

	//http://localhost:9966/petclinic/api/subscriptions/1/1/2019-01-01/2019-12-31/2018-01-01/2019-08-31/2340123456789/1/1/1
	@PreAuthorize("hasRole(@roles.OWNER_ADMIN)")
	@RequestMapping(
			value = "/{packId}/{pid}/{churnStartDate}/{churnEndDate}/{subStartDate}/{subEndDate}/{msisdn}/{churnType}/{subChannelId}/{unsubChannelId}", 
			method = RequestMethod.GET, 
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE
	)
	public ResponseEntity<Collection<SubscriptionDTO>> getChurnReport(
			@PathVariable(name = "packId", required = false) String packIdStr,
			@PathVariable(name = "pid", required = false) String pidStr,
			@PathVariable("churnStartDate") String churnStartDateStr,
			@PathVariable("churnEndDate") String churnEndDateStr,
			@PathVariable(name = "subStartDate", required = false) String subStartDateStr,
			@PathVariable(name = "subEndDate", required = false) String subEndDateStr,
			@PathVariable(name = "msisdn", required = false) String msisdnStr,
			@PathVariable(name = "churnType", required = false) String churnTypeStr,
			@PathVariable(name = "subChannelId", required = false) String subChannelIdStr,
			@PathVariable(name = "unsubChannelId", required = false) String unsubChannelIdStr) {

		System.out.println("packIdStr:" + packIdStr + "pidStr:" + pidStr + "churnStartDateStr:" + churnStartDateStr
				+ "churnEndDateStr:" + churnEndDateStr + "subStartDateStr:" + subStartDateStr + "subEndDateStr:"
				+ subEndDateStr + "msisdnStr:" + msisdnStr + "churnTypeStr:" + churnTypeStr + "subChannelIdStr:"
				+ subChannelIdStr + "unsubChannelIdStr:" + unsubChannelIdStr);
		
		/*
		 * 
			Date churnStartDate, int churnType, int subChannelId, int packId, Date subStartDate, int pid,
			Date subEndDate, Date churnEndDate, int unsubChannelId
		 */
		/*
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = new Date();
		Date endDate = new Date();
		try {
			startDate = sdf.parse(startDateStr);
			endDate = sdf.parse(endDateStr);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		*/
		Collection<SubscriptionDTO> subscriptionHistoryCollection = this.contentProviderService.findSubscriptionChurn(
				packIdStr, pidStr, churnStartDateStr, churnEndDateStr, subStartDateStr, subEndDateStr, msisdnStr, churnTypeStr, subChannelIdStr,
				unsubChannelIdStr);
		if (subscriptionHistoryCollection.isEmpty()) {
			return new ResponseEntity<Collection<SubscriptionDTO>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<SubscriptionDTO>>(subscriptionHistoryCollection, HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole(@roles.OWNER_ADMIN)")
	@RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Iterable<SubscriberQueue>> addBulkSubscriptions(@RequestBody @Valid SubscriptionRequestDTO subRequest,
			BindingResult bindingResult, UriComponentsBuilder ucBuilder) {
		BindingErrorsResponse errors = new BindingErrorsResponse();
		HttpHeaders headers = new HttpHeaders();
		if(bindingResult.hasErrors() || (subRequest == null)){
			errors.addAllErrors(bindingResult);
			headers.add("errors", errors.toJSON());
			return new ResponseEntity<Iterable<SubscriberQueue>>(headers, HttpStatus.BAD_REQUEST);
		}
		ArrayList<SubscriberQueue> insertedValues = (ArrayList<SubscriberQueue>) this.contentProviderService.saveBulkSubscriptions(subRequest);
		for (SubscriberQueue subscriberQueueItem: insertedValues) {
			System.out.println("subscriberQueueItem::: " + subscriberQueueItem.getMsisdn());
			System.out.println("dndInsert-date::: " + subscriberQueueItem.getFirstChargedDate());
		}
		// headers.setLocation(ucBuilder.path("/api/blacklist/{id}").buildAndExpand(dndBlacklist.getId()).toUri());
		return new ResponseEntity<Iterable<SubscriberQueue>>(insertedValues, headers, HttpStatus.CREATED);
	}

	/*

	@PreAuthorize("hasRole(@roles.OWNER_ADMIN)")
	@RequestMapping(value = "/daily-aggregated/{startDate}/{endDate}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Collection<ConsolidatedReportRangeDTO>> getDailyAggregatedReport(
			@PathVariable("startDate") String startDateStr, @PathVariable("endDate") String endDateStr,
			@RequestParam(name = "packId", required = false) String packId,
			@RequestParam(name = "pId", required = false) String pId) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = new Date();
		Date endDate = new Date();
		try {
			startDate = sdf.parse(startDateStr);
			endDate = sdf.parse(endDateStr);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		Collection<ConsolidatedReportRangeDTO> reportHourlyCollection = this.contentProviderService
				.findAggregatedDailyReport(startDate, endDate, packId, pId);
		if (reportHourlyCollection.isEmpty()) {
			return new ResponseEntity<Collection<ConsolidatedReportRangeDTO>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<ConsolidatedReportRangeDTO>>(reportHourlyCollection, HttpStatus.OK);
	}*/

}
