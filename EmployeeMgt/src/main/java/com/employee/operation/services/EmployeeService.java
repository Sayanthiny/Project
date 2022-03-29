package com.employee.operation.services;

import java.util.List;

import com.employee.operation.entity.Employee;

public interface EmployeeService {

	//get all employee
	public List<Employee> getAllEmployee();
	
	//add employee
	void addEmployee(Employee employee);
	
	//update employee
	void updateEmployee(Employee employee);
	
	//delete employee
	void deleteEmployee(Integer id);

	
	
}
