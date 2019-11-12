package com.redondo.spring.springjavaconfig.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.redondo.spring.springjavaconfig.config.SpringConfig;
import com.redondo.spring.springjavaconfig.service.Service;

public class Test {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);;
		
		Service service = context.getBean(Service.class);
		service.save();
		context.close();
	}

}
