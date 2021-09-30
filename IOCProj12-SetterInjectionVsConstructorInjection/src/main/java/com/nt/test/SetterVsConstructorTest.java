package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comps.Customer;
import com.nt.comps.Employee;
import com.nt.comps.Student;

public class SetterVsConstructorTest {

	public static void main(String[] args) {
		//create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		//invoke the spring bean class object from IOC container
		Employee emp = factory.getBean("emp",Employee.class);
		System.out.println(emp);
		System.out.println("=========================");
		Student std = factory.getBean("std",Student.class);
		System.out.println(std);
		System.out.println("=========================");
		Customer cust = factory.getBean("cust",Customer.class);
		System.out.println(cust);
	}

}
