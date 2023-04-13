package com.xworkz.hierarchicalinheritance1;

public class Runner extends Vehicle {
	
	public static void main(String[] args) {
		
		FourWheeler r1 = new FourWheeler();
		TwoWheeler t1 = new TwoWheeler();
			
		System.out.println(r1.vehicleType);
		System.out.println(r1.price);
		System.out.println(r1.name);
		System.out.println(r1.carPrice);
		System.out.println(r1.color);
		System.out.println(t1.type);
		System.out.println(t1.bikePrice);
		
		r1.toTransport();
		r1.toTravel();
		r1.givesComfortable();
		r1.givesProtection();
		t1.ride();
		t1.lowPrice();
	}

}
