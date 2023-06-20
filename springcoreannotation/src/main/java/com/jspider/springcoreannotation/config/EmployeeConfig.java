package com.jspider.springcoreannotation.config;

import org.springframework.context.annotation.Bean;

import com.jspider.springcoreannotation.bean.EmployeeBean;

public class EmployeeConfig {
	@Bean("employee1")
	public EmployeeBean getEmployee() {
		return new EmployeeBean();
	}

}
