package com.redondo.spring.springjavaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.redondo.spring.springjavaconfig.dao.Dao;

@Configuration
public class DaoConfig {
	@Bean
	public Dao dao() {
		return new Dao();
	}
}
