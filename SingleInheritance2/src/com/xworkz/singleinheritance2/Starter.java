package com.xworkz.singleinheritance2;

public class Starter extends India {
	
	public static void main(String[] args) {
		
		Starter nation = new Starter();
		
		System.out.println(nation.nationName);
		System.out.println(nation.noOfNations);
		System.out.println(nation.noOfStates);
		System.out.println(nation.capitalName);
		
		
		nation.nationality();
		nation.goodPlatform();
		
		nation.technology();
		nation.giveSetOfRules();
	}

}
