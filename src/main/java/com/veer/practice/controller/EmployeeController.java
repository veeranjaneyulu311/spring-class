package com.veer.practice.controller;

import java.security.InvalidAlgorithmParameterException;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.veer.practice.dto.EmployeeDto;
import com.veer.practice.exceptions.InvalidEmployeeException;
import com.veer.practice.service.EmployeeService;

@RestController
public class EmployeeController {
	
	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);

	EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@PostMapping("/save-employee")
	public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody @Valid EmployeeDto employeeDto) {
		try {
			EmployeeDto employee = employeeService.saveEmployee(employeeDto);
			return new ResponseEntity<>(employee, HttpStatus.OK);
		} catch (InvalidEmployeeException invalidEmployeeException) {
			log.info(invalidEmployeeException.getMessage());
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

}
