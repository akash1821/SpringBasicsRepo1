package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class WMGTest {

	public static void main(String[] args) {
		//create FileSystemResource object to hold the applicationContext xml file
		FileSystemResource res = new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		
		//create IOC Container
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		//get Target class form IOC Container
		Object obj = factory.getBean("wmg");
		
		//downcasting
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		
		//invoke the Target class method
		String msg = generator.generateMessage("Akash");
		System.out.println(msg);
	}

}
