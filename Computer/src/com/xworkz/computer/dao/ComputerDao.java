package com.xworkz.computer.dao;

import com.xworkz.computer.dto.ComputerDto;
import com.xworkz.computer.dto.ProcessorDto;

public class ComputerDao {
	
	ComputerDto[] computer = new ComputerDto[10];
	
	public boolean save(ComputerDto dto) {
		if(dto!=null){
			System.out.println("dto is not null");
			
			if(dto.getBrand() != null && dto.getColor() != null && dto.getModel() != null) {
				System.out.println("variables are valid");
				
				for(int i=0; i<computer.length; i++) {
					if(computer[i] == null) {
						computer[i] = dto;
						System.out.println("The Array is saved successfully");
						return true;
					}
					System.out.println("not saved");
					
				}
				System.out.println("index is not having enough space");
				return false;
				
			}
			System.out.println("variables are not valid");
			return false;
		}
		System.out.println("dto is null, check dto");
		return false;
	}
	
	public ComputerDto[] readAll() {
		return computer;
	}
	
	public boolean findByBrand(String brand) {
		if(brand!=null) {
			if(brand.length()>=1) {
				
				for (int i=0; i<computer.length; i++) {
					if(computer[i]!=null) {
						computer[i].getBrand().equals(brand);
						System.out.println("Brand name is found");
						return true;
					}
				}
				System.out.println("brand not having space");
				return false;
				
			}
			System.out.println("brand length is not valid");
			return false;
		}
		System.out.println("brand is null");
		return false;
	}
	
	public boolean findByModel(String model) {
		if(model!=null) {
			if(model.length()>=1) {
				
				for (int i=0; i<computer.length; i++) {
					if(computer[i]!=null) {
						computer[i].getModel().equals(model);
						System.out.println("model name is found");
						return true;
					}
				}
				System.out.println("model not having space");
				return false;
				
			}
			System.out.println("model length is not valid");
			return false;
		}
		System.out.println("model is null");
		return false;
	}
	
	public boolean updateModelByBrand(String brand, String model) {
		if(brand!=null && model!=null) {
			System.out.println("brand and models are not null");
			if(model.length()>=1) {
				
				for(int i=0; i<computer.length; i++) {
					if(computer[i]!=null) {
						if(computer[i].getBrand().equals(brand)) {
							computer[i].setModel(model);
							System.out.println("Model is updated successfully by brand");
							return true;
						}
						System.out.println("model is not updated");
					}
					
				}
				System.out.println("brand not found");
				return false;	
			}
			System.out.println("model Length is not valid");
			return false;
		}
		System.out.println("brand and models are null");
		return false;
	}
	
	public boolean updateProcessorByBrand(String brand, ProcessorDto obj4) {
		if(brand!=null && obj4!=null) {
			
			for(int i=0; i<computer.length; i++) {
				if(computer[i]!=null) {
					if(computer[i].getBrand().equals(brand)) {
						computer[i].setProcessor(obj4);
						System.out.println(" obj updated successfully");
						return true;
						}
				}
			}
			
		}
		System.out.println("brand and obj is null");
		return false;
	}
	
	public boolean deleteByColor(String dltColor) {
		if(dltColor!=null) {
			
			for(int i=0; i<computer.length; i++) {
				if(computer[i]!=null) {
					if(computer[i].getColor().equals(dltColor)) {
						computer[i] = null;
						System.out.println("color is deleted successfully");
						return true;
					}
					System.out.println("color is not deleted");
				}
			}
			System.out.println("index is not having enough space");
			return false;		
		}
		System.out.println("deleting color is null");
		return false;
	}
	
	public boolean deleteByBrand(String dltBrand) {
		if(dltBrand!=null) {
			
			for(int i=0; i<computer.length; i++) {
				if(computer[i]!=null) {
					if(computer[i].getBrand().equals(dltBrand)) {
						computer[i] = null;
						System.out.println("brand is deleted successfully");
						return true;
					}
					System.out.println("brand is not deleted");
				}
			}
			System.out.println("index is not having enough space");
			return false;		
		}
		System.out.println("deleting brand is null");
		return false;
	}

}
