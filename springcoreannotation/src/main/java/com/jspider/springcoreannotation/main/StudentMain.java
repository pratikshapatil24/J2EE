package com.jspider.springcoreannotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspider.springcoreannotation.bean.StudentBean;
import com.jspider.springcoreannotation.config.StudentConfig;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentBean student1=context.getBean(StudentBean.class);
		System.out.println(student1);
		((AnnotationConfigApplicationContext)context).close();
	}

}
