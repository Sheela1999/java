package com.xworkz.multilevelinheritance2;

public class Tester extends Program {
	
	public static void main(String[] args) {
		
		Tester obj = new Tester();
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salary);
		System.out.println(obj.experience);
		System.out.println(obj.type);
		System.out.println(obj.noOfPrograms);

		obj.getname();
		obj.devoloping();
		obj.giveOutput();
		
	}

}
