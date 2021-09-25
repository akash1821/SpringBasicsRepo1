package com.nt.test;

import java.lang.reflect.Constructor;

import com.nt.beans.Test;

public class ClassTest {

	public static void main(String[] args) throws Exception, IllegalAccessException {

		Class c1 = Test.class;

		// get all declared constructor.
		Constructor cons[] = c1.getDeclaredConstructors();

		// create Dynamic object by using 0-param constructor
		Test t = (Test) cons[0].newInstance();

		System.out.println(t.toString());
	}

}
