package com.LMS.operation.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.LMS.operation.Entity.Employee;
import com.LMS.operation.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService{
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getOneEmployee(@PathVariable int id) {
		return employeeRepository.findById(id).get();
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
	public void deleteEmployee(@PathVariable int id) {
		employeeRepository.deleteById(id);
		
	}
	
	


	
	

	
	

}
