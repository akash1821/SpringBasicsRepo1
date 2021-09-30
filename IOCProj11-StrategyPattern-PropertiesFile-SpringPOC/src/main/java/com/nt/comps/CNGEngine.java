package com.nt.comps;

public final class CNGEngine implements IEngine {
	
	public CNGEngine() {
		System.out.println("CNGEngine :: 0-param constructor");
	}
		
	@Override
	public String start() {
		return "CNG Engine Started";
	}

	@Override
	public String stop() {
		return "CNG Engine Stopped";
	}

}
