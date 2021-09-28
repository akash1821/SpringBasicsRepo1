package com.nt.factory;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import com.nt.comps.BlueDart;
import com.nt.comps.DHL;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;
import com.nt.comps.ICourier;

public class FlipkartFactory {
	private static Properties props;
	static {
		try {
			// locate the properties file location
			FileInputStream fis = new FileInputStream("src/main/java/com/nt/commons/info.properties");
			// load the properties file content into java.util.Properties class object
			props = new Properties();
			props.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// close static block

	public static Flipkart createFlipkart() throws Exception {
		// creating Flipkart class object
		Flipkart fpkt = new Flipkart();
		ICourier courier = null;

		// load the dependent class object
		Class clazz = Class.forName(props.getProperty("dependent.comp"));
		// get all Constructors from loaded class
		Constructor cons[] = clazz.getDeclaredConstructors();
		// create dynamic object
		courier = (ICourier) cons[0].newInstance();

		// set or assign dependent class object to target class.
		fpkt.setCourier(courier);

		// return Flipkart object
		return fpkt;
	}
}
