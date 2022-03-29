package com.CRUD.operation.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.CRUD.operation.Entity.Employee;
import com.CRUD.operation.Repository.EmployeeRepository;

public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> Employee = employeeRepository.findAll();
		for(Employee a:Employee) {
			System.out.println(a.getAddress());
		}
		return employeeRepository.findAll();
		
	}


}
