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
import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.samples.petclinic.model.ConsolidatedReportRangeDTO;
import org.springframework.samples.petclinic.model.ReportHourly;
import org.springframework.samples.petclinic.service.ContentProviderService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vitaliy Fedoriv
 *
 */

@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")
@RequestMapping("/api/report")
public class ReportRestController {

	@Autowired
	private ContentProviderService contentProviderService;

	@PreAuthorize("hasRole(@roles.OWNER_ADMIN)")
	@RequestMapping(value = "/hourly", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Collection<ReportHourly>> getAllReport() {

		Collection<ReportHourly> reportHourlyCollection = this.contentProviderService.findAllReportHourly();
		if (reportHourlyCollection.isEmpty()) {
			return new ResponseEntity<Collection<ReportHourly>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<ReportHourly>>(reportHourlyCollection, HttpStatus.OK);
	}

	@PreAuthorize("hasRole(@roles.OWNER_ADMIN)")
	@RequestMapping(value = "/daily/{startDate}/{endDate}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Collection<ReportHourly>> getDailyReport(@PathVariable("startDate") String startDateStr,
			@PathVariable("endDate") String endDateStr) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = new Date();
		Date endDate = new Date();
		try {
			startDate = sdf.parse(startDateStr);
			endDate = sdf.parse(endDateStr);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		Collection<ReportHourly> reportHourlyCollection = this.contentProviderService.findAllDailyReport(startDate,
				endDate);
		if (reportHourlyCollection.isEmpty()) {
			return new ResponseEntity<Collection<ReportHourly>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<ReportHourly>>(reportHourlyCollection, HttpStatus.OK);
	}

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
	}
	
	//https://stackoverflow.com/questions/29085295/spring-mvc-restcontroller-and-redirect?noredirect=1&lq=1
	/*
	@RestController
	public class FooController {

	  @RequestMapping("/foo")
	  void handleFoo(HttpServletResponse response) throws IOException {
	    response.sendRedirect("some-url");
	  }

	}
	*/
	
	//Pure Spring way without HTTP objects
	/*
	HttpHeaders headers = new HttpHeaders();
	headers.setLocation(URI.create(newUrl));
	return new ResponseEntity<>(headers, HttpStatus.MOVED_PERMANENTLY); 
	*/

}
