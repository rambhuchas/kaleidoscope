package org.springframework.samples.petclinic.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product implements Serializable {

	@EmbeddedId
	private ProductId pidServiceId;

	@Column(name = "pack_id")
	private String packId;

	private String sc;

	@Column(name = "service_num")
	private String serviceNum;

	@Column(name = "prod_name")
	private String prodName;

	@Column(name = "prod_desc")
	private String prodDesc;

	@Column(name = "sub_keyword")
	private String subKeyword;

	@Column(name = "unsub_keyword")
	private String unsubKeyword;
	
	private Integer state;

	public ProductId getPidServiceId() {
		return pidServiceId;
	}

	public void setPidServiceId(ProductId pidServiceId) {
		this.pidServiceId = pidServiceId;
	}

	public String getPackId() {
		return packId;
	}

	public void setPackId(String packId) {
		this.packId = packId;
	}

	public String getSc() {
		return sc;
	}

	public void setSc(String sc) {
		this.sc = sc;
	}

	public String getServiceNum() {
		return serviceNum;
	}

	public void setServiceNum(String serviceNum) {
		this.serviceNum = serviceNum;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public String getSubKeyword() {
		return subKeyword;
	}

	public void setSubKeyword(String subKeyword) {
		this.subKeyword = subKeyword;
	}

	public String getUnsubKeyword() {
		return unsubKeyword;
	}

	public void setUnsubKeyword(String unsubKeyword) {
		this.unsubKeyword = unsubKeyword;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}