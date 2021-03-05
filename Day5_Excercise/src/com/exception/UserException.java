package com.exception;

public class UserException extends Exception {

	private String message;

	public UserException() {
		super();
	}

	public UserException(String message) {
		super(message);
	}

}
