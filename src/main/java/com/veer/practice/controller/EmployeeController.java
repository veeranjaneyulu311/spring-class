package com.veer.practice.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.veer.practice.dto.EmployeeDto;
import com.veer.practice.dto.GenericResponse;
import com.veer.practice.service.EmployeeService;
import static com.veer.practice.util.ResponseUtil.createSuccessResponse;

@RestController
@RequestMapping("/v1")
public class EmployeeController {

	private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);

	EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@PostMapping("/save-employee")
	public ResponseEntity<GenericResponse<EmployeeDto>> saveEmployee(@RequestBody @Valid EmployeeDto employeeDto) {
		return createSuccessResponse(employeeService.saveEmployee(employeeDto));
	}

	@GetMapping("/fetch-employee")
	public ResponseEntity<GenericResponse<EmployeeDto>> getEmployeeById(@RequestParam(required = false) String empId) {
		EmployeeDto employee = employeeService.saveEmployee(null);
		employee.setEmpId(empId);
		return createSuccessResponse(employee);
	}

	@DeleteMapping("/delete-employee")
	public ResponseEntity<GenericResponse<String>> deleteEmployeeById(@RequestParam String empId) {
		return createSuccessResponse("Delete Success");
	}

}
