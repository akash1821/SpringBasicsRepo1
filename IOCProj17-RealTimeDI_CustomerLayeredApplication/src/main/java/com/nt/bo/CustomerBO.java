package com.nt.bo;

import java.sql.Date;

public class CustomerBO {
	private Integer custId;
	private String custName;
	private String custAddrs;
	private String custItem;
	private Float itemPrice;
	private Date purchaseDate;
	private Float billAmt;

	// setter and getter methods
	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddrs() {
		return custAddrs;
	}

	public void setCustAddrs(String custAddrs) {
		this.custAddrs = custAddrs;
	}

	public String getCustItem() {
		return custItem;
	}

	public void setCustItem(String custItem) {
		this.custItem = custItem;
	}

	public Float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Float getBillAmt() {
		return billAmt;
	}

	public void setBillAmt(Float billAmt) {
		this.billAmt = billAmt;
	}

	@Override
	public String toString() {
		return "CustomerBO [custId=" + custId + ", custName=" + custName + ", custAddrs=" + custAddrs + ", custItem="
				+ custItem + ", itemPrice=" + itemPrice + ", purchaseDate=" + purchaseDate + ", billAmt=" + billAmt
				+ "]";
	}

}
