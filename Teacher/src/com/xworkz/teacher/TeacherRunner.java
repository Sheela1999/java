package com.xworkz.teacher;

import com.xworkz.teacher.Dao.TeacherDao;
import com.xworkz.teacher.Dto.TeacherDto;

public class TeacherRunner {

	public static void main(String[] args) {
	
		TeacherDto dto = new TeacherDto();
		
		dto.setAddress("Belagavi");
		System.out.println(dto.getAddress());
		
		dto.setQualification("B.Ed");
		System.out.println(dto.getQualification());
		
		dto.setTeacherName("Shilpa");
		System.out.println(dto.getTeacherName());
		
		dto.setTeacherSalary(30000);
		System.out.println(dto.getTeacherSalary());

		dto.setTeachingSub("Biology");
		System.out.println(dto.getTeachingSub());
		
		//tostring
		dto.toString();
		
		//equals
		System.out.println(dto.equals(dto));
		
		System.out.println("--------------------------------------------------");
		
		//creating a DTO Object
		TeacherDao dao = new TeacherDao();
		
		//adding names
		dao.addTeacherName("Sheela");
		dao.addTeacherName("Shilpa");
		dao.addTeacherName("Gowri");
		dao.addTeacherName("Pallavi");
		dao.addTeacherName("Nikitha");
		dao.addTeacherName("Niara");
		dao.addTeacherName("Ria");
		
	System.out.println("update by index and name----------------------------------");	
		//updating names by index
		dao.updateTeacherNameByIndex("Mouna", 1);
		
		//update names by names
		dao.updateByTeacherName("Niara", "Amulya");
				
	System.out.println("searching name-----------------------------------------------------");	
		//search name
		boolean result = dao.search("sheela");
		System.out.println(result);
		
	System.out.println("____________________________________________________");
		//delete by index
		dao.deleteByIndex(5);
		
		//delete by name
		dao.DeleteByName("Gowri");
	
	System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		//read method
		String[] teacherNames = dao.read();
		for(int i=0; i<teacherNames.length; i++) {
			System.out.println(teacherNames[i]);
		}
	}

}
