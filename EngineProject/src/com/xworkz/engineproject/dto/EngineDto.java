package com.xworkz.engineproject.dto;

public class EngineDto {

	private String engineName;
	private String type;
	private String capacity;
	private int noOfCylinders;
	private int price;
	private String fuelSystem;
	private int speed;

	public EngineDto() {
		System.out.println("No Args Aconstructor");
	}

	public EngineDto(String engineName, String type, String capacity, int noOfCylinders, int price, String fuelSystem,
			int speed) {
		super();
		this.engineName = engineName;
		this.type = type;
		this.capacity = capacity;
		this.noOfCylinders = noOfCylinders;
		this.price = price;
		this.fuelSystem = fuelSystem;
		this.speed = speed;
	}

	public String getEngineName() {
		return engineName;
	}

	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public int getNoOfCylinders() {
		return noOfCylinders;
	}

	public void setNoOfCylinders(int noOfCylinders) {
		this.noOfCylinders = noOfCylinders;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getFuelSystem() {
		return fuelSystem;
	}

	public void setFuelSystem(String fuelSystem) {
		this.fuelSystem = fuelSystem;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "EngineDto [engineName=" + engineName + ", type=" + type + ", capacity=" + capacity + ", noOfCylinders="
				+ noOfCylinders + ", price=" + price + ", fuelSystem=" + fuelSystem + ", speed=" + speed + "]";
	}

}
