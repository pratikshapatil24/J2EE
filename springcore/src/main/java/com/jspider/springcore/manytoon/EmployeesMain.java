package com.jspider.springcore.manytoon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeesMain {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("EmployeeConfig.xml");
		EmployeeBean employee1 =(EmployeeBean)context.getBean("Employee1");
		EmployeeBean employee2 = (EmployeeBean)context.getBean("Employee2");
		System.out.println(employee1);
		System.out.println(employee2);
		((ClassPathXmlApplicationContext)context).close();
	}

}
