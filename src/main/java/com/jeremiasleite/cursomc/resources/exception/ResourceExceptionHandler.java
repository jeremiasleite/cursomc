package com.jeremiasleite.cursomc.resources.exception;

import java.time.OffsetDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.jeremiasleite.cursomc.services.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(
			ObjectNotFoundException e, HttpServletRequest requeste){
		StandardError err = new StandardError(
				HttpStatus.NOT_FOUND.value(), 
				e.getMessage(), 
				OffsetDateTime.now());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
}
