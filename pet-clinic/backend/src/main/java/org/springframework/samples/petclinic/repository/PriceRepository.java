package org.springframework.samples.petclinic.repository;

import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.PriceDetails;

public interface PriceRepository {
	Collection<PriceDetails> findByState(int state) throws DataAccessException;

	Collection<PriceDetails> findAll() throws DataAccessException;

}
