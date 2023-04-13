package com.xworkz.multilevelinheritance;

public class Runner extends GrandSon {
	
	public static void main(String[] args) {
		
		Runner r1 = new Runner();
		
		System.out.println(r1.money);
		System.out.println(r1.car);
		System.out.println(r1.bike);
		System.out.println(r1.age);
		System.out.println(r1.cycle);
		System.out.println(r1.noOfToys);
		
		r1.care();
		r1.gym();
		r1.playing();
		
	}

}
