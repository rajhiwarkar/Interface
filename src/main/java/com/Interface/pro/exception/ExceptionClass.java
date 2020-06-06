package com.Interface.pro.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionClass {

	@ExceptionHandler(NullPointerException.class)
	public String handleException(HttpServletRequest request, Exception ex) {
		return "Nullpointer exception Catched";
	}

}
