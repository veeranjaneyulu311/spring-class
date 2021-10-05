package com.veer.practice.service;

import com.veer.practice.domain.Employee;
import com.veer.practice.dto.EmployeeDto;

public interface EmployeeService {
	Employee saveEmployee(EmployeeDto employeeDto);
	Employee getEmployeeById(String empId);
	void deleteEmployeeById(String empId);
}
