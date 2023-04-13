package com.xworkz.oopsprogramming;

public class Laptop {
	
	String laptopName;
	int price;
	int storage;
	String type;  
	String ram;
	
	public Laptop() {
		System.out.println("Default Constructor");
	}
	
	public Laptop(String laptopName, int price, int storage, String type, String ram) {
		this.laptopName = laptopName;
		this.price = price;
		this.storage = storage;
		this.type = type;
		this.ram = ram;
		
		System.out.println(this.laptopName);
		System.out.println(this.price);
		System.out.println(this.storage);
		System.out.println(this.type);
		System.out.println(this.ram );
	}
	
	public void toStorePhotos(){
		System.out.println("To make a memories");
		
	}
	
	public void storeFiles(){
		System.out.println("To Store Data");
	}
	
	public void toWriteProgram(){
		System.out.println("To run java");
	}

}
