package org.springframework.samples.petclinic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "report_hourly")
public class ReportHourly extends BaseEntity {
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date date;
	private int hour;
	@Column(name = "pack_id")
	private int packId;
	@Column(name = "pid")
	private int pId;
	@Column(name = "channel_id")
	private int channelId;
	private double price;
	private int vs;
	@Column(name = "total_clicks")
	private long totalClicks;
	@Column(name = "total_clicks_only_msisdn")
	private long totalClicksOnlyMsisdn;
	@Column(name = "total_clicks_unique_msisdn")
	private long totalClicksUniqueMsisdn;
	@Column(name = "first_conform_pg_visit")
	private long firstConformPgVisit;
	@Column(name = "second_conform_pg_visit")
	private long secondConformPgVisit;
	@Column(name = "sub_request")
	private long subRequest;
	@Column(name = "sub_failed")
	private long subFailed;
	@Column(name = "sub_success")
	private long subSuccess;
	@Column(name = "subretry_failed")
	private long subretryFailed;
	@Column(name = "subretry_success")
	private long subretrySuccess;
	@Column(name = "renewal_failed")
	private long renewalFailed;
	@Column(name = "renewal_success")
	private long renewalSuccess;
	@Column(name = "unsub_request")
	private long unsubRequest;
	@Column(name = "unsub_success")
	private long unsub;
	@Column(name = "churn_subretry")
	private long churnSubRetry;
	@Column(name = "churn_renewal")
	private long churnRenewal;
	private long active;
	private long grace;
	private long suspend;
	@Column(name = "yet_to_renewal_churn")
	private long yetToRenewalChurn;
	@Column(name = "subretry")
	private long subRetry;
	@Column(name = "yet_to_subretry_churn")
	private long yetToSubRetryChurn;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getPackId() {
		return packId;
	}

	public void setPackId(int packId) {
		this.packId = packId;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public int getChannelId() {
		return channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getVs() {
		return vs;
	}

	public void setVs(int vs) {
		this.vs = vs;
	}

	public long getTotalClicks() {
		return totalClicks;
	}

	public void setTotalClicks(long totalClicks) {
		this.totalClicks = totalClicks;
	}

	public long getTotalClicksOnlyMsisdn() {
		return totalClicksOnlyMsisdn;
	}

	public void setTotalClicksOnlyMsisdn(long totalClicksOnlyMsisdn) {
		this.totalClicksOnlyMsisdn = totalClicksOnlyMsisdn;
	}

	public long getTotalClicksUniqueMsisdn() {
		return totalClicksUniqueMsisdn;
	}

	public void setTotalClicksUniqueMsisdn(long totalClicksUniqueMsisdn) {
		this.totalClicksUniqueMsisdn = totalClicksUniqueMsisdn;
	}

	public long getFirstConformPgVisit() {
		return firstConformPgVisit;
	}

	public void setFirstConformPgVisit(long firstConformPgVisit) {
		this.firstConformPgVisit = firstConformPgVisit;
	}

	public long getSecondConformPgVisit() {
		return secondConformPgVisit;
	}

	public void setSecondConformPgVisit(long secondConformPgVisit) {
		this.secondConformPgVisit = secondConformPgVisit;
	}

	public long getSubRequest() {
		return subRequest;
	}

	public void setSubRequest(long subRequest) {
		this.subRequest = subRequest;
	}

	public long getSubFailed() {
		return subFailed;
	}

	public void setSubFailed(long subFailed) {
		this.subFailed = subFailed;
	}

	public long getSubSuccess() {
		return subSuccess;
	}

	public void setSubSuccess(long subSuccess) {
		this.subSuccess = subSuccess;
	}

	public long getSubretryFailed() {
		return subretryFailed;
	}

	public void setSubretryFailed(long subretryFailed) {
		this.subretryFailed = subretryFailed;
	}

	public long getSubretrySuccess() {
		return subretrySuccess;
	}

	public void setSubretrySuccess(long subretrySuccess) {
		this.subretrySuccess = subretrySuccess;
	}

	public long getRenewalFailed() {
		return renewalFailed;
	}

	public void setRenewalFailed(long renewalFailed) {
		this.renewalFailed = renewalFailed;
	}

	public long getRenewalSuccess() {
		return renewalSuccess;
	}

	public void setRenewalSuccess(long renewalSuccess) {
		this.renewalSuccess = renewalSuccess;
	}

	public long getUnsubRequest() {
		return unsubRequest;
	}

	public void setUnsubRequest(long unsubRequest) {
		this.unsubRequest = unsubRequest;
	}

	public long getUnsub() {
		return unsub;
	}

	public void setUnsub(long unsub) {
		this.unsub = unsub;
	}

	public long getChurnSubRetry() {
		return churnSubRetry;
	}

	public void setChurnSubRetry(long churnSubRetry) {
		this.churnSubRetry = churnSubRetry;
	}

	public long getChurnRenewal() {
		return churnRenewal;
	}

	public void setChurnRenewal(long churnRenewal) {
		this.churnRenewal = churnRenewal;
	}

	public long getActive() {
		return active;
	}

	public void setActive(long active) {
		this.active = active;
	}

	public long getGrace() {
		return grace;
	}

	public void setGrace(long grace) {
		this.grace = grace;
	}

	public long getSuspend() {
		return suspend;
	}

	public void setSuspend(long suspend) {
		this.suspend = suspend;
	}

	public long getSubRetry() {
		return subRetry;
	}

	public void setSubRetry(long subRetry) {
		this.subRetry = subRetry;
	}

	public long getYetToRenewalChurn() {
		return yetToRenewalChurn;
	}

	public void setYetToRenewalChurn(long yetToRenewalChurn) {
		this.yetToRenewalChurn = yetToRenewalChurn;
	}

	public long getYetToSubRetryChurn() {
		return yetToSubRetryChurn;
	}

	public void setYetToSubRetryChurn(long yetToSubRetryChurn) {
		this.yetToSubRetryChurn = yetToSubRetryChurn;
	}
}
