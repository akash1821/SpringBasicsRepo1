package com.nt.test;

import com.nt.comps.BudgetCar;
import com.nt.comps.ICar;

public class ProfessionalCustomerTest {

	public static void main(String[] args) {
		ICar car = new BudgetCar("MH-28 MK 7896");
		car.driveCar();
	}
}
