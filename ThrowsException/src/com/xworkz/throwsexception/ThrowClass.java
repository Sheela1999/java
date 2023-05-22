package com.xworkz.throwsexception;

import java.io.FileNotFoundException;

public class ThrowClass {

	public static void firstMethod() throws ClassNotFoundException {

		int A = 1 + (-5);

		if (A == (-4)) {

			throw new ClassNotFoundException("A is 0, so class not found");
		}
	}

	public static void secondMethod() throws FileNotFoundException {
		
		String s=null;  
		
		if(s == null) {
			throw new FileNotFoundException("s is null , so file not found");
		}

	}

}
