package com.xworkz.vegetables.dto;

public class NutrientsDto {
	
	private String nutrientName;
	private String quantity;
	
	public NutrientsDto(String nutrientName, String quantity) {
		super();
		this.nutrientName = nutrientName;
		this.quantity = quantity;
	}

	public String getNutrientName() {
		return nutrientName;
	}

	public void setNutrientName(String nutrientName) {
		this.nutrientName = nutrientName;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "NutrientsDto [nutrientName=" + nutrientName + ", quantity=" + quantity + "]";
	}
	
}
