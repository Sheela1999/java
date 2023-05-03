package com.xworkz.computer.dto;

import com.xworkz.computer.dto.constants.ComputerType;

public class ComputerDto {
	
	private String brand;
	private String model;
	private String color;
	private int price;
	private ProcessorDto processor;
	public ComputerType type;

	public ComputerDto(String brand, String model, String color, int price, ProcessorDto processor, ComputerType type) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
		this.processor = processor;
		this.type = type;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

    public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	public ProcessorDto getProcessor() {
		return processor;
	}

	public void setProcessor(ProcessorDto processor) {
		this.processor = processor;
	}


	public ComputerType getType() {
		return type;
	}

	public void setType(ComputerType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ComputerDto [brand=" + brand + ", model=" + model + ", color=" + color + ", price=" + price
				+ ", processor=" + processor + ", type=" + type + "]";
	}
	
}
