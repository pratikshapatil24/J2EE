package com.jspider.springcoreannotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AadharBean {
	@Value("1")
	int id;
	@Value("445621365871")
	long aadhar_no;
	@Value("15/Jun/2005")
	String datr_of_issuse;

}
