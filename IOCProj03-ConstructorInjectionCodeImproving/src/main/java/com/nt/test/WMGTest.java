package com.nt.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class WMGTest {

	public static void main(String[] args) {
		// create ClassPathResource object to hold the name and location of
		// applicationContext.xml file
		ClassPathResource res = new ClassPathResource("applicationContext.xml");

		// create IOC Container
		XmlBeanFactory factory = new XmlBeanFactory(res);

		// get Target class form IOC Container
		//improved public <T> T getBean(String name, Class<T> requiredType) throws BeansException{}
		WishMessageGenerator generator = factory.getBean("wmg", WishMessageGenerator.class);

		// invoke the Target class method
		String msg = generator.generateMessage("Akash");
		System.out.println(msg);
	}

}
