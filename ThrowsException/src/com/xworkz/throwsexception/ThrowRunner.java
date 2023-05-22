package com.xworkz.throwsexception;

import java.io.FileNotFoundException;

public class ThrowRunner {

	public static void main(String[] args) {
		
		try {
			ThrowClass.firstMethod();
		} 
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			ThrowClass.secondMethod();
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Rest of the code...");

	}

}
