package com.exception;

public class CustomExceptionFour extends Exception {

	private String message;

	public CustomExceptionFour() {
		super();
	}

	public CustomExceptionFour(String message) {
		super(message);
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}

}
