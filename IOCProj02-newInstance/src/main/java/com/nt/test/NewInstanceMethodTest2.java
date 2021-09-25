package com.nt.test;

import java.lang.reflect.Constructor;

public class NewInstanceMethodTest2 {

	public static void main(String[] args) throws Exception {
		//load class
		Class c1 = Class.forName(args[0]);
		
		//get all constructors of loaded class
		Constructor cons[]=c1.getDeclaredConstructors();
		
		//creating Dynamic object using 0-param constructor
		cons[0].setAccessible(true);
		Object obj = cons[0].newInstance();
		System.out.println(obj.toString());
		
		//creating Dynamic Object using parameterized constructor
		cons[1].setAccessible(true);
		Object obj1 = cons[1].newInstance(101,"India");
		System.out.println(obj1.toString());
	}

}
