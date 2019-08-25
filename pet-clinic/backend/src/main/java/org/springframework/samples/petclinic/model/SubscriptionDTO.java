package org.springframework.samples.petclinic.model;

import java.util.Date;

public class SubscriptionDTO {
	private Date operationDate;// Subsciprtion Audit

	// Common for Sub Audit and MSISDN History starts
	private int action;
	private String prodName;// Churn
	private String subChannelName;// Churn
	private double amountCharged;
	private int lastValidity;
	private Date expiryDate;
	private String lastTransactionId;
	private String lastTransactionResponse;
	private Date requestDate;
	// Common for Sub Audit and MSISDN History ends

	// MSISDN History with Unsub Option starts
	private String status;
	private long msisdn;// Churn
	private int packId;
	private int pid;
	private double totalChargedTillNow;
	private Date firstChargedDate;
	private Date lastChargeTriedDate;
	// MSISDN History with Unsub Option ends

	private int subChannelId;// Churn
	private int unsubChannelId;// Churn
	private String unsubChannelName;// Churn
	private int totalReTriedTillNow;
	private String churnType;
	private Date churnedDate;
	private int viaSub;
	private String auditActionDesc;

	private static final int GRACE_PERIOD = 1 * (24 * 60 * 60 * 1000); // 1 day

	public Date getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}

	public int getAction() {
		return action;
	}

	public void setAction(int action) {
		this.action = action;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getSubChannelName() {
		return subChannelName;
	}

	public void setSubChannelName(String subChannelName) {
		this.subChannelName = subChannelName;
	}

	public double getAmountCharged() {
		return amountCharged;
	}

	public void setAmountCharged(double amountCharged) {
		this.amountCharged = amountCharged;
	}

	public int getLastValidity() {
		return lastValidity;
	}

	public void setLastValidity(int lastValidity) {
		this.lastValidity = lastValidity;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getLastTransactionId() {
		return lastTransactionId;
	}

	public void setLastTransactionId(String lastTransactionId) {
		this.lastTransactionId = lastTransactionId;
	}

	public String getLastTransactionResponse() {
		return lastTransactionResponse;
	}

	public void setLastTransactionResponse(String lastTransactionResponse) {
		this.lastTransactionResponse = lastTransactionResponse;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(long msisdn) {
		this.msisdn = msisdn;
	}

	public int getPackId() {
		return packId;
	}

	public void setPackId(int packId) {
		this.packId = packId;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public double getTotalChargedTillNow() {
		return totalChargedTillNow;
	}

	public void setTotalChargedTillNow(double totalChargedTillNow) {
		this.totalChargedTillNow = totalChargedTillNow;
	}

	public Date getFirstChargedDate() {
		return firstChargedDate;
	}

	public void setFirstChargedDate(Date firstChargedDate) {
		this.firstChargedDate = firstChargedDate;
	}

	public Date getLastChargeTriedDate() {
		return lastChargeTriedDate;
	}

	public void setLastChargeTriedDate(Date lastChargeTriedDate) {
		this.lastChargeTriedDate = lastChargeTriedDate;
	}

	public int getSubChannelId() {
		return subChannelId;
	}

	public void setSubChannelId(int subChannelId) {
		this.subChannelId = subChannelId;
	}

	public int getUnsubChannelId() {
		return unsubChannelId;
	}

	public void setUnsubChannelId(int unsubChannelId) {
		this.unsubChannelId = unsubChannelId;
	}

	public String getUnsubChannelName() {
		return unsubChannelName;
	}

	public void setUnsubChannelName(String unsubChannelName) {
		this.unsubChannelName = unsubChannelName;
	}

	public int getTotalReTriedTillNow() {
		return totalReTriedTillNow;
	}

	public void setTotalReTriedTillNow(int totalReTriedTillNow) {
		this.totalReTriedTillNow = totalReTriedTillNow;
	}

	public String getChurnType() {
		return churnType;
	}

	public void setChurnType(String churnType) {
		this.churnType = churnType;
	}

	public Date getChurnedDate() {
		return churnedDate;
	}

	public void setChurnedDate(Date churnedDate) {
		this.churnedDate = churnedDate;
	}

	public int getViaSub() {
		return viaSub;
	}

	public void setViaSub(int viaSub) {
		this.viaSub = viaSub;
	}

	public String getAuditActionDesc() {
		return auditActionDesc;
	}

	public void setAuditActionDesc(String auditActionDesc) {
		this.auditActionDesc = auditActionDesc;
	}

	public SubscriptionDTO(Date operationDate, int action, String prodName, String subChannelName, double amountCharged,
			int lastValidity, Date expiryDate, String lastTransactionId, String lastTransactionResponse,
			Date requestDate, String status, long msisdn, int packId, int pid, double totalChargedTillNow,
			Date firstChargedDate, Date lastChargeTriedDate, int subChannelId, int unsubChannelId,
			String unsubChannelName, int totalReTriedTillNow, String churnType, Date churnedDate, int viaSub) {
		this.operationDate = operationDate;
		this.action = action;
		this.prodName = prodName;
		this.subChannelName = subChannelName;
		this.amountCharged = amountCharged;
		this.lastValidity = lastValidity;
		this.expiryDate = expiryDate;
		this.lastTransactionId = lastTransactionId;
		this.lastTransactionResponse = lastTransactionResponse;
		this.requestDate = requestDate;
		this.status = status;
		this.msisdn = msisdn;
		this.packId = packId;
		this.pid = pid;
		this.totalChargedTillNow = totalChargedTillNow;
		this.firstChargedDate = firstChargedDate;
		this.lastChargeTriedDate = lastChargeTriedDate;
		this.subChannelId = subChannelId;
		this.unsubChannelId = unsubChannelId;
		this.unsubChannelName = unsubChannelName;
		this.totalReTriedTillNow = totalReTriedTillNow;
		this.churnType = churnType;
		this.churnedDate = churnedDate;
		this.viaSub = viaSub;
		// status is blank - not determined in the query
		if ("".equalsIgnoreCase(this.status) && this.firstChargedDate != null && this.expiryDate != null) {
			long diff = expiryDate.getTime() - new Date().getTime();

			if (diff > 0) {
				// Expiry Date greater than Current Date
				this.status = "Active";
			} else if (Math.abs(diff) < GRACE_PERIOD) {
				// Expiry Date within grace period
				this.status = "Grace";
			} else {
				// Expiry Date lapsed the grace period
				this.status = "Suspended";
			}
		}
	}

	public SubscriptionDTO(Date operationDate, int action, String prodName, String subChannelName, double amountCharged,
			int lastValidity, Date expiryDate, String lastTransactionId, String lastTransactionResponse,
			Date requestDate, String status, long msisdn, int packId, int pid, double totalChargedTillNow,
			Date firstChargedDate, Date lastChargeTriedDate, int subChannelId, int unsubChannelId,
			String unsubChannelName, int totalReTriedTillNow, String churnType, Date churnedDate, int viaSub,
			String auditActionDesc) {
		this(operationDate, action, prodName, subChannelName, amountCharged, lastValidity, expiryDate,
				lastTransactionId, lastTransactionResponse, requestDate, status, msisdn, packId, pid,
				totalChargedTillNow, firstChargedDate, lastChargeTriedDate, subChannelId, unsubChannelId,
				unsubChannelName, totalReTriedTillNow, churnType, churnedDate, viaSub);
		this.auditActionDesc = auditActionDesc;
	}

	public SubscriptionDTO(long msisdn, String prodName, String churnType, String subChannelName,
			String unsubChannelName, int lastValidity, double amountCharged, Date expiryDate,
			double totalChargedTillNow, Date requestDate, Date firstChargedDate, Date churnedDate, int viaSub) {
		this.msisdn = msisdn;
		this.prodName = prodName;
		this.churnType = churnType;
		this.subChannelName = subChannelName;
		this.unsubChannelName = unsubChannelName;
		this.lastValidity = lastValidity;
		this.amountCharged = amountCharged;
		this.expiryDate = expiryDate;
		this.totalChargedTillNow = totalChargedTillNow;
		this.requestDate = requestDate;
		this.firstChargedDate = firstChargedDate;
		this.churnedDate = churnedDate;
		this.viaSub = viaSub;
	}
}
