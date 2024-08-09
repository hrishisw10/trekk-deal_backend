package com.trek.resource.controlleradvice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.trek.exception.ErrorResponse;
import com.trek.exception.TourDetailsException;

@ControllerAdvice
public class ViewResourceAdvice {

	@ExceptionHandler({ TourDetailsException.class })
	public ResponseEntity<ErrorResponse> handleNullPointerExceptions(TourDetailsException ex, WebRequest request) {
		return new ResponseEntity<ErrorResponse>(
				new ErrorResponse(ex.getHttpStatusCode(), ex.getCode(), ex.getMessage()), ex.getHttpStatusCode());

	}

}
