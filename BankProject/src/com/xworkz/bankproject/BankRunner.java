package com.xworkz.bankproject;

import com.xworkz.bankproject.customexception.DtoNullException;
import com.xworkz.bankproject.customexception.InvalidYearException;
import com.xworkz.bankproject.customexception.NameNotFoundException;
import com.xworkz.bankproject.customexception.NoSpaceArrayException;
import com.xworkz.bankproject.customexception.NotUpadetedEcxeption;
import com.xworkz.bankproject.dao.BankDao;
import com.xworkz.bankproject.dto.BankDto;

public class BankRunner {

	public static void main(String[] args) throws NoSpaceArrayException {
		
		BankDto dto = new BankDto("Canara Bank", 1906, "Harugeri", "Public");
		BankDto dto1 = new BankDto("AXIS Bank", 1993, "BTM", "Private");
		BankDto dto2 = new BankDto("SBI Bank", 1955, "Jayanagara", "CPSU");

		BankDao dao = new BankDao();
		
		try {
			dao.save(dto);
			dao.save(dto1);
			dao.save(dto2);
			
			dao.find("Canara Bank");
			
			dao.update("Public", "Rajajinagar");
			
			dao.delete(2005);
			
		} catch (DtoNullException e) {
			
			e.printStackTrace();
		} catch (NoSpaceArrayException e) {
			
			e.printStackTrace();
		} catch (NameNotFoundException e) {
			
			e.printStackTrace();
		} catch (NotUpadetedEcxeption e) {

			e.printStackTrace();
		} catch (InvalidYearException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("------------READ-------------------------------------------");
		
		BankDto[] result = dao.readAll();
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
		System.out.println("Continue Execution...");
		
	}

}
