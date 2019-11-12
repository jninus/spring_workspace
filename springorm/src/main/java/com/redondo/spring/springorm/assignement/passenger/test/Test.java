package com.redondo.spring.springorm.assignement.passenger.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.redondo.spring.springorm.assignement.passenger.dao.PassengerDao;
import com.redondo.spring.springorm.assignement.passenger.entity.Passenger;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/redondo/spring/springorm/assignement/passenger/test/config.xml");
		PassengerDao pdao = (PassengerDao) context.getBean("passengerDao");

		// Passenger passenger = pdao.find(1);
		List<Passenger> passengers = pdao.findAll();

		System.out.println(passengers);

	}

}
