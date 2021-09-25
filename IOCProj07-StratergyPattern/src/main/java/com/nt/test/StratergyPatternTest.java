package com.nt.test;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StratergyPatternTest {
	public static void main(String[] args) {
		//get target class object from FlipkartFactory
		Flipkart fpkt = FlipkartFactory.createFlipkart("dtdc");
		
		//invoke the target class method
		String deliveryUpdate = fpkt.shopping(new String[] {"shirt","trouser","mobile"},new double[] {2500.0,3000.0,30000.0});
		System.out.println(deliveryUpdate);
	}
}
