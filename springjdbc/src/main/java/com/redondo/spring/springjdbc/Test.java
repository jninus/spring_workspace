package com.redondo.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext dbContext = new ClassPathXmlApplicationContext("com/redondo/spring/springjdbc/config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) dbContext.getBean("jdbcTemplate");

		String sql = "insert into employee values(?,?,?)";

		int result = jdbcTemplate.update(sql, new Integer(1), "Reda", "Zejli");

		System.out.println(result);
	}

}
