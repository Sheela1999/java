package com.xworkz.hierarchicalinheritance1;

public class TwoWheeler extends Vehicle {
	
	String type = "bike";
	int bikePrice = 80000;
	
	public void ride() {
		System.out.println("comfortable ride");
	}
	
	public void lowPrice() {
		System.out.println("we can it in less price");
	}

}
