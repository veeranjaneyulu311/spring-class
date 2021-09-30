package com.veer.practice.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.veer.practice.dto.GenericResponse;

public class ResponseUtil {

	public static <T> ResponseEntity<GenericResponse<T>> createSuccessResponse(T data) {
		GenericResponse<T> results = new GenericResponse<>();
		results.setBody(data);
		results.setStatusCode(HttpStatus.OK.value());
		return new ResponseEntity<>(results, HttpStatus.OK);
	}
	
	public static <T> ResponseEntity<GenericResponse<T>> createErrorResponse(T data) {
		GenericResponse<T> results = new GenericResponse<>();
		results.setBody(data);
		results.setStatusCode(HttpStatus.BAD_REQUEST.value());
		return new ResponseEntity<>(results, HttpStatus.BAD_REQUEST);
	}

}
