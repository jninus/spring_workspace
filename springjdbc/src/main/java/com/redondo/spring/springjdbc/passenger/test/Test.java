package com.redondo.spring.springjdbc.passenger.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.redondo.spring.springjdbc.passenger.dao.PassengerDao;
import com.redondo.spring.springjdbc.passenger.entity.Passenger;

public class Test {

	public static void main(String[] args) {
		ApplicationContext psgContext = new ClassPathXmlApplicationContext(
				"com/redondo/spring/springjdbc/passenger/test/config.xml");
		PassengerDao dao = (PassengerDao) psgContext.getBean("passengerDao");

//		Passenger ps1 = new Passenger();
//		ps1.setId(1);
//		ps1.setFname("Reda");
//		ps1.setLname("Zejli");
//
//		Passenger ps2 = new Passenger();
//		ps2.setId(2);
//		ps2.setFname("Passenger");
//		ps2.setLname("Onboad");
//
		Passenger ps3 = new Passenger();
		ps3.setId(3);
		ps3.setFname("Fuck you");
		ps3.setLname("Passenger");
//
//		int r1 = dao.create(ps1);
//		int r2 = dao.create(ps2);
//		int r3 = dao.create(ps3);

	//	List<Passenger> passengers = dao.read();
		
		int result =dao.update(ps3);
		
		
		System.out.println(result);

	}

}
