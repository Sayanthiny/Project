package com.employee.operation.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.authenticator.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.operation.dto.ApplyLeaveDto;
import com.employee.operation.dto.EmployeeDto;
import com.employee.operation.dto.LeaveTypeDto;
import com.employee.operation.dto.ViewLeaveDto;
import com.employee.operation.entity.ApplyLeave;
import com.employee.operation.entity.LeaveType;
import com.employee.operation.entity.ViewLeave;
import com.employee.operation.mapper.Mapper;
import com.employee.operation.services.ApplyLeaveService;
import com.employee.operation.services.ViewLeaveService;


@RestController
public class ApplyLeaveController {
	@Autowired
	private ApplyLeaveService applyLeaveService;
	
@Autowired 
private ViewLeaveService viewLeaveService;

	
	@PostMapping("/applyLeave")
	
	public ResponseEntity<Object> emp1(@RequestBody ApplyLeaveDto applyLeaveDto){
		ApplyLeave applyLeave=new ApplyLeave();
		
	
		applyLeave.setReason(applyLeaveDto.getReason()); // reason
		applyLeave.setLeaveDaysCount(applyLeaveDto.getLeaveDaysCount()); // get leave days count
		
		// get view 
		ViewLeave viewLeave=new ViewLeave();
		viewLeave.setId(applyLeaveDto.getViewLeaveId());
		applyLeave.setViewLeave(viewLeave);
		
		ViewLeave viewLeave2=viewLeaveService.getSpecifyLeaveDetails(applyLeaveDto.getViewLeaveId());
		int remainingdays=viewLeave2.getRemainingLeaveCount();
		int newremainingdays=remainingdays-applyLeaveDto.getLeaveDaysCount();
		
		viewLeave2.setRemainingLeaveCount(newremainingdays);
		
		viewLeaveService.updateData(viewLeave2);
		
		applyLeave.setViewLeave(viewLeave);
		applyLeaveService.applyForLeave(applyLeave);
		
		
		
		return new ResponseEntity<Object>("Successfully apply for leave",HttpStatus.OK);
		
	}
}
	
	
	
