package com.nt.test;

import com.nt.comps.ICar;
import com.nt.comps.SportsCar;

public class YouthCustomerTest {

	public static void main(String[] args) {
		ICar car = new SportsCar("MH-28 GJ 5896");
		car.driveCar();
	}
}
