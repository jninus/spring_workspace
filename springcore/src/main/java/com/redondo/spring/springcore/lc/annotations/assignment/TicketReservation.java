package com.redondo.spring.springcore.lc.annotations.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	
	private int id;
	
	
	@PostConstruct
	public void initialize() {
		System.out.println("Inside Initialize Method");
	}
	
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("We are cleaning");
	}

	@Override
	public String toString() {
		return "TicketReservation [idReservation=" + getId() + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	

}
