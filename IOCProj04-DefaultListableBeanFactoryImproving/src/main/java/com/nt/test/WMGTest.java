package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.WishMessageGenerator;

public class WMGTest {

	public static void main(String[] args) {
		// create IOC container using DefaultListableBeanFactory
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		// create XmlBeanDefinitionReader object having factory as argument
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("applicationContext.xml");

		// get Target class form IOC Container
		// improved public <T> T getBean(String name, Class<T> requiredType) throws
		// BeansException{}
		WishMessageGenerator generator = factory.getBean("wmg", WishMessageGenerator.class);

		// invoke the Target class method
		String msg = generator.generateMessage("Akash");
		System.out.println(msg);
	}

}
