package com.jspider.springcore.ManyToMany;

import java.util.List;

import lombok.Data;

@Data
public class ProductBean {
	int id;
	String name;
	double price;
	List<CustomerBean>customers;
	
	

}
