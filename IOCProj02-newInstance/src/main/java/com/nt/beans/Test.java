package com.nt.beans;

public class Test {
	private int a = 10;
	private String msg = "hello";

	public Test() {
		System.out.println("Test :: 0-param constructor");
	}

	/* to get toString in eclipse press altr+shift+s+s */
	@Override
	public String toString() {
		return "Test [a=" + a + ", msg=" + msg + "]";
	}

}
