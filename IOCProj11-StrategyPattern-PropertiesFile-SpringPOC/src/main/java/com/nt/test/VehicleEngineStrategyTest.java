package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.nt.comps.Vehicle;

public class VehicleEngineStrategyTest {

	public static void main(String[] args) {
		//create IOC container
				DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
				XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
				reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
				
				//get target class object from IOC container
				Vehicle vehicle = factory.getBean("vehicle",Vehicle.class);
				
				//invoke the target class method
				vehicle.journy("MUMBAI", "HYD");
	}
}
