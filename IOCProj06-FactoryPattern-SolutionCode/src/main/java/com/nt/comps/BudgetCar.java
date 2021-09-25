package com.nt.comps;

public class BudgetCar implements Car {
	private String regNo;

	public BudgetCar(String regNo) {
		System.out.println("BudgetCar::0-param constructor");
		this.regNo = regNo;
	}

	@Override
	public void driveCar() {
		System.out.println("Driving BudgetCar with RegNo :: " + regNo);
	}

}
