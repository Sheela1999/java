package com.xworkz.throwsexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExClass {
	
	//Checked Exception
	public static void firstMethod() throws FileNotFoundException {
	FileInputStream file = new FileInputStream("C:/D");
	System.out.println(file);
	}
	
	public static void secondMethod() throws FileNotFoundException {
		firstMethod();
	}
	
	//Unchecked Exception
	public static void myMethod() {
		int a = 50/0;
		System.out.println(a);
	}
	
	public static void thirdMethod()  {
		myMethod();
	}

}
