package com.xworkz.resume;

import com.xworkz.resume.dao.ResumeDAO;
import com.xworkz.resume.dto.AddressDto;
import com.xworkz.resume.dto.ResumeDTO;

public class ResumeTester {

	public static void main(String[] args) {

		AddressDto address = new AddressDto((byte) 002, "Mugalkhod", "Belagavi", 591235, "Karnataka");

		AddressDto address1 = new AddressDto((byte) 003, "Mijar", "Manglore", 500658, "Karnataka");

		AddressDto address2 = new AddressDto((byte) 004, "Btm", "Bengalore", 600091, "Karnataka");
		
		AddressDto address3 = new AddressDto((byte) 005, "Saptapur", "Dharwad", 680052, "Karnataka");
		
		AddressDto address4 = new AddressDto((byte) 006, "JKD", "Bagalkot", 680059, "Karnataka");
		
		ResumeDTO dto = new ResumeDTO("Sheela Golasangi", "Hanamant", "Sept 23rd", 9163746453l, "sheelaxworkz@gamil.com",
				"B.E", address);
		
		ResumeDTO dto1 = new ResumeDTO("Thanu M", "Arun", "March 10th", 8976543210l, "thanuarun@gamil.com", "BCA", address1);

		ResumeDTO dto2 = new ResumeDTO("Satish G", "Bagavant", "jan 5th", 8976234560l, "satish1998@gamil.com", "B.E", address2);
		
		ResumeDTO dto3 = new ResumeDTO("Shree H", "Manish", "March 27th", 7634654321l, "shree200@gamil.com", "BSC", address3);
		
		ResumeDTO dto4 = new ResumeDTO("Shyama K", "Pankaj", "Feb 8th", 8934654376l, "shyamak@gamil.com", "BA", address4);
		
		ResumeDAO dao = new ResumeDAO();

		dao.saveResume(dto);
		dao.saveResume(dto1);
		dao.saveResume(dto2);
		dao.saveResume(dto3);
		dao.saveResume(dto4);

		System.out.println("------------------------------------------------------------------------");
		
		boolean res = dao.findByName("Thanu M");
		System.out.println(res);
		
		System.out.println("------------------------------------------------------------------------------");
		
		boolean obj = dao.findByEmail("satish1998@gmail.com");
		System.out.println(obj);
		
		System.out.println("---------------------------------------------------------------------------");

		dao.updateDegreeByName("Shree H", "MBBS");
		
		dao.updatePhoneNumberByEmail("sheelaxworkz@gamil.com", 7908654321l);
		
		System.out.println("-----------------------------------------------------");
		
		dao.deleteByName("Shyama K");
		
		System.out.println("------------------------------------------------------");
		
		ResumeDTO[] result = dao.readResume();

		for (int i = 0; i <= result.length - 1; i++) {
			if (result[i] != null) {
				System.out.println(result[i]);
			}
		}

	}

}
