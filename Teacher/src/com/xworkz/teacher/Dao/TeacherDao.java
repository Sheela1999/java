package com.xworkz.teacher.Dao;

public class TeacherDao {
	
	String[] teacherNames = new String[7];
	
	//Add teacher names
	public String addTeacherName(String teacherName) {
		if(teacherName!= null && teacherName.length()>=4) {
				System.out.println("given name is valid");
				
				for(int i=0; i<teacherNames.length; i++) {
					if(teacherNames[i] == null) {
					teacherNames[i] = teacherName;
					System.out.println("Teacher name is added : " + teacherNames[i]);
					return teacherName;
				}
				}
				{
				System.out.println("Teacher Name " + teacherName + " is not added");
				}
			}
			{
			System.out.println("given teacher name " + teacherName + " is not valid");
			return teacherName;
			}
	}
	
	public String[] read() {
		return teacherNames;
	}
	
	public String updateTeacherNameByIndex(String name, int index) {
		if(name!=null) {
			if(name.length()>=4) {
				
				teacherNames[index] = name;
				System.out.println("The given Teacher name "+ name + " is updated");
				return name;
			}
			{
				System.out.println("Teacher name " + name + " not updated");
			}
		}
		{
			System.out.println("Teacher name " + name + " not null");
		}
		return name;
	}
	
	public String updateByTeacherName(String presentteacherName, String updatingteacherName) {
		if (presentteacherName != null) {
			if (updatingteacherName != null) {
				if (updatingteacherName.length() >= 4) {
					System.out.println("The Given teacher Name  " + updatingteacherName + "  Is Valid");
					for (int i = 0; i < teacherNames.length; i++) {
						if (teacherNames[i] != null) {

							if (teacherNames[i].equals(presentteacherName)) {
								System.out.println("Given Previous Name " + presentteacherName + " is valid");
								teacherNames[i] = updatingteacherName;
								System.out.println("The TeacherName " + updatingteacherName + "  is updated");
								return updatingteacherName;

							}
						}
						{
							System.out.println("Previous Name is not Found");
						}

					}

					{
						System.out.println("The ArrayIndex is null");
					}

					{
						System.out.println("Given updating teacherName length is not valid");
					}

				}
				{
					System.out.println("updating name is null");
				}

			}
			{
				System.out.println("Previous name is null");
			}

		}
		return updatingteacherName;
	}

	public boolean search(String teacherName) {
		if(teacherName!= null) {
			if(teacherName.length()> 3) {
				
				for(int i=0; i<teacherNames.length; i++) {
					if(teacherNames[i]!=null) {
						if(teacherNames[i].equals(teacherName)){
							System.out.println("Teacher name is found");
							return true;
						}
						
						{
							System.out.println("given name " + teacherName + " is not found");
							return false;
						}
					}
				}
				return false;
			}
			{
				System.out.println("given name "+ teacherName + " length is not valid");
				return false;
			}
		}
		{
			System.out.println("teacher name " + teacherName + " is Null");
			return false;
		}
	}
	
	public boolean deleteByIndex(int index) {
		if (index >= 0) {
			if (index < teacherNames.length) {
				teacherNames[index] = null;
				System.out.println("Deleted Successfully");
				return true;
			}
			{
				System.out.println("Index Length is not valid");

			}
		}
		{
			System.out.println("Negetive Index Is given");
		}
		return false;
	}

	public boolean DeleteByName(String dltName) {
		if (dltName != null) {
			for (int i = 0; i < teacherNames.length; i++) {
				if (dltName.equals(teacherNames[i])) {
					teacherNames[i] = null;
					System.out.println("Deleted successfully");
					return true;
				}
			}
			{
				System.out.println("The length of the name is not valid");

			}
		}
		{
			System.out.println("The delete Name Is null");
			return false;
		}
	}
}
	
