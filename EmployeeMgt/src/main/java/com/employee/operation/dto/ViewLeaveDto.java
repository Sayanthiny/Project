package com.employee.operation.dto;

public class ViewLeaveDto {
	private int id;
	private int remainingLeaveCount;
	private int employee;
	private int leaveType;
	public int getId() {
		return id;
	}
	public int getRemainingLeaveCount() {
		return remainingLeaveCount;
	}
	public void setRemainingLeaveCount(int remainingLeaveCount) {
		this.remainingLeaveCount = remainingLeaveCount;
	}
	public int getEmployee() {
		return employee;
	}
	public void setEmployee(int employee) {
		this.employee = employee;
	}
	public int getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(int leaveType) {
		this.leaveType = leaveType;
	}
	public void setId(int id) {
		this.id = id;
	}

	
}
