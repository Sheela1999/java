package com.xworkz.oopsprogramming;

public class Hp extends Laptop{
	
	String genProcessor;
	double screenSize;
	String inputs;
	
	public Hp () {
		System.out.println("Default Constructor");
	}
	
	public Hp(String genProcessor, double screenSize, String inputs) {
		this.genProcessor= genProcessor;
		this.screenSize = screenSize;
		this.inputs = inputs;
		
		System.out.println(this.genProcessor);
		System.out.println(this.screenSize);
		System.out.println(this.inputs);
	}
	
	public void givesGoodPerformance(){
		System.out.println("good Speed Performance");
	}
	
	public void toWatchMovies(){
		System.out.println("watching movies");
	}
	

}
