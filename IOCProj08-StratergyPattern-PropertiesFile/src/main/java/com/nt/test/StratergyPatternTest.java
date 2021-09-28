package com.nt.test;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public final class StratergyPatternTest {
	public static void main(String[] args) {
		try {
		//get target class object from FlipkartFactory
		Flipkart fpkt = FlipkartFactory.createFlipkart();
		
		//invoke the target class method
		String deliveryUpdate = fpkt.shopping(new String[] {"shirt","trouser","mobile"},new double[] {2500.0,3000.0,30000.0});
		System.out.println(deliveryUpdate);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
