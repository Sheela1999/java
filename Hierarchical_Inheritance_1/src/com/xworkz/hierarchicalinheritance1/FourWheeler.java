package com.xworkz.hierarchicalinheritance1;

public class FourWheeler extends Vehicle {
	
	String name = "Car";
	int carPrice = 567892;
	String color = "white";
	
	public void givesComfortable() {
		System.out.println("comfortable journey");
	}
	
	public void givesProtection() {
		System.out.println("gives protection from sun");
	}

}
