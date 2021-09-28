package com.nt.comps;

public final class Vehicle {
	private IEngine engine;

	public void setEngine(IEngine engine) {
		this.engine = engine;
	}
	
	public void journy(String source,String dest) {
		System.out.println("Journy is started : from "+source);
		System.out.println(engine.start());
		System.out.println("Journy is ended : at "+dest);
		System.out.println(engine.stop());
	}
}
