/*
 * Copyright 2016-2018 the original author or authors.
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.samples.petclinic.model.DndBlacklist;
import org.springframework.samples.petclinic.service.ContentProviderService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * @author Vitaliy Fedoriv
 *
 */

@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")
@RequestMapping("api/blacklist")
public class DndRestController {

	@Autowired
	private ContentProviderService contentProviderService;

	@PreAuthorize("hasRole(@roles.OWNER_ADMIN)")
	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Collection<DndBlacklist>> getAllDndBlacklist() {
		Collection<DndBlacklist> dndBlacklists = new ArrayList<DndBlacklist>();
		dndBlacklists.addAll(this.contentProviderService.findAllDndBlacklist());
		if (dndBlacklists.isEmpty()) {
			return new ResponseEntity<Collection<DndBlacklist>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<DndBlacklist>>(dndBlacklists, HttpStatus.OK);
	}

	@PreAuthorize("hasRole(@roles.OWNER_ADMIN)")
	@RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Iterable<DndBlacklist>> addDndBlacklist(@RequestBody @Valid String csvBlackListStr,
			BindingResult bindingResult, UriComponentsBuilder ucBuilder) {
		BindingErrorsResponse errors = new BindingErrorsResponse();
		HttpHeaders headers = new HttpHeaders();
		if (bindingResult.hasErrors() || (csvBlackListStr == null)) {
			errors.addAllErrors(bindingResult);
			headers.add("errors", errors.toJSON());
			return new ResponseEntity<Iterable<DndBlacklist>>(headers, HttpStatus.BAD_REQUEST);
		}
		ArrayList<DndBlacklist> insertedValues = (ArrayList<DndBlacklist>) this.contentProviderService.saveDndBlacklist(csvBlackListStr);
		for (DndBlacklist dndInsert: insertedValues) {
			System.out.println("dndInsert::: " + dndInsert.getMsisdn());
			System.out.println("dndInsert-date::: " + dndInsert.getCreatedDate());
		}
		// headers.setLocation(ucBuilder.path("/api/blacklist/{id}").buildAndExpand(dndBlacklist.getId()).toUri());
		return new ResponseEntity<Iterable<DndBlacklist>>(insertedValues, headers, HttpStatus.CREATED);
	}

	@PreAuthorize("hasRole(@roles.OWNER_ADMIN)")
	@RequestMapping(value = "/add/{msisdn}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@Transactional
	public ResponseEntity<DndBlacklist> addSingleDndBlacklist(@PathVariable("msisdn") long msisdn) {
		DndBlacklist dndBlacklist = new DndBlacklist();
		dndBlacklist.setMsisdn(msisdn);
		dndBlacklist.setCreatedDate(new Date());

		DndBlacklist insertedValue = this.contentProviderService.saveDndBlacklist(dndBlacklist);
		System.out.println("insertedValue::: " + insertedValue.getMsisdn());
		System.out.println("insertedValue-date::: " + insertedValue.getCreatedDate());
		return new ResponseEntity<DndBlacklist>(dndBlacklist, HttpStatus.CREATED);
	}

	@PreAuthorize("hasRole(@roles.OWNER_ADMIN)")
	@RequestMapping(value = "/delete{msisdn}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@Transactional
	public ResponseEntity<Void> deleteDndBlacklist(@PathVariable("msisdn") long msisdn) {
		DndBlacklist dndBlacklist = this.contentProviderService.findDndBlacklistByMsisdn(msisdn);
		if (dndBlacklist == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		this.contentProviderService.deleteDndBlacklist(dndBlacklist);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
