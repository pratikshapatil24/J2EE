package com.jspider.springcoreannotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspider.springcoreannotation.bean.TrainerBean;
import com.jspider.springcoreannotation.config.TrainerConfig;

public class TrainerMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(TrainerConfig.class);
		TrainerBean trainer1=(TrainerBean)context.getBean("trainer1");
		TrainerBean trainer2=(TrainerBean)context.getBean("trainer2");
		System.out.println(trainer1);
		System.out.println(trainer2);
		((AnnotationConfigApplicationContext)context).close();
	}

}
