package com.nt.comps;

public class DTDC implements ICourier {
	
	public DTDC() {
		System.out.println("DTDC :: 0-param constructor");
	}

	@Override
	public String deliverProduct(int oid) {
		return oid+" is order id which is delivered by DTDC Courier Service";
	}

}
