package org.springframework.samples.petclinic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "subscriber_churn")
public class SubscriberChurn extends AbstractSubscriber {

	@Column(name = "churn_channel_id")
	private int churnChannelId;

	@Column(name = "churn_dt")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date churnDate;

	@Column(name = "churn_type")
	private int churnType;

	// Not used
	@Column(name = "credit_dt")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date creditDate;

	@Column(name = "end_dt")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date endDate;

	@Column(name = "last_amt_charged")
	private double lastAmountCharged;

	@Column(name = "last_validity")
	private int lastValidity;

	@Column(name = "req_dt")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date reqDate;

	@Column(name = "sub_channel_id")
	private int subscriptionChannelId;

	@Column(name = "till_got")
	private double tillGot;

	@Column(name = "total_credit")
	private int totalCredit;

	public int getChurnChannelId() {
		return churnChannelId;
	}

	public void setChurnChannelId(int churnChannelId) {
		this.churnChannelId = churnChannelId;
	}

	public Date getChurnDate() {
		return churnDate;
	}

	public void setChurnDate(Date churnDate) {
		this.churnDate = churnDate;
	}

	public int getChurnType() {
		return churnType;
	}

	public void setChurnType(int churnType) {
		this.churnType = churnType;
	}

	public Date getCreditDate() {
		return creditDate;
	}

	public void setCreditDate(Date creditDate) {
		this.creditDate = creditDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public double getLastAmountCharged() {
		return lastAmountCharged;
	}

	public void setLastAmountCharged(double lastAmountCharged) {
		this.lastAmountCharged = lastAmountCharged;
	}

	public int getLastValidity() {
		return lastValidity;
	}

	public void setLastValidity(int lastValidity) {
		this.lastValidity = lastValidity;
	}

	public Date getReqDate() {
		return reqDate;
	}

	public void setReqDate(Date reqDate) {
		this.reqDate = reqDate;
	}

	public int getSubscriptionChannelId() {
		return subscriptionChannelId;
	}

	public void setSubscriptionChannelId(int subscriptionChannelId) {
		this.subscriptionChannelId = subscriptionChannelId;
	}

	public double getTillGot() {
		return tillGot;
	}

	public void setTillGot(double tillGot) {
		this.tillGot = tillGot;
	}

	public int getTotalCredit() {
		return totalCredit;
	}

	public void setTotalCredit(int totalCredit) {
		this.totalCredit = totalCredit;
	}

}
