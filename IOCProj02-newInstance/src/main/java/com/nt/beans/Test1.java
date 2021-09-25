package com.nt.beans;

public class Test1 {
	private int a = 10;
	private String msg = "hello";

	public Test1() {
		System.out.println("Test1 :: 0-param constructor");
	}

	/* to get parameterized constructor press altr+shift+s+o */
	public Test1(int a, String msg) {
		this.a = a;
		this.msg = msg;
	}

	/* to get toString() method in eclipse press altr+shift+s+s */
	@Override
	public String toString() {
		return "Test1 [a=" + a + ", msg=" + msg + "]";
	}

}
