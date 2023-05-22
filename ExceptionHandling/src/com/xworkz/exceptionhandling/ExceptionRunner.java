package com.xworkz.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionRunner {

	public static void main(String[] args) {

			try {
				FileInputStream f = new FileInputStream("C:\\Users\\india\\Documents\\Practice.txt");
				System.out.println("Hii");
				Class.forName("jskfhadgjag");
				
			} 
			
			catch (FileNotFoundException e) {
				e.printStackTrace();
				//System.out.println("file not found, but handled");
			}

			catch (ClassNotFoundException e1) {
				e1.printStackTrace();
				//System.out.println("class not found , but handled");
			}
			
			System.out.println("hello");


	}

}
