package com.employee.operation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class ApplyLeave {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String reason;
	private int leaveDaysCount;
	
	@ManyToOne
	@JoinColumn(name = "viewLeaveId")
	private ViewLeave viewLeave;

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

	public ViewLeave getViewLeave() {
		return viewLeave;
	}

	public void setViewLeave(ViewLeave viewLeave) {
		this.viewLeave = viewLeave;
	}
	


}
