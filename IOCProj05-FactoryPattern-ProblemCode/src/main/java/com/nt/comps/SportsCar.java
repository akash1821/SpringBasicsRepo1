package com.nt.comps;

public class SportsCar implements ICar {
	private String regNo;

	public SportsCar(String regNo) {
		System.out.println("SportsCar::0-param constructor");
		this.regNo = regNo;
	}

	@Override
	public void driveCar() {
		System.out.println("Driving Sprots Car with RegNo :: " + regNo);
	}

}
