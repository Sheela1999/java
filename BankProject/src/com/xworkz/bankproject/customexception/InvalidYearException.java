package com.xworkz.bankproject.customexception;

public class InvalidYearException extends Exception {
	
	public InvalidYearException() {
		super();
	}
	
	public InvalidYearException(String message) {
		super(message);
	}

}
