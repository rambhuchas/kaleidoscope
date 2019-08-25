package org.springframework.samples.petclinic.model;

import java.util.Date;

public class ConsolidatedReportRangeDTO {
	private Date date;
	private long totalClicks;
	private long totalClicksOnlyMsisdn;
	private long totalClicksUniqueMsisdn;
	private long firstConformPgVisit;
	private long secondConformPgVisit;
	private long subRequest;
	private long subFailed;
	private long subSuccess;
	private double subRevenue;//TODO - SUM(sub_success * price) sub_revenue
	private long subretryFailed;
	private long subretrySuccess;
	private double subretryRevenue;//TODO - SUM(subretry_success * price)
	private long renewalFailed;
	private long renewalSuccess;
	private double renewalRevenue;//TODO - SUM(renewal_success * price) renewal_revenue
	private double totalRevenue;//TODO - (SUM(sub_success * price) + SUM(subretry_success * price) + SUM(renewal_success * price)) total_revenue
	private long unsubRequest;
	private long unsub;
	private long churnSubRetry;
	private long churnRenewal;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
	public double getSubRevenue() {
		return subRevenue;
	}
	public void setSubRevenue(double subRevenue) {
		this.subRevenue = subRevenue;
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
	public double getSubretryRevenue() {
		return subretryRevenue;
	}
	public void setSubretryRevenue(double subretryRevenue) {
		this.subretryRevenue = subretryRevenue;
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
	public double getRenewalRevenue() {
		return renewalRevenue;
	}
	public void setRenewalRevenue(double renewalRevenue) {
		this.renewalRevenue = renewalRevenue;
	}
	public double getTotalRevenue() {
		return totalRevenue;
	}
	public void setTotalRevenue(double totalRevenue) {
		this.totalRevenue = totalRevenue;
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
	public ConsolidatedReportRangeDTO(Date date, long totalClicks, long totalClicksOnlyMsisdn,
			long totalClicksUniqueMsisdn, long firstConformPgVisit, long secondConformPgVisit, long subRequest,
			long subFailed, long subSuccess, double subRevenue, long subretryFailed, long subretrySuccess,
			double subretryRevenue, long renewalFailed, long renewalSuccess, double renewalRevenue, double totalRevenue,
			long unsubRequest, long unsub, long churnSubRetry, long churnRenewal) {
		super();
		this.date = date;
		this.totalClicks = totalClicks;
		this.totalClicksOnlyMsisdn = totalClicksOnlyMsisdn;
		this.totalClicksUniqueMsisdn = totalClicksUniqueMsisdn;
		this.firstConformPgVisit = firstConformPgVisit;
		this.secondConformPgVisit = secondConformPgVisit;
		this.subRequest = subRequest;
		this.subFailed = subFailed;
		this.subSuccess = subSuccess;
		this.subRevenue = subRevenue;
		this.subretryFailed = subretryFailed;
		this.subretrySuccess = subretrySuccess;
		this.subretryRevenue = subretryRevenue;
		this.renewalFailed = renewalFailed;
		this.renewalSuccess = renewalSuccess;
		this.renewalRevenue = renewalRevenue;
		this.totalRevenue = totalRevenue;
		this.unsubRequest = unsubRequest;
		this.unsub = unsub;
		this.churnSubRetry = churnSubRetry;
		this.churnRenewal = churnRenewal;
	}

}

//
//Ad Agency Report
//
//private long churn;//TODO - This is for Ad Agency Report
//private String crDt;//TODO - This is for Ad Agency Report
//private String prodDesc;//TODO - This is for Ad Agency Report
//


/*
DATE,
SUM(total_clicks) total_clicks,
SUM(total_clicks_only_msisdn) total_clicks_only_msisdn,
SUM(total_clicks_unique_msisdn) total_clicks_unique_msisdn,
SUM(first_conform_pg_visit) first_conform_pg_visit,
SUM(second_conform_pg_visit) second_conform_pg_visit,
SUM(sub_failed) sub_failed,
SUM(sub_request) sub_request,
SUM(sub_success) sub_success,
SUM(sub_success * price) sub_revenue,
SUM(subretry_failed) subretry_failed,
SUM(subretry_success) subretry_success,
SUM(subretry_success * price) subretry_revenue,
SUM(renewal_failed) renewal_failed,
SUM(renewal_success) renewal_success,
SUM(renewal_success * price) renewal_revenue,
(
    SUM(sub_success * price) + SUM(subretry_success * price) + SUM(renewal_success * price)
) total_revenue,
SUM(unsub_request) unsub_request,
SUM(unsub_success) unsub_success,
SUM(churn_subretry) churn_subretry,
SUM(churn_renewal) churn_renewal 
*/

