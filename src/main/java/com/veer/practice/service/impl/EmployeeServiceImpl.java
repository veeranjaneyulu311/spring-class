package com.veer.practice.service.impl;

import org.springframework.stereotype.Service;

import com.veer.practice.dao.EmployeeDao;
import com.veer.practice.dto.EmployeeDto;
import com.veer.practice.exceptions.InvalidEmployeeException;
import com.veer.practice.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao employeeDao;

	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		
		// use spring validation
//		if (employeeDto.getEmpId() == null || employeeDto.getEmpId().length() == 0) {
//			throw new InvalidEmployeeException("Invalid Emp Id");
//		}
//		if (employeeDto.getAge() == null || employeeDto.getAge() <= 0) {
//			throw new InvalidEmployeeException("Invalid Age");
//		}
//		if (employeeDto.getSalary() == null) {
//			throw new InvalidEmployeeException("Invalid Salary");
//		}
//		if (employeeDto.getFirstName() == null || employeeDto.getFirstName().length() <= 3) {
//			throw new InvalidEmployeeException("Invalid FirstName");
//		}
		return employeeDto;
	}

}
