package com.xworkz.laptop;

public abstract class Hp extends LaptopData {
	
	public abstract void hasTouchpad();
	
	public void storage() {
		System.out.println("To store the data");
	}
	
	public void playMusic() {
		System.out.println("Playing Music..");
	}
	
	public void runsSmoothly() {
		System.out.println("Hp has good usage");
	}
	
	public void toStorefiles() {
		System.out.println("To store data into the files");
	}

}
