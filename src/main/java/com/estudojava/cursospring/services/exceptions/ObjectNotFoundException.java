package com.estudojava.cursospring.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {
	
	public static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
	
	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
		
}

