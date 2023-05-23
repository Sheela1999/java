package com.xworkz.customexception.custom;

public class InvalidLanguageException extends Exception {
	
	public InvalidLanguageException() {
		System.out.println("default constructor");
	}
	
	public InvalidLanguageException(String ile) {
		super(ile);
		
	}

}
