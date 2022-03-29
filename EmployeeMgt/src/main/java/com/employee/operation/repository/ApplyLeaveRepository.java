package com.employee.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.operation.entity.ApplyLeave;

@Repository
public interface ApplyLeaveRepository extends JpaRepository<ApplyLeave, Integer>{

}
