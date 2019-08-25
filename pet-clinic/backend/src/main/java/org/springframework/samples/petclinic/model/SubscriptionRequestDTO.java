package org.springframework.samples.petclinic.model;

public class SubscriptionRequestDTO {

	private Product selectedProduct;
	private String msisdnNumbers;
	private Channel selectedChannel;
	private PriceDetails selectedPriceDetails;
	public Product getSelectedProduct() {
		return selectedProduct;
	}
	public void setSelectedProduct(Product selectedProduct) {
		this.selectedProduct = selectedProduct;
	}
	public String getMsisdnNumbers() {
		return msisdnNumbers;
	}
	public void setMsisdnNumbers(String msisdnNumbers) {
		this.msisdnNumbers = msisdnNumbers;
	}
	public Channel getSelectedChannel() {
		return selectedChannel;
	}
	public void setSelectedChannel(Channel selectedChannel) {
		this.selectedChannel = selectedChannel;
	}
	public PriceDetails getSelectedPriceDetails() {
		return selectedPriceDetails;
	}
	public void setSelectedPriceDetails(PriceDetails selectedPriceDetails) {
		this.selectedPriceDetails = selectedPriceDetails;
	}

}
