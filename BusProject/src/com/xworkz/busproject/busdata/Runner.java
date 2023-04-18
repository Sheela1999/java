package com.xworkz.busproject.busdata;

import com.xworkz.busproject.constants.BusType;

public class Runner {
	
	public static void main(String[] args) {
		//public for static
		Bus.transport();
		
		//creating object
		System.out.println("-----------------------------");
		Bus bus = new Bus("Go Transit", 100, "articulated buses", 4.3f, 'K');
		
		System.out.println("------------------------------");
		System.out.println(BusType.BMTC.name);
		
		System.out.println("------------------------------");
		Bus.busPrice = 100000;
		System.out.println(Bus.busPrice);
		Bus.colour= "Blue";
		System.out.println(Bus.colour);
	    
		//public for non static
		System.out.println("------------------------------");
		bus.givesComfort();
		//default for static 
		System.out.println("------------------------------");
		Bus.consumeFuel();
		//protected for static
		System.out.println("------------------------------");
		Bus.carryPassengers();
		
		
		
		
	}

}
