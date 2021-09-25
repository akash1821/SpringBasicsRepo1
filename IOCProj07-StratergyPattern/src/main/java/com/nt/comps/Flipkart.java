package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private ICourier courier;

	// setMethod to inject dependent class to out target class
	public void setCourier(ICourier courier) {
		this.courier = courier;
	}

	public String shopping(String items[], double prices[]) {
		// calculate bill amount
		double billAmt = 0.0;
		for (int i = 0; i < items.length; i++)
			billAmt = billAmt + prices[i];

		// generate orderID
		int oid = new Random().nextInt(100000);

		// by using courier object invoke its method
		String status = courier.deliverProduct(oid);

		// generate finalMessage
		String deliveryMsg = Arrays.toString(items) + " purchased with prices " + Arrays.toString(prices)
				+ ". The generated bill amount is : " + billAmt+" having ";
		return deliveryMsg+""+status;
	}// close shopping(-,-)

}
