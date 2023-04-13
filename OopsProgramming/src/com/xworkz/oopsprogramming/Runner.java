package com.xworkz.oopsprogramming;

public class Runner extends Laptop{
	
	public static void main(String[] args) {
		
		Laptop laptop = new Laptop("Asus", 33000, 128, "NetBook", "16GB");
		Hp hp = new Hp("IntelHD", 15.60d, "speakers");
		Lenovo lenovo = new Lenovo("fingerprint", 14.00f, "windows11");
		Dell dell = new Dell("Touchpad", 8 ,"wndows11");
		
		
		laptop.toStorePhotos();
		laptop.storeFiles();
		laptop.toWriteProgram();
		hp.givesGoodPerformance();
		hp.toWatchMovies();
		lenovo.givesFingerPrint();
		lenovo.foldable();
		dell.givesTheOutput();
		dell.usage();
		
		
	}

}
