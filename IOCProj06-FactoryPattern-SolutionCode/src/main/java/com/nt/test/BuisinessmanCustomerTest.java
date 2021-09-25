package com.nt.test;

import com.nt.comps.Car;
import com.nt.factory.FactoryPattern;

public class BuisinessmanCustomerTest {

	public static void main(String[] args) {
		Car car = FactoryPattern.getCar("luxory", "MH-28 JK 2563");
		car.driveCar();
	}
}
