package org.springframework.samples.petclinic.repository.springdatajpa;

import java.util.Collection;

import org.springframework.samples.petclinic.model.SmsDTO;

public interface SmsRepositoryOverride {
	Collection<SmsDTO> findSmsMO(String msisdnStr, String startDateStr, String endDateStr);

	Collection<SmsDTO> findSmsMT(String msisdnStr, String startDateStr, String endDateStr);

}
