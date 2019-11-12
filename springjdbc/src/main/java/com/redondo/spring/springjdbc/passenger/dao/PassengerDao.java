package com.redondo.spring.springjdbc.passenger.dao;

import java.util.List;

import com.redondo.spring.springjdbc.passenger.entity.Passenger;

public interface PassengerDao {

	int create(Passenger passenger);

	int update(Passenger passenger);

	int delete(int id);

	List<Passenger> read();

}
