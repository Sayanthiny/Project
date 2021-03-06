package com.employee.operation.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.operation.entity.ApplyLeave;
import com.employee.operation.repository.ApplyLeaveRepository;
@Service
public class ApplyLeaveServiceImplementation implements ApplyLeaveService {
	
	@Autowired
	ApplyLeaveRepository applyLeaveRepository;


	@Override
	public void applyForLeave(ApplyLeave applyLeave) {
		applyLeaveRepository.save(applyLeave);
		}


	@Override
	public ApplyLeave getLeaveApplyById(int id) {
		// TODO Auto-generated method stub
		return applyLeaveRepository.findById(id).orElse(null);
	}
}


