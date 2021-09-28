package com.nt.test;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileTest {
	public static void main(String[] args) {
		try {
			// locate the properties file
			FileInputStream fis = new FileInputStream("src/main/java/com/nt/commons/info.properties");
			//load the properties file content into java.util.Properties class object
			Properties props = new Properties();
			props.load(fis);
			//print the properties file data on console
			System.out.println("info about person : "+props);
			//print one specific value from properties file
			System.out.println("person email : "+props.getProperty("per.email"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}