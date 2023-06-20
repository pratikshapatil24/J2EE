package com.jspider.springcoreannotation.config;

import org.springframework.context.annotation.Bean;

import com.jspider.springcoreannotation.bean.StudentBean;

public class StudentConfig {
	@Bean("Student1")
	public StudentBean getStudent() {
		StudentBean student = new StudentBean();
		student.setId(1);
		student.setName("Pramod");
		student.setEmail("pramod@gmail.com");
		return student;
		
	}

}
