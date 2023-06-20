package com.jspider.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.springcore.beans.CompanyBean;

public class CompanyMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("CompanyConfig.xml");
		CompanyBean company=context.getBean(CompanyBean.class);
		System.out.println(company);
		((ClassPathXmlApplicationContext)context).close();
	}
    //One Company Many Employees (OneToMany)
}
