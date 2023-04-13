package com.xworkz.aggregation;

public class Tester {
	
	public static void main(String[] args) {
		
		Hospital hos = new Hospital();
		
		hos.hospitalName = "Narayana";
		hos.noOfPaitients = 2000;
		hos.isThisHospitalOnlyForRichPeople = true;
		hos.hospitalBlocks = 'z';
		hos.successPercent = 85.88d;
		
		hos.goodHealth();
		
		System.out.println(hos.hospitalName);
		System.out.println(hos.noOfPaitients);
		System.out.println(hos.isThisHospitalOnlyForRichPeople);
		System.out.println(hos.hospitalBlocks);
		System.out.println(hos.successPercent);
		
		Doctors doc = new Doctors();
		
		doc.doctorsName = "Shilpa";
		doc.doctorsSalary = 100000;
		doc.doctorsAge = 25;
		doc.doctorsDesignation = "MBBS MD";
		doc.isEveryDoctorsDoThereJobForMoney = false;
		
		doc.provideTreatment();
		
		System.out.println(doc.doctorsName);
		System.out.println(doc.doctorsSalary);
		System.out.println(doc.doctorsAge);
		System.out.println(doc.doctorsDesignation);
		System.out.println(doc.isEveryDoctorsDoThereJobForMoney);
		
		Paitient pat = new Paitient();
		
		pat.paitientName = "Rama";
		pat.paitientAge = 40;
		pat.weight = 45;
		pat.diseaseName = "Typhoid";
		pat.paitientBloodGroup = "O+";
	
		pat.healthy();
		
		System.out.println(pat.paitientName);
		System.out.println(pat.paitientAge );
		System.out.println(pat.weight);
		System.out.println(pat.diseaseName);
		System.out.println(pat.paitientBloodGroup);
		
		Employee emp = new Employee();
		
		emp.employeeDesignation = "Nurse";
		emp.employeeName = "Shree";
		emp.employeeAge = 25;
		emp.Qualification = "Bsc Nursing";
		emp.salary = 30000;
		
		emp.takingCare();
		
		System.out.println(emp.employeeDesignation);
		System.out.println(emp.employeeName);
		System.out.println(emp.employeeAge);
		System.out.println(emp.Qualification);
		System.out.println(emp.salary);
		
		Treatment tre = new Treatment();
		
		tre.treatmentName = "Antiniotic Therapy";
		tre.noOfTreatmens = 4;
		tre.tabletName = "ciprofloxacin";
		tre.bp = 120;
		tre.isThisTreatmentGoingToWorkOrNot = true;
		
		tre.process();
		
		System.out.println(tre.treatmentName);
		System.out.println(tre.noOfTreatmens);
		System.out.println(tre.tabletName);
		System.out.println(tre.bp);
		System.out.println(tre.isThisTreatmentGoingToWorkOrNot);

	}

	
}
