package com.test.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.test.response.ResponseHandler;

@ControllerAdvice
public class ExceptionHanlderControllerAdvice {

	@ExceptionHandler(RelationAlreadyExistException.class)
	public ResponseEntity<Object> relationAlreadyExistExceptionHandler(){
		return ResponseHandler.generateResponse("Error", HttpStatus.ALREADY_REPORTED, "Words Relationship already existed please add new word");
	}
}
