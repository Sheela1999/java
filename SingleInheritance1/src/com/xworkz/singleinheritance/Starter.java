package com.xworkz.singleinheritance;

public class Starter extends Dog {

	public static void main(String[] args) {
		
	Starter obj = new Starter();
	
	System.out.println(obj.animalName);
	System.out.println(obj.noOfAnimals);
	System.out.println(obj.breeds);
	System.out.println(obj.isEveryOneLovesDog);
	
	obj.eat();
	obj.communicative();
	obj.security();
	obj.chasing();
	
	}
	
}
