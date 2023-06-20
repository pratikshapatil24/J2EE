package com.jspider.springcoreannotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspider.springcoreannotation.bean.EmployeeBean;
import com.jspider.springcoreannotation.config.EmployeeConfig;

public class EmployeeMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeBean employee1 = (EmployeeBean)context.getBean("employee1");
		System.out.println(employee1);
		((AnnotationConfigApplicationContext)context).close();
	}

}
