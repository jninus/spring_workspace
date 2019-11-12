package com.redondo.spring.springcore.prepertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/redondo/spring/springcore/prepertyplaceholder/config.xml");
		MyDAO myDAO =(MyDAO) ctx.getBean("myDAO");
		
		System.out.println(myDAO);
		

	}

}
