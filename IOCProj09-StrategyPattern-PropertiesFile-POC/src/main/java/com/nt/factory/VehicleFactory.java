package com.nt.factory;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.nt.comps.IEngine;
import com.nt.comps.Vehicle;

public class VehicleFactory {
	private static Properties props;

	static {
		//try with resourse
		try (
			// locate name and location of properties file using FileInputStream class object
			FileInputStream fis = new FileInputStream("src/main/java/com/nt/commons/info.properties")){
			//load the properties file content into java.util.Properties class object
			props = new Properties();
			props.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//static block
	
	public static Vehicle createEngine() throws Exception {
		//load dependent class through properties file
		Class c = Class.forName(props.getProperty("dependent.comp"));
		
		//get declared constructors from loaded class
		Constructor cons[] = c.getDeclaredConstructors();
		//create dynamic object using reflection api
		IEngine engine = (IEngine) cons[0].newInstance();
		
		//create Dependent class object to inject the dependent class object to target class
		Vehicle vehicle = new Vehicle();
		vehicle.setEngine(engine);
		
		//return target class to client app
		return vehicle;
	}
}
