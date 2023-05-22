package com.xworkz.throwsexception;

import java.io.FileNotFoundException;

public class ThrowsRunner {
	
	public static void main(String[] args) {
		
		//checked exception
		try {
			//checked exception
			ThrowsExClass.secondMethod();
			
			//unchecked exception
			ThrowsExClass.thirdMethod();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (ArithmeticException ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Continue Execution....");
	}

}
