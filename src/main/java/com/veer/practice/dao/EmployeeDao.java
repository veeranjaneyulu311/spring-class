package com.veer.practice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veer.practice.domain.Employee;

public interface EmployeeDao extends JpaRepository<Employee, String> {

	Employee getByFirstName(Employee employee);

}
