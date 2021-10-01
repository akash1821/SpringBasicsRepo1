package com.nt.comp;

public class B {
	private A a;

	public B(A a) {
		this.a = a;
		System.out.println("B :: 0-param constructor");
	}

	@Override
	public String toString() {
		return "B [a]";
	}

}
