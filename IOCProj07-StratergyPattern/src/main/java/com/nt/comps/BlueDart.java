package com.nt.comps;

public class BlueDart implements ICourier {
	
	public BlueDart() {
		System.out.println("BlueDart :: 0-param constructor");
	}

	@Override
	public String deliverProduct(int oid) {
		return oid+" is order which is delivered by BlueDart Courier Service";
	}

}
