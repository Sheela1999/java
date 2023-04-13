package com.xworkz.oopsprogramming;

public class Lenovo extends Laptop{
	
	String password;
	float screenSize;
	String os;
	
	public Lenovo(String password, float screenSize, String os) {
		this.password = password;
		this.screenSize = screenSize;
		this.os = os;
		
		System.out.println(this.password);
		System.out.println(this.screenSize);
		System.out.println(this.os);	
	}
	
	public void givesFingerPrint() {
		System.out.println("New feature of Lenovo");
	}
	
	public void foldable(){
		System.out.println("up to 180 degree foldable");
	}

}
