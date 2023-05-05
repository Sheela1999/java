package com.xworkz.vegetables;

import com.xworkz.vegetables.constants.VegetableTypes;
import com.xworkz.vegetables.dao.VegetableDao;
import com.xworkz.vegetables.dto.NutrientsDto;
import com.xworkz.vegetables.dto.VegetablesDto;

public class VegetableTester {

	public static void main(String[] args) {

	NutrientsDto nutriDto =	new NutrientsDto("Vitamin A", "509 micrograms");
	NutrientsDto nutriDto1 = new NutrientsDto("Iron, Vitamin A and c", "133 micrograms");
	NutrientsDto nutriDto2 = new NutrientsDto("Phytonutrients and Vitamin K", "142 grams");
	NutrientsDto nutriDto3 = new NutrientsDto("Vitamin C", "22 Calories");
	
	VegetablesDto vegDto = new VegetablesDto("Carrot", 42, nutriDto, VegetableTypes.ROOT, "Orange");
	
	VegetablesDto vegDto1 = new VegetablesDto("Lettuce", 88, nutriDto1, VegetableTypes.LEAFY_GREEN, "light green to reddish brown");
	
	VegetablesDto vegDto2 = new VegetablesDto("Cucumber", 32, nutriDto2, VegetableTypes.MARROW, "Green and Orange");
	
	VegetablesDto vegDto3 = new VegetablesDto("Cabbage", 25, nutriDto3, VegetableTypes.CRUCIFEROUS, "Pale green");
	
	VegetableDao dao = new VegetableDao();
	
	boolean save = dao.saveVegetables(vegDto);
	System.out.println(save);
	
	boolean save1 = dao.saveVegetables(vegDto1);
	System.out.println(save1);
	
	boolean save2 = dao.saveVegetables(vegDto2);
	System.out.println(save2);
	
	boolean save3 = dao.saveVegetables(vegDto3);
	System.out.println(save3);
	
	System.out.println("Enum String");
	
	System.out.println(VegetableTypes.ROOT.name);
	
	System.out.println("--------------------------------------------------------------------");
	
	boolean find = dao.findByName("Lettuce");
	System.out.println(find);
	
	System.out.println("---------------------------------------------------------------------");
	
	boolean delete = dao.deleteByName("Cucumber");
	System.out.println(delete);
	
	System.out.println("-------------------------------------------------------------------");
	
	VegetablesDto[] readVegs = dao.readAll();
	
	for(int i=0; i<readVegs.length; i++) {
		System.out.println(readVegs[i]);
	}

	}

}
