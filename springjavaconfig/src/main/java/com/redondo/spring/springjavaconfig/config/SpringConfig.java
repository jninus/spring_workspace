package com.redondo.spring.springjavaconfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.redondo.spring.springjavaconfig.service.Service;

@Configuration
@Import(DaoConfig.class)
public class SpringConfig {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	public Service service() {
		return new Service();
	}

}
