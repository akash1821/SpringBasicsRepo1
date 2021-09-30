package com.nt.comps;

public final class DHL implements ICourier {
	
	public DHL() {
		System.out.println("DHL :: 0-param constructor");
	}

	@Override
	public String deliverProduct(int oid) {
		return "'"+oid+"'"+" is order id which is delivered by DHL Courier Service";
	}

}
