package org.springframework.samples.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "price_points")
public class PriceDetails extends BaseEntity {

	private int ppid;
	
    @Column(name = "service_num")
	private int serviceNum;
    
	@Column(name = "price_desc")
	private String priceDesc;

	private double price;
    
	@Column(name = "price_alias")
	private double priceAlias;
	
	@Column(name = "price_currency")
	private String priceCurrency;
    
	private int validity;
	
	@Column(name = "validity_term")
	private String validityTerm;
    
	@Column(name = "validity_desc")
	private String validityDesc;
    
	@Column(name = "temp_price")
	private String tempPrice;

	private int state;
	
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPpid() {
		return this.ppid;
	}

	public void setPpid(int ppid) {
		this.ppid = ppid;
	}

	public int getValidity() {
		return this.validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	public String getValidityTerm() {
		return this.validityTerm;
	}

	public void setValidityTerm(String validityTerm) {
		this.validityTerm = validityTerm;
	}

	public String getPriceCurrency() {
		return this.priceCurrency;
	}

	public void setPriceCurrency(String priceCurrency) {
		this.priceCurrency = priceCurrency;
	}

	public double getPriceAlias() {
		return this.priceAlias;
	}

	public void setPriceAlias(double priceAlias) {
		this.priceAlias = priceAlias;
	}

	public String getValidityDesc() {
		return this.validityDesc;
	}

	public void setValidityDesc(String validityDesc) {
		this.validityDesc = validityDesc;
	}

	public String getTempPrice() {
		return this.tempPrice;
	}

	public void setTempPrice(String tempPrice) {
		this.tempPrice = tempPrice;
	}

	public int getServiceNum() {
		return this.serviceNum;
	}

	public void setServiceNum(int serviceNum) {
		this.serviceNum = serviceNum;
	}

	public String getPriceDesc() {
		return priceDesc;
	}

	public void setPriceDesc(String priceDesc) {
		this.priceDesc = priceDesc;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

}