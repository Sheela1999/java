package com.xworkz.customexception.custom;

public class InsufficientBalanceException extends Exception {
	
	public InsufficientBalanceException() {
		System.out.println("default constructor");
	}
	
	public InsufficientBalanceException(String s) {
		super(s);
	}
	

}
