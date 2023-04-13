package com.xworkz.multilevelinheritance1;

public class WetGrinder extends Grinder {
	
	String grinderBrand = "Egli";
	int motorSpeed =  960;
	byte noOfStones = 2;
	
	public void preparingbatter() {
		System.out.println("for dosa preparing batter");
	}
	
	public void cutting() {
		System.out.println("cut the hard things");
	}

}
