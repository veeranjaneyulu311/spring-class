package com.veer.practice.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.veer.practice.dto.GenericResponse;
import com.veer.practice.util.ResponseUtil;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<GenericResponse<String>> handleException(Exception iee) {
		System.out.println("Exception ::global exception");
		return ResponseUtil.createErrorResponse(iee.getMessage());
	}

	@ExceptionHandler(InvalidEmployeeException.class)
	public ResponseEntity<GenericResponse<String>> handleInvalidEmployeeException(InvalidEmployeeException iee) {
		System.out.println("InvalidEmployeeException :: global exception");
		return ResponseUtil.createErrorResponse(iee.getMessage());
	}

}
