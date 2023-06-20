package com.jspider.springcoreannotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class PersonBean {
	@Value("1")
	int id;
	@Value("Pratiksha")
	String name;
	@Value("pratiksha@gmail.com")
	String email;
	@Autowired
	AadharBean aadhar;

}
