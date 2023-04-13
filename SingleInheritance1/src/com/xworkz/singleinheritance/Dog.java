package com.xworkz.singleinheritance;

public class Dog extends Animal {
	
	String breeds = "Mudhol";
	boolean isEveryOneLovesDog = false;
	
	public void security() {
		System.out.println("Dog gives Us Security");
	}
	
	public void chasing() {
		System.out.println("Dogs chases cats");
	}

}
