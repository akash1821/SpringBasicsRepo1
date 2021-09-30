package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comps.Flipkart;

public final class StratergyPatternTest {
	public static void main(String[] args) {
		//create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		//get target class object from IOC container
		Flipkart fpkt = factory.getBean("fpkt",Flipkart.class);
		
		//invoke the target class method
		String result = fpkt.shopping(new String[] {"shrit","trouser","mobile"}, new double[] {25000.0,3000.0,25000.0});
		
		System.out.println(result);
	}
}
