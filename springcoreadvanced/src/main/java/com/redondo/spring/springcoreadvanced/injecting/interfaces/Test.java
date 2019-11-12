package com.redondo.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/redondo/spring/springcoreadvanced/injecting/interfaces/config.xml");

		OrderBO orderBo = (OrderBO) ctx.getBean("bo");
		orderBo.placeOrder();

	}

}
