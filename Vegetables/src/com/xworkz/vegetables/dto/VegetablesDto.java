package com.xworkz.vegetables.dto;

import com.xworkz.vegetables.constants.VegetableTypes;

public class VegetablesDto {
	
	private String name;
	private int price;
	private NutrientsDto nutrients;
	private VegetableTypes type;
	private String color;
	
	public VegetablesDto() {
		System.out.println("No Args Constructor");
	}

	public VegetablesDto(String name, int price, NutrientsDto nutrients, VegetableTypes type, String color) {
		super();
		this.name = name;
		this.price = price;
		this.nutrients = nutrients;
		this.type = type;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public NutrientsDto getNutrients() {
		return nutrients;
	}

	public void setNutrients(NutrientsDto nutrients) {
		this.nutrients = nutrients;
	}

	public VegetableTypes getType() {
		return type;
	}

	public void setType(VegetableTypes type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "VegetablesDto [name=" + name + ", price=" + price + ", nutrients=" + nutrients + ", type=" + type
				+ ", color=" + color + "]";
	}
	
}
