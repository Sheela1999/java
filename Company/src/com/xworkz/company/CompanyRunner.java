package com.xworkz.company;

import com.xworkz.company.dao.CompanyDao;

public class CompanyRunner {

	public static void main(String[] args) {
		
		CompanyDao dao = new CompanyDao();
		
	     dao.saveString("Sheela");
	     dao.saveString("Pallavi");
	     dao.saveString("Gowri");
	     dao.saveString("Shilpa");
	     dao.saveString("Nikitha");
	     dao.saveString("Nandhu");
	    
	  
	     dao.read();
		
	}
     
}

