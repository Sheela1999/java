package com.xworkz.busproject;

import com.xworkz.busproject.busdata.Bus;

public class BusStarter extends Bus {
	
	public static void main(String[] args) {
		
		BusStarter bus1 = new BusStarter();
		
		//calling protected variables
		bus1.busCompany = "Go Transit";
		System.out.println(bus1.busCompany);
		Bus.colour= "Blue";
		System.out.println(Bus.colour);
		
		//calling public methods
		System.out.println("---------------------------------------");
		Bus.transport();
		bus1.givesComfort();
	}

}
