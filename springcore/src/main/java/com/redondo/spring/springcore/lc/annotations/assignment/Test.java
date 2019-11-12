package com.redondo.spring.springcore.lc.annotations.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/redondo/spring/springcore/lc/annotations/assignment/config.xml");

		TicketReservation ticketReservation = (TicketReservation) context.getBean("ticketreservation");

		context.registerShutdownHook();
		
		System.out.println(ticketReservation);
	}
	

}
