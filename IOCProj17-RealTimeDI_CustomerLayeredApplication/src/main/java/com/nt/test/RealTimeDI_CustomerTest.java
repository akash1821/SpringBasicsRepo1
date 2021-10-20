package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

public class RealTimeDI_CustomerTest {

	public static void main(String[] args) {
		System.out.println("Main Method Executed!");
		
		// create IOC Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

		// read inputs from end-user
		Scanner sc = new Scanner(System.in);
		CustomerVO vo = new CustomerVO();

		System.out.print("Enter Customer Name : ");
		vo.setCustName(sc.nextLine());

		System.out.print("Enter Customer Address : ");
		vo.setCustAddrs(sc.nextLine());

		System.out.print("Enter Customer Item Name : ");
		vo.setCustItem(sc.nextLine());

		System.out.print("Enter Item Price : ");
		vo.setItemPrice(sc.nextLine());

		System.out.print("Enter Purchase Date : ");
		vo.setPurchaseDate(sc.nextLine());

		// get spring bean object from ioc container
		MainController controller = factory.getBean("controller", MainController.class);

		// use controller to invoke its method
		try {
			String result = controller.saveCustomer(vo);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Interna Problem Try Again : " + e.getMessage());
		}

	}// end of main

}// end of class
