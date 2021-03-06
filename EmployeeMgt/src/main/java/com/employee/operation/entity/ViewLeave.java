package com.employee.operation.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "viewLeave")
public class ViewLeave {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int remainingLeaveCount;

	@ManyToOne
	@JoinColumn(name = "employeeId")
	private Employee employee;

	@ManyToOne
	@JoinColumn(name = "leaveTypeId")
	private LeaveType leaveType;

	@OneToMany(targetEntity = ApplyLeave.class, mappedBy = "viewLeave")
	private List<ApplyLeave> applyLeave;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRemainingLeaveCount() {
		return remainingLeaveCount;
	}

	public void setRemainingLeaveCount(int remainingLeaveCount) {
		this.remainingLeaveCount = remainingLeaveCount;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public LeaveType getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}

	public List<ApplyLeave> getApplyLeave() {
		return applyLeave;
	}

	public void setApplyLeave(List<ApplyLeave> applyLeave) {
		this.applyLeave = applyLeave;
	}
	
	

}
