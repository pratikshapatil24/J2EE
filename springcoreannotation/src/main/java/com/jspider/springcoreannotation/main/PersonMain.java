package com.jspider.springcoreannotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspider.springcoreannotation.bean.PersonBean;
import com.jspider.springcoreannotation.config.PersonConfig;

public class PersonMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
		PersonBean person1 =(PersonBean)context.getBean("Person1");
		System.out.println(person1);
		((AnnotationConfigApplicationContext)context).close();
	}

}
