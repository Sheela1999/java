package com.xworkz.polymorphism;

public class Runner {
	
	public static void main(String[] args) {
		
	//	
	   Vehicle veh = new Vehicle(); 
	   veh.ride();
	   veh.travel();
	   veh.consume((byte) 25, (byte) 7);
	   
	   Car car = new Car();
	   car.ride();
	   car.travel();
	   car.consume();
	   
	   Bike bike = new Bike();
	   bike.ride();
	   bike.travel();
	   bike.consume(5, 10);
	   
	   Airplane air = new Airplane();
	   air.ride();
	   air.travel();
	   air.consume();
	   
	   Trains tra = new Trains();
	   tra.ride();
	   tra.travel();
	   tra.consume();
	   
	   Ship ship = new Ship();
	   ship.ride("INS Mormugao");
	   ship.travel();
	   ship.consume();	
	   
		
	}

}

class Vehicle {
	
	public void ride() {
		System.out.println("Vehicle riding...");
	}
	
	public void travel() {
		System.out.println("Vehicle is used for travel");
		
	}
	
	public void consume(byte a, byte b) {
		System.out.println(a * b);
		System.out.println("Vehicle consume petrol");
	}
}

class Car extends Vehicle {
	
	public void ride() {
		System.out.println("Car riding...");
	}
	
	public void travel() {
		System.out.println("Car is very comfortable to travel");
		
	}
	
	public void consume() {
		System.out.println("Car consumes more fuel due to over Speeding");
	}
}

class Bike extends Vehicle {
	
	public void ride() {
		System.out.println("Bike riding...");
	}
	
	public void travel() {
		System.out.println("Bike is easy to travel");
		
	}
	
	public void consume(int petrol, int diesel) {
		System.out.println(petrol + diesel);
		System.out.println("Bike consume petrol and diesel");
	}
}

class Airplane extends Vehicle {
	
	public void ride() {
		System.out.println("Airplane riding...");
	}
	
	public void travel() {
		System.out.println("Travelling in Sky");
		
	}
	
	public void consume() {
		System.out.println("Airplane consume 4 liters of fuel every second");
	}
}

class Trains extends Vehicle{
	
	public void ride() {
		System.out.println("Train riding...");
	}
	
	public void travel() {
		System.out.println("Travelling in train is faster");
		
	}
	
	public void consume() {
		System.out.println("Train consume diesel fuel");
	}
}

class Ship extends Vehicle {
	
	public void ride(String name) {
		System.out.println(name);
		System.out.println("Ship riding...");
	}
	
	public void travel() {
		System.out.println("Travelling on a ship called Yachting");
		
	}
	
	public void consume() {
		System.out.println("Ship consume bunker fuel");
	}
}
