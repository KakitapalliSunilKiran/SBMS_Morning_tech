package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandling {
	
	  @ExceptionHandler(OwnCustomException.class)
	    public ResponseEntity<Errormess> raiseException(OwnCustomException ex) {

	        Errormess error = new Errormess();
	        error.setStatusCode(HttpStatus.BAD_REQUEST.value());
	        error.setReason(ex.getMessage());

	        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	    }
}
