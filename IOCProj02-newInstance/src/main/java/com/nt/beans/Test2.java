package com.nt.beans;

public class Test2 {
	private int a = 10;
	private String msg = "Hello";
	
	private Test2() {
		System.out.println("Test2 :: 0-param constructor");
	}

	private Test2(int a, String msg) {
		this.a = a;
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Test2 [a=" + a + ", msg=" + msg + "]";
	}

}
