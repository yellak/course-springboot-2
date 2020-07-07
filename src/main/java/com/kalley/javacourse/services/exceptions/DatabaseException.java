package com.kalley.javacourse.services.exceptions;

public class DatabaseException extends RuntimeException {

	/**
	 * Default serial ID version.
	 */
	private static final long serialVersionUID = 1L;
	
	public DatabaseException(String msg) {
		super(msg);
	}

}
