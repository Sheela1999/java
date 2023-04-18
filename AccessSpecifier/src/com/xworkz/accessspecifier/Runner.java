package com.xworkz.accessspecifier;

public class Runner {
	
	public static void main(String[] args) {
		
		//For Static Variables
		//calling public and private method
		Forest.getForestName("Bannerghatta");
		System.out.println(Forest.bioDiversity);
		Forest.forest();
		
		//calling default method
		Forest.vegetation();
		
		//calling protected method
		Forest.getSomeFressAir();
		System.out.println(Forest.bioDiversity);
		
		//for Non Static Variable
		Forest obj = new Forest();
		//calling public and private method
		obj.animals((byte) 102);
		obj.nationalPark();
		
		//calling default method
		obj.veterinaryCare();
		
		//calling protected method 
		obj.getRawMaterials();
	}

}
