package com.xworkz.busproject.busdata;

import com.xworkz.busproject.constants.BusType;

public class Bus {
	
	public BusType busName;
    static long busPrice;
	private static byte ticketPrice;
	protected static String colour;
	protected String busCompany;
	private int noOfPassenger;
	int busCapacity;
	public String type;
	Float mileage;
	char firstLetterOfTheBus;
	
	public static void transport() {
		System.out.println("transport things from one place to another place");
		byte ticketPrice = 50;
		System.out.println(ticketPrice);
		
	}
	
	public void givesComfort() {
		System.out.println("our journey is very comfortable in the bus");
		int noOfPassenger = 80;
		System.out.println(noOfPassenger);
		
		givesafeJourney();
	}
	
	private void givesafeJourney() {
		System.out.println("we can reach safely to our home town");
	}
	
	static void consumeFuel() {
		System.out.println("bus consume the petrol and diesel");
	}
	
	protected static void carryPassengers() {
		System.out.println("bus carry the passengers from one place to another place");
	}
	
	public Bus() {
		System.out.println("Default Constructor");
	}
	
	public Bus(String busCompany, int busCapacity, String type, Float mileage, char firstLetterOfTheBus) {
		this.busCompany = busCompany;
		this.busCapacity = busCapacity;
		this.type = type;
		this.mileage = mileage;
		this.firstLetterOfTheBus = firstLetterOfTheBus;
	
		System.out.println(this.busCompany);
		System.out.println(this.busCapacity);
		System.out.println(this.type);
		System.out.println(this.mileage);
		System.out.println(this.firstLetterOfTheBus);
	}
}
