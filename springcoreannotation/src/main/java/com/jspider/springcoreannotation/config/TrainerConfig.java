package com.jspider.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.jspider.springcoreannotation.bean.TrainerBean;

@ComponentScan(basePackages = "com.jspider.springcoreannotation")
public class TrainerConfig {
	@Bean("trainer1")
	public TrainerBean getTrainer() {
		TrainerBean trainer1=new TrainerBean();
		trainer1.setId(1);
		trainer1.setName("Sneha");
		trainer1.setEmail("sneha@gmail.com");
		trainer1.setContact(5896123645l);
		return trainer1;
	}
	@Bean("trainer2")
	public TrainerBean getTraine2() {
		TrainerBean trainer2 = new TrainerBean(2,"Sonal","sonal@gmail.com",7785261345l ); 
		return trainer2;
	}
	

}
