package com.future.works.reflect.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

	private static final Logger logger = LoggerFactory.getLogger(ExceptionController.class);
	
	@ExceptionHandler
	public void handleIllegalArgumentException(IllegalArgumentException excep, HttpServletResponse response) throws IOException {
		logger.debug("Exception occured {}",excep.getMessage());
		response.sendError(HttpStatus.BAD_REQUEST.value());
	}
	
}
