package com.xworkz.multilevelinheritance1;

public class Grinder extends Electronics {
	
	String grinderCompany = "Bosch";
	int speed = 2800;
	String grinderType = "Angle";
	
	public Grinder() {
		System.out.println("Default Constructor");
	}
	
	public void spinning() {
		System.out.println("angle Grinder spins for cut");
	}
	
	public void polishing() {
		System.out.println("polish");
	}
	

}
