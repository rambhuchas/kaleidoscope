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
import org.springframework.samples.petclinic.model.AuditVisitDTO;
import org.springframework.samples.petclinic.model.Product;
import org.springframework.samples.petclinic.service.ContentProviderService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vitaliy Fedoriv
 *
 */

@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")
@RequestMapping("/api/products")
public class ProductRestController {

	@Autowired
	private ContentProviderService contentProviderService;

    @PreAuthorize( "hasRole(@roles.OWNER_ADMIN)" )
	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Collection<Product>> getOperators() {
		Collection<Product> operators = this.contentProviderService.findAllProducts();
		if (operators.isEmpty()) {
			return new ResponseEntity<Collection<Product>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<Product>>(operators, HttpStatus.OK);
	}

    @PreAuthorize( "hasRole(@roles.OWNER_ADMIN)" )
	@RequestMapping(value = "/active", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Collection<Product>> getActiveProducts() {
		Collection<Product> products = this.contentProviderService.findActiveProducts();
		if (products.isEmpty()) {
			return new ResponseEntity<Collection<Product>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<Product>>(products, HttpStatus.OK);
	}


    @PreAuthorize( "hasRole(@roles.OWNER_ADMIN)" )
	@RequestMapping(value = "/visits/{msisdn}/{startDate}/{endDate}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Collection<AuditVisitDTO>> getAuditVisits(@PathVariable("startDate") String startDateStr, @PathVariable("endDate") String endDateStr,
			@PathVariable(name = "msisdn") String msisdn) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = new Date();
		Date endDate = new Date();
		try {
			startDate = sdf.parse(startDateStr);
			endDate = sdf.parse(endDateStr);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		Collection<AuditVisitDTO> auditVisits = this.contentProviderService.findAuditVisitDetails(msisdn, startDate, endDate);
		if (auditVisits.isEmpty()) {
			return new ResponseEntity<Collection<AuditVisitDTO>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<AuditVisitDTO>>(auditVisits, HttpStatus.OK);
	}
}
