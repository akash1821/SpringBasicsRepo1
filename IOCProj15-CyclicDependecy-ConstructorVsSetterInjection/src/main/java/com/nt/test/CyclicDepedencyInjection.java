package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.A;

public class CyclicDepedencyInjection {

	public static void main(String[] args) {
		//create IOC Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		//get spring bean class from IOC container
		A a = factory.getBean("a1",A.class);
		
		//invoke the toString method of class A
		System.out.println(a.toString());

	}

}
