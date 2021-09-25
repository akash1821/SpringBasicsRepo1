package com.nt.test;

import com.nt.comps.Car;
import com.nt.comps.SportsCar;
import com.nt.factory.FactoryPattern;

public class YouthCustomerTest {

	public static void main(String[] args) {
		Car car = FactoryPattern.getCar("sports", "MH-28 DD 4565");
		car.driveCar();
	}
}
