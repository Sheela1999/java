package com.xworkz.accessspecifier.access;

import com.xworkz.accessspecifier.Forest;

public class ForestOne extends Forest {
	
	public static void main(String[] args) {
		
		//for static variables to protected
		ForestOne.getSomeFressAir();
		
		//for public
		ForestOne.getForestName("Bannerghatta");
		
		//for non static variables
		Forest obj1 = new Forest();
		obj1.animals((byte) 102);
		
		ForestOne obj2 = new ForestOne();
		obj2.getRawMaterials();
		
	}
         
	
}
