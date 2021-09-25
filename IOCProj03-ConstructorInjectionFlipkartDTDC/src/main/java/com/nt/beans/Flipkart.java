package com.nt.beans;

import java.util.Date;

public class Flipkart {
	private DTDCCourierService dtdc;
	private Date date;

	public Flipkart(DTDCCourierService dtdc, Date date) {
		this.dtdc = dtdc;
		this.date = date;
	}

	public void setDtdc(DTDCCourierService dtdc) {
		this.dtdc = dtdc;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String productDelivery(String user) {
		// use DTDC Courier Service
		dtdc.setSourceLoc("HYD");
		dtdc.setDestinationLoc("Mumbai");
		return "Product Delivering from " + dtdc.getSourceLoc() + " to " + dtdc.getDestinationLoc()
				+ " with tracking id " + dtdc.getTrackingId() + " on the Date : " + date;
	}
}
