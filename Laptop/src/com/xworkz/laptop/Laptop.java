package com.xworkz.laptop;

public abstract class Laptop {
	
	//abstract methods
	public abstract void storage();
	public abstract void playMusic();
	public abstract void hasTouchpad();
	public abstract void runsSmoothly();
	public abstract void toStorefiles();
	
	//concrete methods
	public static void playMovies() {
		System.out.println("playing movies...");	
	}
	
	public void toWriteProgrms() {
		System.out.println("To run java");
	}
	
	public void toStorePhotos() {
		System.out.println("To make a memories");
    }
}
