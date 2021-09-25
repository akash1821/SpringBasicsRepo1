package com.nt.test;

import com.nt.comps.ICar;
import com.nt.comps.LuxoryCar;

public class BuisinessmanCustomerTest {

	public static void main(String[] args) {
		ICar car = new LuxoryCar("MH-28 AA 1111");
		car.driveCar();
	}
}
