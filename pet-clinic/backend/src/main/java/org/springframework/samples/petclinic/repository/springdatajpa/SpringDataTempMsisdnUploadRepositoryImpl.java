package org.springframework.samples.petclinic.repository.springdatajpa;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.TempMsisdnUpload;

public class SpringDataTempMsisdnUploadRepositoryImpl implements TempMsisdnUploadRepositoryOverride {

	@PersistenceContext
    private EntityManager em;
	
	@Override
	public Collection<TempMsisdnUpload> findMsisdnsNotAvailableInSystem() throws DataAccessException {

		String tempMsisdnUploadQueryStr = "SELECT * from upload_msisdn where "
				+ "msisdn not in (select distinct msisdn from subscriber) "
				+ "and msisdn not in (select distinct msisdn from subscriber_queue) "
				+ "and msisdn not in (select distinct msisdn from subscriber_churn) "
				+ "and msisdn not in (select distinct msisdn from blacklist)";

		Query tempMsisdnUploadQuery = em.createNativeQuery(tempMsisdnUploadQueryStr, TempMsisdnUpload.class);
		
		List<TempMsisdnUpload> reportResult = tempMsisdnUploadQuery.getResultList();
		System.out.println("Result of MSISDN Check Query:" + reportResult);
		
		return reportResult;

	}

}
