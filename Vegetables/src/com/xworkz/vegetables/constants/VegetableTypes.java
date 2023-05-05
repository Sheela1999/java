package com.xworkz.vegetables.constants;

public enum VegetableTypes {
	
	LEAFY_GREEN("leafy_green"), CRUCIFEROUS("cruciferous"), MARROW("marrow"), ROOT("root"),
	EDIBLE_PLANT_STEM("edible_plant_stem"), ALLIUM("allium");
	
	public String name;
	
	VegetableTypes(String name){
		this.name = name;
	}

}
