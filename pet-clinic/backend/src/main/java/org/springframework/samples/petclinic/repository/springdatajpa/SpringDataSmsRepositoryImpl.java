package org.springframework.samples.petclinic.repository.springdatajpa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.context.annotation.Profile;
import org.springframework.samples.petclinic.model.SmsDTO;

@Profile("spring-data-jpa")
public class SpringDataSmsRepositoryImpl implements SmsRepositoryOverride {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Collection<SmsDTO> findSmsMO(String msisdnStr, String startDateStr, String endDateStr) {
		String smsMoQueryStr = "select " 
				+ "new org.springframework.samples.petclinic.model.SmsDTO("
				+ "smsMo.msisdn, " 
				+ "smsMo.smsMessage, " 
				+ "smsMo.shortCode, " 
				+ "smsMo.createdDate, "
				+ "'Received', " 
				+ "true" 
				+ ") " 
				+ "from SmsMO smsMo "
				+ "where 1=1 ";

		// OPTIONAL search conditions are added
		if (msisdnStr != null && !"".equals(msisdnStr)) {
			smsMoQueryStr = smsMoQueryStr + "AND smsMo.msisdn >= :msisdn ";
		}
		if (startDateStr != null && !"".equals(startDateStr)) {
			smsMoQueryStr = smsMoQueryStr + "AND smsMo.createdDate >= :createdDate ";
		}
		if (endDateStr != null && !"".equals(endDateStr)) {
			smsMoQueryStr = smsMoQueryStr + "AND smsMo.createdDate <= :endDate ";
		}

		// Util
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		TypedQuery<SmsDTO> smsMoQuery = em.createQuery(smsMoQueryStr, SmsDTO.class);
		// OPTIONAL search values are passed
		if (msisdnStr != null && !"".equals(msisdnStr)) {
			smsMoQuery.setParameter("msisdn", Long.valueOf(msisdnStr));
		}
		try {
			if (startDateStr != null && !"".equals(startDateStr)) {
				smsMoQuery.setParameter("createdDate", sdf.parse(startDateStr));
			}
			if (endDateStr != null && !"".equals(endDateStr)) {
				smsMoQuery.setParameter("endDate", sdf.parse(endDateStr));
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		List<SmsDTO> smsDTOs = smsMoQuery.getResultList();
		return smsDTOs;
	}

	@Override
	public Collection<SmsDTO> findSmsMT(String msisdnStr, String startDateStr, String endDateStr) {
		String smsMtQueryStr = "select " 
				+ "new org.springframework.samples.petclinic.model.SmsDTO("
				+ "smsMt.msisdn, " 
				+ "smsMt.smsMessage, " 
				+ "smsMt.shortCode, " 
				+ "smsMt.createdDate, "
				+ "CASE WHEN (smsMt.state = 2) THEN 'Sent' ELSE 'Not Sent' END, " 
				+ "false" 
				+ ") " 
				+ "from SmsMT smsMt "
				+ "where 1=1 ";

		// OPTIONAL search conditions are added
		if (msisdnStr != null && !"".equals(msisdnStr)) {
			smsMtQueryStr = smsMtQueryStr + "AND smsMt.msisdn >= :msisdn ";
		}
		if (startDateStr != null && !"".equals(startDateStr)) {
			smsMtQueryStr = smsMtQueryStr + "AND smsMt.createdDate >= :createdDate ";
		}
		if (endDateStr != null && !"".equals(endDateStr)) {
			smsMtQueryStr = smsMtQueryStr + "AND smsMt.createdDate <= :endDate ";
		}

		// Util
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		TypedQuery<SmsDTO> smsMtQuery = em.createQuery(smsMtQueryStr, SmsDTO.class);
		// OPTIONAL search values are passed
		if (msisdnStr != null && !"".equals(msisdnStr)) {
			smsMtQuery.setParameter("msisdn", Long.valueOf(msisdnStr));
		}
		try {
			if (startDateStr != null && !"".equals(startDateStr)) {
				smsMtQuery.setParameter("createdDate", sdf.parse(startDateStr));
			}
			if (endDateStr != null && !"".equals(endDateStr)) {
				smsMtQuery.setParameter("endDate", sdf.parse(endDateStr));
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		List<SmsDTO> smsDTOs = smsMtQuery.getResultList();
		return smsDTOs;
	}

}
