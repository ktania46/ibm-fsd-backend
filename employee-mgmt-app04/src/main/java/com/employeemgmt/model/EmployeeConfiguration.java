package com.employeemgmt.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.employeemgmt.dao.DatabaseService;
import com.employeemgmt.service.EmployeeService;

@Configuration
public class EmployeeConfiguration {
	
	@Bean
	public EmployeeService employeeService() {
		return new EmployeeService(employee());
	}
	
	@Bean
	public Employee employee() {
		return new Employee("Tania",22,"Trainer","IT","India");
	}
	
	@Bean
	public DatabaseService databaseService() {
		return new DatabaseService();
	}
}
