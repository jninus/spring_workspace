package com.redondo.spring.springjdbc.passenger.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.redondo.spring.springjdbc.passenger.dao.PassengerDao;
import com.redondo.spring.springjdbc.passenger.entity.Passenger;
import com.redondo.spring.springjdbc.passenger.rowmapper.PassengerRowMapper;

@Component("passengerDao")
public class PassengerDaoImpl implements PassengerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();

	@Override
	public int create(Passenger passenger) {
		String sql = "insert into passenger values(?,?,?)";
		int result = getJdbcTemplate().update(sql, passenger.getId(), passenger.getFname(), passenger.getLname());
		return result;
	}

	@Override
	public int update(Passenger passenger) {
		String sql = "update passenger set fname=?, lname=? where id=?";
		int result = getJdbcTemplate().update(sql, passenger.getFname(), passenger.getLname(), passenger.getId());
		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from where id=?";
		int result = getJdbcTemplate().update(sql, id);
		return result;
	}

	@Override
	public List<Passenger> read() {
		String sql = "select * from passenger";
		PassengerRowMapper rowmapper = new PassengerRowMapper();
		List<Passenger> passengers = jdbcTemplate.query(sql, rowmapper);
		return passengers;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
