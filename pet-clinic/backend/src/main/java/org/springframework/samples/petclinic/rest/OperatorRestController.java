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

import java.util.Collection;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.samples.petclinic.model.Operator;
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
@RequestMapping("/api/operators")
public class OperatorRestController {

	@Autowired
	private ContentProviderService contentProviderService;

	@PreAuthorize( "hasRole(@roles.OWNER_ADMIN)" )
	@RequestMapping(value = "/*/name/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Collection<Operator>> getOperatorsList(@PathVariable("name") String operatorName) {
		if (operatorName == null) {
			operatorName = "";
		}
		Collection<Operator> operators = this.contentProviderService.findOperatorByName(operatorName);
		if (operators.isEmpty()) {
			return new ResponseEntity<Collection<Operator>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<Operator>>(operators, HttpStatus.OK);
	}

    @PreAuthorize( "hasRole(@roles.OWNER_ADMIN)" )
	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Collection<Operator>> getOperators() {
		Collection<Operator> operators = this.contentProviderService.findAllOperators();
		if (operators.isEmpty()) {
			return new ResponseEntity<Collection<Operator>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<Operator>>(operators, HttpStatus.OK);
	}

    @PreAuthorize( "hasRole(@roles.OWNER_ADMIN)" )
	@RequestMapping(value = "/{operatorId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Operator> getOperator(@PathVariable("operatorId") int operatorId) {
		Operator operator = null;
		operator = this.contentProviderService.findOperatorById(operatorId);
		if (operator == null) {
			return new ResponseEntity<Operator>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Operator>(operator, HttpStatus.OK);
	}

    @PreAuthorize( "hasRole(@roles.OWNER_ADMIN)" )
	@RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Operator> addOperator(@RequestBody @Valid Operator operator, BindingResult bindingResult,
			UriComponentsBuilder ucBuilder) {
		BindingErrorsResponse errors = new BindingErrorsResponse();
		HttpHeaders headers = new HttpHeaders();
		if (bindingResult.hasErrors() || (operator == null)) {
			errors.addAllErrors(bindingResult);
			headers.add("errors", errors.toJSON());
			return new ResponseEntity<Operator>(headers, HttpStatus.BAD_REQUEST);
		}
		this.contentProviderService.saveOperator(operator);
		headers.setLocation(ucBuilder.path("/api/operators/{id}").buildAndExpand(operator.getId()).toUri());
		return new ResponseEntity<Operator>(operator, headers, HttpStatus.CREATED);
	}

    @PreAuthorize( "hasRole(@roles.OWNER_ADMIN)" )
	@RequestMapping(value = "/{operatorId}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Operator> updateOperator(@PathVariable("operatorId") int operatorId, @RequestBody @Valid Operator operator,
			BindingResult bindingResult, UriComponentsBuilder ucBuilder) {
		BindingErrorsResponse errors = new BindingErrorsResponse();
		HttpHeaders headers = new HttpHeaders();
		if (bindingResult.hasErrors() || (operator == null)) {
			errors.addAllErrors(bindingResult);
			headers.add("errors", errors.toJSON());
			return new ResponseEntity<Operator>(headers, HttpStatus.BAD_REQUEST);
		}
		Operator currentOperator = this.contentProviderService.findOperatorById(operatorId);
		if (currentOperator == null) {
			return new ResponseEntity<Operator>(HttpStatus.NOT_FOUND);
		}
		currentOperator.setAddress(operator.getAddress());
		currentOperator.setCity(operator.getCity());
		currentOperator.setCountry(operator.getCountry());
		currentOperator.setName(operator.getName());
		currentOperator.setTelephone(operator.getTelephone());
		currentOperator.setEstablishedDate(operator.getEstablishedDate());
		this.contentProviderService.saveOperator(currentOperator);
		return new ResponseEntity<Operator>(currentOperator, HttpStatus.NO_CONTENT);
	}

    @PreAuthorize( "hasRole(@roles.OWNER_ADMIN)" )
	@RequestMapping(value = "/{operatorId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@Transactional
	public ResponseEntity<Void> deleteOperator(@PathVariable("operatorId") int operatorId) {
		Operator operator = this.contentProviderService.findOperatorById(operatorId);
		if (operator == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		this.contentProviderService.deleteOperator(operator);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
