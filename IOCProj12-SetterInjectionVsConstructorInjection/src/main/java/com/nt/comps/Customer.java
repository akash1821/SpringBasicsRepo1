package com.nt.comps;

public class Customer {
	// assume mandatory to provide
	private Integer custNo;
	private String custName;
	private Double billAmt;

	// optinal to provide
	private String custAddrs;
	private Long phoneNum;

	public Customer(Integer custNo, String custName, Double billAmt) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.billAmt = billAmt;
	}

	public void setCustAddrs(String custAddrs) {
		this.custAddrs = custAddrs;
	}

	public void setPhoneNum(Long phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custName=" + custName + ", billAmt=" + billAmt + ", custAddrs="
				+ custAddrs + ", phoneNum=" + phoneNum + "]";
	}
	
	

}
