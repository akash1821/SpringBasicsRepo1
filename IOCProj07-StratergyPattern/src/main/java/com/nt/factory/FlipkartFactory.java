package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.DHL;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;
import com.nt.comps.ICourier;

public class FlipkartFactory {
	public static Flipkart createFlipkart(String courierType) {
		// creating Flipkart class object
		Flipkart fpkt = new Flipkart();

		// creating common interface type local variable for holding one of the its sub
		// class object.
		ICourier courier = null;
		if (courierType.equalsIgnoreCase("dtdc"))
			courier = new DTDC();
		else if (courierType.equalsIgnoreCase("bdart"))
			courier = new BlueDart();
		else if (courierType.equalsIgnoreCase("dhl"))
			courier = new DHL();
		else
			throw new IllegalArgumentException("Invalide Courier Type");

		// set or assign dependent class object to target class.
		fpkt.setCourier(courier);

		// return Flipkart object
		return fpkt;
	}
}
