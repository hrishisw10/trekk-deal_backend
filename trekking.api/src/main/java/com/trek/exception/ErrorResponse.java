package com.trek.exception;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {

	private HttpStatus status;
	private String code;
	private List<String> errors;

	public ErrorResponse(HttpStatus status, String code, List<String> errors) {
		this.status = status;
		this.code = code;
		this.errors = errors;
	}

	public ErrorResponse(HttpStatus status, String code, String error) {
		this.status = status;
		this.code = code;
		errors = Arrays.asList(error);
	}
}
