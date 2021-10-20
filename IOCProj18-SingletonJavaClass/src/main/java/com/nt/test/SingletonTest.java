package com.nt.test;

import com.nt.comp.Printer;

public class SingletonTest {
	public static void main(String[] args) {
		Printer p1 = Printer.getInstance();
		String msg = p1.showMsg("AKASH");
		System.out.println(msg);
		
		Printer p2 = Printer.getInstance();
		System.out.println(p1==p2);
		System.out.println(p1.hashCode()+" "+p2.hashCode());
	}
}
