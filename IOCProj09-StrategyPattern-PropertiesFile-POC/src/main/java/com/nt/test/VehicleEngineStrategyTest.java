package com.nt.test;

import com.nt.comps.Vehicle;
import com.nt.factory.VehicleFactory;

public class VehicleEngineStrategyTest {

	public static void main(String[] args) {
		try {
		//get target class from factory
		Vehicle vehicle = VehicleFactory.createEngine();
		vehicle.journy("MUMBAI", "HYD");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
