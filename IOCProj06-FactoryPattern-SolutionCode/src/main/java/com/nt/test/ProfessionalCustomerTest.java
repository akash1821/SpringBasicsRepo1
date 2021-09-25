package com.nt.test;

import com.nt.comps.BudgetCar;
import com.nt.comps.Car;
import com.nt.factory.FactoryPattern;

public class ProfessionalCustomerTest {

	public static void main(String[] args) {
		Car car = FactoryPattern.getCar("budget", "MH-28 HK 8525");
		car.driveCar();
	}
}
