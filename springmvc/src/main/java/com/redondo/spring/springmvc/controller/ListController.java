package com.redondo.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.redondo.spring.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");

		Employee employee = new Employee();
		employee.setId(2);
		employee.setName("Redondo");
		employee.setSalary(20000);

		Employee employee1 = new Employee();
		employee1.setId(3);
		employee1.setName("Reda");
		employee1.setSalary(2000);

		Employee employee2 = new Employee();
		employee2.setId(4);
		employee2.setName("Souhaib");
		employee2.setSalary(19990);

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee1);
		employees.add(employee2);

		modelAndView.addObject("employees", employees);

		return modelAndView;
	}

}
