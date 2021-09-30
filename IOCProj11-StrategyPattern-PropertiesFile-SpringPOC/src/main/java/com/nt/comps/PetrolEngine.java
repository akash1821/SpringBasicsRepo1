package com.nt.comps;

public final class PetrolEngine implements IEngine {

	public PetrolEngine() {
		System.out.println("PetrolEngine :: 0-param Constructor");
	}
	
	@Override
	public String start() {
		return "Petrol Engine Started";
	}
	
	public String stop() {
		return "Petrol Engine Stopped";
	}

}
