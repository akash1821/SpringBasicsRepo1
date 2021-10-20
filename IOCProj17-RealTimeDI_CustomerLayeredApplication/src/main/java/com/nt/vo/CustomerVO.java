package com.nt.vo;

public class CustomerVO {
	private String custId;
	private String custName;
	private String custAddrs;
	private String custItem;
	private String itemPrice;
	private String purchaseDate;

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
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

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	@Override
	public String toString() {
		return "CustomerVO [custId=" + custId + ", custName=" + custName + ", custAddrs=" + custAddrs + ", custItem="
				+ custItem + ", itemPrice=" + itemPrice + ", purchaseDate=" + purchaseDate + "]";
	}

}
