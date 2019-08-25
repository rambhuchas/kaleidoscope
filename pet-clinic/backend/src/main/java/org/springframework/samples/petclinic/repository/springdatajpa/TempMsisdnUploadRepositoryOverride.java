package org.springframework.samples.petclinic.repository.springdatajpa;

import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.TempMsisdnUpload;

public interface TempMsisdnUploadRepositoryOverride {
	Collection<TempMsisdnUpload> findMsisdnsNotAvailableInSystem() throws DataAccessException;
}
