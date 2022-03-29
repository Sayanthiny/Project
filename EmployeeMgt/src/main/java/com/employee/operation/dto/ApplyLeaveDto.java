package com.employee.operation.dto;

public class ApplyLeaveDto {
	
	private int id;
	private String reason;
	private int leaveDaysCount;
	private int viewLeaveId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public int getLeaveDaysCount() {
		return leaveDaysCount;
	}
	public void setLeaveDaysCount(int leaveDaysCount) {
		this.leaveDaysCount = leaveDaysCount;
	}
	public int getViewLeaveId() {
		return viewLeaveId;
	}
	public void setViewLeaveId(int viewLeaveId) {
		this.viewLeaveId = viewLeaveId;
	}
	
	
	
}
