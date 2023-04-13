package com.xworkz.hierarchicalinheritance2;

public class Tester extends Animal {
	
	public static void main(String[] args) {
		
		Cat obj = new Cat();
	
	obj.animalName = "Horse";
	obj.noOfAnimals = 276277;
	obj.catBreed = "Indian Billi";
	obj.isEveryOneLovesCat = false;
	
	System.out.println(obj.animalName);
	System.out.println(obj.noOfAnimals);
	System.out.println(obj.catBreed);
	System.out.println(obj.isEveryOneLovesCat);
	
	obj.eat();
	obj.communicative();
	obj.meow();
	obj.hunting();
	
	}

}
