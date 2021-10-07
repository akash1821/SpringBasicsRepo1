package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class EmployeeRealTimeDITest {

	public static void main(String[] args) {
		// create IOC container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

		try {
			// read input from end-user and set to VO class properties
			Scanner sc = new Scanner(System.in);
			EmployeeVO vo = new EmployeeVO();
			System.out.println("Enter Employee Name :: ");
			vo.setEname(sc.next());
			System.out.println("Enter Employee Desg :: ");
			vo.setDesg(sc.next());
			System.out.println("Enter Employee BasicSalary  :: ");
			vo.setBasicSalary(sc.next());

			// get spring bean class object from ioc container
			MainController controller = factory.getBean("controller", MainController.class);

			// invoke the spring bean class method
			String result = controller.saveEmployee(vo);
			System.out.println(result);

		} catch (Exception e) {
			System.out.println("Internal Problem Try Again!");
			e.printStackTrace();
		}
	}// end of main(-)

}
