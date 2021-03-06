package com.employee.operation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.employee.operation.entity.Employee;
import com.employee.operation.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}
	@Override
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}
	@Override
	public void deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);
		
	}
	
	

	
}
