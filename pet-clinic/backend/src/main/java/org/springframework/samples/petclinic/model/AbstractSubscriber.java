package org.springframework.samples.petclinic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@MappedSuperclass
public abstract class AbstractSubscriber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="subs_id")
	private long subsId;
    
	private int catid;

	@Column(name="cr_dt")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date firstChargedDate;

	private long msisdn;
	
	@Column(name="pack_id")
	private int packId;
	
	private int pid;
	
	@Column(name="sms_flg")
	private int smsFlg;
	
	@Column(name="subs_type")
	private int subsType;

	private String temp;
	
	@Column(name="trans_id")
	private String transId;
	
	@Column(name="trans_resp")
	private String transResp;
	
	@Column(name="via_sub")
	private int viaSub;

	public long getSubsId() {
		return subsId;
	}

	public void setSubsId(long subsId) {
		this.subsId = subsId;
	}

	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public Date getFirstChargedDate() {
		return firstChargedDate;
	}

	public void setFirstChargedDate(Date firstChargedDate) {
		this.firstChargedDate = firstChargedDate;
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

	public int getSmsFlg() {
		return smsFlg;
	}

	public void setSmsFlg(int smsFlg) {
		this.smsFlg = smsFlg;
	}

	public int getSubsType() {
		return subsType;
	}

	public void setSubsType(int subsType) {
		this.subsType = subsType;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public String getTransResp() {
		return transResp;
	}

	public void setTransResp(String transResp) {
		this.transResp = transResp;
	}

	public int getViaSub() {
		return viaSub;
	}

	public void setViaSub(int viaSub) {
		this.viaSub = viaSub;
	}

}