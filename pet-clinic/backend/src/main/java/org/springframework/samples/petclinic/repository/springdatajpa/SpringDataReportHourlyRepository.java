/*
 * Copyright 2002-2013 the original author or authors.
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

import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.Repository;
import org.springframework.samples.petclinic.model.ReportHourly;
import org.springframework.samples.petclinic.repository.ReportHourlyRepository;
import org.springframework.samples.petclinic.repository.VetRepository;

/**
 * Spring Data JPA specialization of the {@link VetRepository} interface
 *
 * @author Michael Isvy
 * @since 15.1.2013
 */

@Profile("spring-data-jpa")
public interface SpringDataReportHourlyRepository
		extends ReportHourlyRepository, Repository<ReportHourly, Integer>, ReportHourlyRepositoryOverride {

    /**
     * Retrieve <code>ReportHourly</code>s from the data store, returning all ReportHourly 
     *
     * @return a <code>Collection</code> of <code>ReportHourly</code>s (or an empty <code>Collection</code> if none
     * found)
     */
	/*
	Date date, long totalClicks, long totalClicksOnlyMsisdn,
			long totalClicksUniqueMsisdn, long firstConformPgVisit, long secondConformPgVisit, long subRequest,
			long subFailed, long subSuccess, double subRevenue, long subretryFailed, long subretrySuccess,
			double subretryRevenue, long renewalFailed, long renewalSuccess, double renewalRevenue, double totalRevenue,
			long unsubRequest, long unsub, long churnSubRetry, long churnRenewal 
	*/
	/*
	@Query("SELECT " +
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
	           + "AND repperhr.date <= :endDate  "
	           + "GROUP BY "
	           + "repperhr.date")
	*/
	//Collection<ConsolidatedReportRangeDTO> findConsolidatedReportRange(@Param("startDate") Date startDate,
	//		@Param("endDate") Date endDate) throws DataAccessException;
}
