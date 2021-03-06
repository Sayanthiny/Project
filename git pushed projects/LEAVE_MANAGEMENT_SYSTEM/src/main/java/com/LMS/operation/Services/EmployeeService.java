package com.LMS.operation.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.LMS.operation.Entity.Employee;

@Service
public interface EmployeeService {
	// get all employee
	public List <Employee> getAllEmployee();
	
	// get one employee
	public Employee getOneEmployee(@PathVariable int id);
	
	//add employee
	public void addEmployee(@RequestBody Employee employee);
	
	// update employee
	public void updateEmployee(@RequestBody Employee employee);
	
	// delete Employee
	public void deleteEmployee(@PathVariable int id);
}
