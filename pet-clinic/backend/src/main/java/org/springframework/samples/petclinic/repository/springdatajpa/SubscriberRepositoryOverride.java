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

import org.springframework.context.annotation.Profile;
import org.springframework.samples.petclinic.model.SubscriptionDTO;

/**
 * @author Vitaliy Fedoriv
 *
 */

@Profile("spring-data-jpa")
public interface SubscriberRepositoryOverride {

	Collection<SubscriptionDTO> findSubscriptionStatus(String msisdn);

	Collection<SubscriptionDTO> findSubscriptionQueueStatus(String msisdn);

	Collection<SubscriptionDTO> findSubscriptionHistory(String msisdn, Date startDate, Date endDate);

	Collection<SubscriptionDTO> findSubscriptionChurn(String packId, String pid, String churnStartDate,
			String churnEndDate, String subStartDate, String subEndDate, String msisdn, String churnType, String subChannelId,
			String unsubChannelId);
}
