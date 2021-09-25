package com.nt.test;

import java.lang.reflect.Constructor;

public class NewInstanceMethodOfConstructorClass {

	public static void main(String[] args) throws Exception {
		// load class
		Class c = Class.forName(args[0]);

		// get all declared constructor
		Constructor cons[] = c.getDeclaredConstructors();

		// Dynamic object creation using 0-param constructor.
		Object obj1 = cons[0].newInstance();
		System.out.println(obj1.toString());
		
		//Dynamic object creation using 2-param constructor
		Object obj2 = cons[1].newInstance(100,"Akash");
		System.out.println(obj2.toString());
	}

}
