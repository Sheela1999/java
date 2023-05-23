package com.xworkz.customexception.custom;

public class InvalidPinException extends Exception {
	
	public InvalidPinException() {
		System.out.println("default constructor");
	}
	
	public InvalidPinException(String str) {
		super(str);
	}

}
