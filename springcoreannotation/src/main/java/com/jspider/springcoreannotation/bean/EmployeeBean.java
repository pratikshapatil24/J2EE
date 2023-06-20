package com.jspider.springcoreannotation.bean;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class EmployeeBean {
	@Value("1")
	int id;
	@Value("Kunal")
	String name;
	@Value("kunal@gmail.com")
	String email;
	@Value("7755221166")
	long contact;

}
