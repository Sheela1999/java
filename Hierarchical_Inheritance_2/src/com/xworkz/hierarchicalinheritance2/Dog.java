package com.xworkz.hierarchicalinheritance2;

public class Dog extends Animal {
	
	String breeds = "Indian Spitz";
	boolean isEveryOneLovesDog = false;
	
	public void barking() {
		System.out.println("Barking...");
	}
	
	public void chasing() {
		System.out.println("Dogs chases cats");
	}

}
