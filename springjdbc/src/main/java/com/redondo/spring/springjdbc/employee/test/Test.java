package com.redondo.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.redondo.spring.springjdbc.employee.dao.EmployeeDao;
import com.redondo.spring.springjdbc.employee.entity.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext dbContext = new ClassPathXmlApplicationContext(
				"com/redondo/spring/springjdbc/employee/test/config.xml");
		EmployeeDao employeeDAO = (EmployeeDao) dbContext.getBean("employeeDao");

		Employee empl = new Employee();
		empl.setId(4);
		empl.setFirstName("Ilyass");
		empl.setLastName("Miquoi");
 	//	int result = employeeDAO.create(empl);
//		int result = employeeDAO.update(empl);
	//	int result = employeeDAO.delete(2);
	//	Employee employee = employeeDAO.read(1);
		List<Employee> read = employeeDAO.read();
		System.out.println(read);

	}

}
