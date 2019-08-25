package org.springframework.samples.petclinic.model;

import java.util.Date;

public class SmsDTO {
	private long msisdn;
	private String smsMessage;
	private String shortCode;// int - audit_mo; string - sms_queue
	private Date createdDate;// date - audit_mo
	private String state;// sms_queue only smsVO.getState()==2?"Sent":"Not Sent"
	private boolean mobileOriginatedMessage;// sms_queue only smsVO.getState()==2?"Sent":"Not Sent"

	public SmsDTO(long msisdn, String smsMessage, int shortCode, Date createdDate, String state,
			boolean mobileOriginatedMessage) {
		this(msisdn, smsMessage, shortCode+"", createdDate, state, mobileOriginatedMessage);
	}

	public SmsDTO(long msisdn, String smsMessage, String shortCode, Date createdDate, String state,
			boolean mobileOriginatedMessage) {
		this.msisdn = msisdn;
		this.smsMessage = smsMessage;
		this.shortCode = shortCode;
		this.createdDate = createdDate;
		this.state = state;
		this.mobileOriginatedMessage = mobileOriginatedMessage;
	}

	public long getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(long msisdn) {
		this.msisdn = msisdn;
	}

	public String getSmsMessage() {
		return smsMessage;
	}

	public void setSmsMessage(String smsMessage) {
		this.smsMessage = smsMessage;
	}

	public String getShortCode() {
		return shortCode;
	}

	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public boolean isMobileOriginatedMessage() {
		return mobileOriginatedMessage;
	}

	public void setMobileOriginatedMessage(boolean mobileOriginatedMessage) {
		this.mobileOriginatedMessage = mobileOriginatedMessage;
	}

}
