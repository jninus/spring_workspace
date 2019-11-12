package com.redondo.spring.springjdbc.passenger.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.redondo.spring.springjdbc.passenger.entity.Passenger;

public class PassengerRowMapper implements RowMapper<Passenger> {

	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
		Passenger passenger = new Passenger();
		passenger.setId(rs.getInt(1));
		passenger.setFname(rs.getString(2));
		passenger.setLname(rs.getString(3));

		return passenger;
	}

}
