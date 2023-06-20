package com.jspider.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.springcore.beans.PersonBean;

public class PersonMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("PersonConfig.xml");
		PersonBean person =context.getBean(PersonBean.class);
		System.out.println(person);
		((ClassPathXmlApplicationContext)context).close();
	}
	//One Person One Aadhar (OneToOne)

}
