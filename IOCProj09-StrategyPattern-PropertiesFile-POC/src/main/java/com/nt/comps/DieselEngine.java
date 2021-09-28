package com.nt.comps;

public final class DieselEngine implements IEngine {

	public DieselEngine() {
		System.out.println("DieselEngine :: 0-param Constructor");
	}
	
	@Override
	public String start() {
		return "Diesel Engine Started";
	}
	
	public String stop() {
		return "Diesel Engine Stopped";
	}

}
