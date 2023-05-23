package com.xworkz.customexception.custom;

public class BalanceNotFoundException extends Exception {
	
	public BalanceNotFoundException() {
		
	}
	
	public BalanceNotFoundException(String bnfe) {
		super(bnfe);
	}

}
