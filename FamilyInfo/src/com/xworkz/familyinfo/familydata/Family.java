package com.xworkz.familyinfo.familydata;

public class Family {
	
	public int familyMembers;
	public String familyMemName;
	public String familyType;
	public boolean isFamilyImportantForEveryOne;
	public char firstLetterOfFamily;
	public long familyExpenditure;
	public float familyLovePercent;
	
	public Family(int familyMembers, String familyMemName, String familyType, boolean isFamilyImportantForEveryOne, char firstLetterOfFamily, long familyExpenditure, float familyLovePercent) {
		this.familyMembers = familyMembers;
		this.familyMemName = familyMemName;
		this.familyType = familyType;
		this.isFamilyImportantForEveryOne = isFamilyImportantForEveryOne;
		this.firstLetterOfFamily = firstLetterOfFamily;
		this.familyExpenditure = familyExpenditure;
		this.familyLovePercent = familyLovePercent;
		
		//System.out.println(this.familyMembers);
		//System.out.println(this.familyMemName);
		//System.out.println(this.familyType);
		//System.out.println(this.isFamilyImportantForEveryOne);
		//System.out.println(this.firstLetterOfFamily);
		//System.out.println(this.familyExpenditure);
		//System.out.println(this.familyLovePercent);
	}
	
	public String toString() {
		return "familyMembers: " +familyMembers  +" familyType: " +familyType  + " isFamilyImportantForEveryOne: " +isFamilyImportantForEveryOne  +" firstLetterOfFamily: " + firstLetterOfFamily   + " familyExpenditure: " +familyExpenditure  + " familyLovePercent: " +familyLovePercent;
	}
	
	public boolean equals(Family fam1) {
		
		if(this.familyMembers == fam1.familyMembers && this.familyMemName == fam1.familyMemName  && this.familyExpenditure == fam1.familyExpenditure) {
			
			return true;
		}
		else {
		
		return false;
		}
	}
}
