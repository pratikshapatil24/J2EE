package com.jspider.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.jspider.springcoreannotation.bean.PersonBean;
@ComponentScan(basePackages = "com.jspider.springcoreannotation")
public class PersonConfig {
	@Bean("Person1")
	public PersonBean getPerson() {
		return new PersonBean();
	}

}
