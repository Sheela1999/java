package com.xworkz.familyinfo;

import com.xworkz.familyinfo.familydata.Family;

public class ManageFamily {
	
public static void main(String[] args) {
		
		Family family = new Family(5, "Madan", "Traditional nuclear family", 'F', 50000, 99.9f, (short) 30000);
		System.out.println(family);
		
		Family fam1 = new Family(5, "Madan", "Traditional nuclear family", 'F', 50000, 99.9f, (short) 32000);
		System.out.println(fam1);
		
		Family fam2 = new Family(9, "nayana", "Nuclear family", 'n', 200000, 100.0f, (short) 32768);
		System.out.println(fam2);
			
		Family fam3 = new Family(9, "nayana", "Nuclear family", 'n', 200000, 100.0f, (short) 31000);
		System.out.println(fam3);
		
		Family fam4 = new Family(3, "manya", "Single-Parent family", 'm', 25000, 99.99f, (short) 32767);
		System.out.println(fam4);
		
		//equals method
		
		System.out.println(family.equals(fam1)); 
	}

}
