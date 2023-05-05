package com.xworkz.vegetables.dao;

import com.xworkz.vegetables.dto.VegetablesDto;

public class VegetableDao {

	VegetablesDto[] vegetables = new VegetablesDto[10];

	public boolean saveVegetables(VegetablesDto dto) {

		for (int i = 0; i < vegetables.length; i++) {
			if (vegetables[i] == null) {
				vegetables[i] = dto;
				System.out.println("saved successfully");
				return true;
			}
		}
		return false;

	}

	public VegetablesDto[] readAll() {
		return vegetables;
	}

	public boolean findByName(String name) {

		for (int i = 0; i < vegetables.length; i++) {
			if (vegetables[i] != null) {
				vegetables[i].getName().equals(name);
				System.out.println("name found");
				return true;
			}
		}
		return false;
	}

	public boolean deleteByName(String dltName) {

		for (int i = 0; i < vegetables.length; i++) {
			if (vegetables[i] != null) {
				if (vegetables[i].getName().equals(dltName)) {
					vegetables[i] = null;
					System.out.println("Deleted Successfully");
					return true;
				}
			}
		}
		return false;
	}

}
