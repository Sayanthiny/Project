package com.CRUD.operation.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRUD.operation.Entity.Employee;
import com.CRUD.operation.Repository.EmployeeRepository;
import com.CRUD.operation.Services.EmployeeService;

@RestController
public class EmployeeController {
	private EmployeeService employeeService;
	
	@GetMapping("/getEmp")
	
	public List<Employee> getEmp(){
		return employeeService.getAllEmployee();
	}
}
