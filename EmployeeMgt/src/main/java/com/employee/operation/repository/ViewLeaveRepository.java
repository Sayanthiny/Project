package com.employee.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.operation.entity.ViewLeave;

@Repository
public interface ViewLeaveRepository extends JpaRepository<ViewLeave, Integer>{

}
