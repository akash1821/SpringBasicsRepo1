package com.nt.factory;

import com.nt.comps.BudgetCar;
import com.nt.comps.Car;
import com.nt.comps.LuxoryCar;
import com.nt.comps.SportsCar;

public class FactoryPattern {
	public static Car getCar(String car,String regNo) {
		if(car.equalsIgnoreCase("luxory")) {
			return new LuxoryCar(regNo);
		}
		else if(car.equalsIgnoreCase("budget")) {
			return new BudgetCar(regNo);
		}
		else if(car.equalsIgnoreCase("sports")) {
			return new SportsCar(regNo);
		}
		else
			 throw new IllegalArgumentException("Invalid Car Option");
	}
}
