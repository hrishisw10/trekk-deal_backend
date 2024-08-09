package com.trek.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class TourDetailsException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final HttpStatus httpStatusCode;
	private final String code;
	private final String message;

	public TourDetailsException() {
		super();
		this.httpStatusCode = null;
		this.code = "";
		this.message = "";

	}

	public TourDetailsException(HttpStatus httpStatusCode, String code, String message) {
		super(message);
		this.httpStatusCode = httpStatusCode;
		this.code = code;
		this.message = message;

	}

}
