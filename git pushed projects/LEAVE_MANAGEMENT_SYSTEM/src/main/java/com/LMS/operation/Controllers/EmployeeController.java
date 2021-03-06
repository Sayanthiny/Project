package com.LMS.operation.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LMS.operation.Entity.Employee;
import com.LMS.operation.Services.EmployeeService;
import com.LMS.operation.util.endPointURL;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(value=endPointURL.EMPLOYEE)
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}
	
	@GetMapping(value=endPointURL.GETONE)
	public Employee getOneEmployee(@PathVariable int id) {
		return employeeService.getOneEmployee(id);
	}
	
	//add employee
	@PostMapping(value=endPointURL.EMPLOYEE)
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	
	// update employee
	@PutMapping(value=endPointURL.DELETE_EMPLOYEE)
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);;
		
	}
	
	// delete employee
	@DeleteMapping(value = endPointURL.DELETE_EMPLOYEE)
	public void deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
	}
	
	

	

}
