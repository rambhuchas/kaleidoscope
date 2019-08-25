package org.springframework.samples.petclinic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "subscriber")
public class Subscriber extends AbstractSubscriber {
	@Column(name = "amt_charged")
	private double amountCharged;

	@Column(name = "amt_charged_credit")
	private double amtChargedCredit;

	@Column(name="channel_id")
	private int channelId;

	// Not used
	@Column(name = "credit_dt")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date creditDate;

	@Column(name = "end_dt")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date endDate;

	@Column(name = "mod_dt")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date modDate;

	@Column(name = "req_dt")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date reqDate;

	private int state;

	@Column(name = "till_got")
	private double tillGot;

	@Column(name = "total_credit")
	private int totalCredit;

	private int validity;

	//This is used in the View
	/*private int action;

	public int getAction() {
		return action;
	}

	public void setAction(int action) {
		this.action = action;
	}*/

	public double getAmountCharged() {
		return amountCharged;
	}

	public void setAmountCharged(double amountCharged) {
		this.amountCharged = amountCharged;
	}

	public double getAmtChargedCredit() {
		return amtChargedCredit;
	}

	public void setAmtChargedCredit(double amtChargedCredit) {
		this.amtChargedCredit = amtChargedCredit;
	}

	public int getChannelId() {
		return channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
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

	public Date getModDate() {
		return modDate;
	}

	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}

	public Date getReqDate() {
		return reqDate;
	}

	public void setReqDate(Date reqDate) {
		this.reqDate = reqDate;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
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

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

}
