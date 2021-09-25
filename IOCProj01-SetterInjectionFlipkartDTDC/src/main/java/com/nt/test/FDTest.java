package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Flipkart;

public class FDTest {

	public static void main(String[] args) {
		// create FileSystemResource object to hold applicationContext.xml file
		FileSystemResource res = new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");

		// create IOC Container
		XmlBeanFactory factory = new XmlBeanFactory(res);

		// get Target class object from container
		Object obj = factory.getBean("fkrt");

		// down casting
		Flipkart fkrt = (Flipkart) obj;

		// invoke the Target class method
		String msg = fkrt.productDelivery("Akash");
		System.out.println(msg);
	}

}
