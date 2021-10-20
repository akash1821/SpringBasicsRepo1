package com.nt.comp;

public class Printer {
	// 2. Create static variable of type Printer class that is hold the current
	// class object reference
	private static Printer INSTANCE;

	// 1. Create private constructor that is not accessible to outsiders
	private Printer() {
		System.out.println("Printer :: 0-param private constructor");
	}

	// 3. Create static factory method for check and create Printer class object
	public static Printer getInstance() {
		if (INSTANCE == null) 
			INSTANCE = new Printer();
		return INSTANCE;
	}
	
	public String showMsg(String user) {
		return "Hello '"+user+"' Welcome to singleton java class";
	}
}
