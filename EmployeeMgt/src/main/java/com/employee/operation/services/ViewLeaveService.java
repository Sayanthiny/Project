package com.employee.operation.services;

import java.util.List;

import com.employee.operation.dto.ViewLeaveDto;
import com.employee.operation.entity.Employee;
import com.employee.operation.entity.ViewLeave;


public interface ViewLeaveService {
	
//	public ViewLeave getLeaveDetails();
	
	public List<ViewLeave> getLeaveDetails();
	
	public ViewLeave getSpecifyLeaveDetails(int id);
	
	public ViewLeave updateData(ViewLeave viewLeave );
}