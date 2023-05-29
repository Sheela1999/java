package com.xworkz.films;

import com.xworkz.films.custom.DeleteValueNotFoundException;
import com.xworkz.films.custom.DtoNullException;
import com.xworkz.films.custom.NullPointerException;
import com.xworkz.films.custom.NoSpaceArrayException;
import com.xworkz.films.custom.UpdateValueIsNull;
import com.xworkz.films.dao.FilmImpl;
import com.xworkz.films.dto.FilmDto;

public class FilmRunner {

	public static void main(String[] args) {
		
		FilmDto dto = new FilmDto("DaDa", 400000000l, "Kavin", "Aparna", 300);
		FilmDto dto1 = new FilmDto("SeethaRamam", 600000000l, "Dulquer Salmaan", "Mrunal", 400);
		FilmDto dto2 = new FilmDto("Kantara", 950000000l, "Rishabh Shetty", "Leela", 450);
		
		FilmImpl dao = new FilmImpl();
		
		try {
			dao.save(dto);
			dao.save(dto1);
			dao.save(dto2);
			
			System.out.println("--------------------FIND--------------------------");
			FilmDto found = dao.find(300);
		    System.out.println(found);
		    
		    FilmDto found1 = dao.findByTwoFields("Mrunal", 600000000l);
		    System.out.println(found1);
			
			System.out.println("-----------------UPDATE------------------------------------");
			dao.update(400000000l, "Aparna Das");
			dao.updateByTwoFields("Rishabh Shetty", 300, "Kantara 2");
			
			System.out.println("-----------------DELETE------------------------------------");
			dao.delete("Dulquer Salmaan");
			
		} catch (NoSpaceArrayException | DtoNullException e) {
			
			e.printStackTrace();
		}
		
		catch(NullPointerException ex) {
			ex.printStackTrace();
		}
		
		catch(UpdateValueIsNull e) {
			e.printStackTrace();
		}
		
		catch(DeleteValueNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Continue excecution...........");
		
	    System.out.println("-----------------------------READ---------------------------------");
		FilmDto[] res = dao.readAll();
		for(int i=0; i<res.length; i++) {
			if(res[i] != null) {
			    System.out.println(res[i]);
			}
		}

	}

}
