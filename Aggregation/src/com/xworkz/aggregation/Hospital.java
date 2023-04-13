package com.xworkz.aggregation;

public class Hospital {
	
	String hospitalName;
	int noOfPaitients;
	boolean isThisHospitalOnlyForRichPeople;
	char hospitalBlocks;
	double successPercent;
	
	Doctors doctors;
	Paitient paitient;
	Employee employee;
	Treatment treatment;
	
	public void goodHealth() {
		System.out.println("Hospital provides the medical and surgical treatment and nursing care for sick or injured people");
	}
	

}
