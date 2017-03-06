package com.raeside.family.exceptions;

public class SurnameExistsException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public SurnameExistsException (String message) {
			super(message);
	}

}
