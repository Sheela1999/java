package com.xworkz.oopsprogramming;

public class Dell extends Laptop{
	
	String input ;
	int memory ;
	String os ;
	
	public Dell(String input, int memory, String os) {
		this.input = input;
		this.memory = memory;
		this.os = os;
		
		System.out.println(this.input);
		System.out.println(this.memory);
		System.out.println(this.os);
	}
	
	public void givesTheOutput(){
		System.out.println("gives the output");
	}
	
	public void usage(){
		System.out.println("using touchpad and pointer device");
		
	}

}
