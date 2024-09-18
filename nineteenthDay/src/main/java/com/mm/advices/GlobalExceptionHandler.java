package com.mm.advices;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler
{
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<ApiError> handleMarksheetNotFound(NoSuchElementException exception)
	{
		ApiError apiError = ApiError.builder().status(HttpStatus.NOT_FOUND).message(exception.getMessage()).build();
		return new ResponseEntity<ApiError>(apiError, HttpStatus.NOT_FOUND);
	}
}
