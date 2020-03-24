package com.dafe.spring.logger.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dafe.spring.logger.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
