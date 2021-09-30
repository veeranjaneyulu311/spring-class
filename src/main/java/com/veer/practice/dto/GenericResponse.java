package com.veer.practice.dto;

public class GenericResponse<T> {

	private T body;

	private Integer statusCode;

	private String errorMessage;

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
