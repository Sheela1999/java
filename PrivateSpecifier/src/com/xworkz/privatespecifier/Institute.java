package com.xworkz.privatespecifier;

public class Institute {
	
	private static String institute = "Xworkz";
	private static int noOfStudents = 10;
	private static String studentsName ="sheela";
	private static long trainerSalary = 100000;
	
	public static String getInformation() {
		System.out.println(institute);
		return institute;
	}
	
	public static int education() {
		System.out.println(noOfStudents);
		return noOfStudents;
	}
	
	public static String getStudentName() {
	    System.out.println(studentsName);
	    return studentsName;
	}

	public static long getSalary() {
		System.out.println(trainerSalary);
		return trainerSalary;
	}
}
