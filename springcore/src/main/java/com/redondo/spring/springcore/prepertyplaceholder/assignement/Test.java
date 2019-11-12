package com.redondo.spring.springcore.prepertyplaceholder.assignement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/redondo/spring/springcore/prepertyplaceholder/assignement/config.xml");
		WSClient client = (WSClient) ctx.getBean("wsclient");

		System.out.println(client);

	}

}
