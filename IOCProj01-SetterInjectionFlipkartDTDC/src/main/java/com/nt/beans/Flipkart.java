package com.nt.beans;

public class Flipkart {
	private DTDCCourierService dtdc;
	
	public void setDtdc(DTDCCourierService dtdc) {
		this.dtdc=dtdc;
	}
	
	public String productDelivery(String user) {
		//use DTDC Courier Service
		dtdc.setSourceLoc("HYD");
		dtdc.setDestinationLoc("Mumbai");
		return "Product Delivering from "+dtdc.getSourceLoc()+" to "+dtdc.getDestinationLoc()+" with tracking id "+dtdc.getTrackingId();
	}
}
