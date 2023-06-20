package com.jspider.springcoreannotation.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainerBean {
	int id;
	String name;
	String email;
	long contact;

}
