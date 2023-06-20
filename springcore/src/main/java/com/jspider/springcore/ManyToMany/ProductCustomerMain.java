package com.jspider.springcore.ManyToMany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductCustomerMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ProductCustomerConfig.xml");
		ProductBean product1 = (ProductBean)context.getBean("Product1");
		ProductBean product2 = (ProductBean)context.getBean("Product2");
		System.out.println(product1);
		System.out.println(product2);
		((ClassPathXmlApplicationContext)context).close();
		
		//ManyToMany
	}

}
