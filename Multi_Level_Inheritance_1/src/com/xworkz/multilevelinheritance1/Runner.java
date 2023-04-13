package com.xworkz.multilevelinheritance1;

public class Runner extends WetGrinder {
	
	public static void main(String[] args) {
		
		Runner obj = new Runner();
		
		System.out.println(obj.manufacturingCompany);
		System.out.println(obj.electronicDevice);
		System.out.println(obj.typesOfElectronics);
		System.out.println(obj.grinderCompany);
		System.out.println(obj.speed);
		System.out.println(obj.grinderType);
		System.out.println(obj.grinderBrand);
		System.out.println(obj.motorSpeed);
		System.out.println(obj.noOfStones);
		
		obj.deviceType();
		obj.energy();
		obj.spinning();
		obj.polishing();
		obj.preparingbatter();
		obj.cutting();
	}

}
