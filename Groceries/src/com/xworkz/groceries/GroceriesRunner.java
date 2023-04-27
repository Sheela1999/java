package com.xworkz.groceries;

import com.xworkz.groceries.dao.GroceriesDao;
import com.xworkz.groceries.dto.GroceriesDto;

public class GroceriesRunner {

	public static void main(String[] args) {
		
		GroceriesDto obj = new GroceriesDto();
		GroceriesDao obj2 = new GroceriesDao();
		
		obj.setShopName("Daya Shop");
		System.out.println(obj.getShopName());
		
		obj.setType("Offline Mode");
		System.out.println(obj.getType());
			
		obj.setChacolateName("KitKat");
		System.out.println(obj.getChacolateName());
		
		obj.setChacolatePrice(50);
		System.out.println(obj.getChacolatePrice());
		
		obj.setLocation("BTM");
		System.out.println(obj.getLocation());
		
		// Calling addGrocery method
		obj2.addGrocery("Wheat Flour");
		obj2.addGrocery("WF");
		obj2.addGrocery("Garam Masala");
		obj2.addGrocery("Shampoo");
		obj2.addGrocery(null);
		obj2.addGrocery("Salt");		

//Calling updatedbyIndexMethod
		obj2.updateGroceryByIndex("WHEAT FLOUR", 0);
		obj2.updateByGroceryName("Shampoo", "CLINIC PLUS");

		// Calling deleteBy Index Method
		obj2.deleteByIndex(1);

//Calling DeletedByName Method
		obj2.DeleteByName("WF");

		obj2.read();
	}


}
