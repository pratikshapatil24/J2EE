package com.jspider.springcore.beans;

import java.util.List;

import lombok.Data;
@Data

public class CompanyBean {
	int id;
	String name;
	String location;
	List<EmployeeBean>employees;

}
