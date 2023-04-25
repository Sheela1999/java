package com.xworkz.company.dao;

public class CompanyDao {
	
    String[] employeeName = new String[6];
	
	
	public String[] saveString(String str) {
		
		if(str!=null & str.length()<=8) {
			System.out.println("Employee name is valid ");
			
			    
			for(int i=0; i<str.length(); i++) {
				if(employeeName[i]==null) {
				
					employeeName[i]=str;
				System.out.println("Employee name is "+employeeName[i]);
				return employeeName;
				}
			
			}
		}	 
				
			System.out.println("EmployeeName is Not Valid");
			return employeeName;
		}
			
	
	public void read() {
		for(int i=0; i<employeeName.length; i++) {
			System.out.println(employeeName[i]);
			
			}
	}
	
}

