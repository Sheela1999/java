package com.xworkz.customexception.custom;

public class InvalidUserPin extends Exception {
	
	public InvalidUserPin() {
		System.out.println("default constructor");
	}
	
	public InvalidUserPin(String message) {
		super(message);
	}

}
