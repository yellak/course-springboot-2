package com.kalley.javacourse.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	/**
	 * Serial ID version
	 */
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Resource not found. Id " + id);
	}

}
