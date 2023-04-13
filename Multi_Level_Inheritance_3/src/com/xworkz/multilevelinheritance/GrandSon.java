package com.xworkz.multilevelinheritance;

public class GrandSon extends Son {
	
	String cycle = "B-twin";
	int noOfToys = 50;
	
	public void playing() {
		System.out.println("playing with toys and cycle");
	}

}
