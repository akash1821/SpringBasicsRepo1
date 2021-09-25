package com.nt.comps;

public class LuxoryCar implements ICar {
	private String regNo;

	public LuxoryCar(String regNo) {
		System.out.println("LuxoryCar::0-param constructor");
		this.regNo = regNo;
	}

	@Override
	public void driveCar() {
		System.out.println("Driving LuxoryCar with RegNo :: " + regNo);
	}

}
