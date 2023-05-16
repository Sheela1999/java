package com.xworkz.encapsulation.data;

public class Runner {

	public static void main(String[] args) {
		
		//in the same package we can access public and protected in runner class
        LaptopDao  data = new LaptopDao("Hp", 31000, "intel1", "5th gen");
		
		LaptopDao  data1 = new LaptopDao("Asus", 39000, "intel2", "10th gen");
		
		data.setGenaration("i7");
		System.out.println(data.getGenaration());
		
		System.out.println("---------------------------------------------------");
		
		data1.processor = "intel3";
		System.out.println(data1.processor);
		

	}

}
