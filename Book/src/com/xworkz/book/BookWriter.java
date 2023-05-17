package com.xworkz.book;

import com.xworkz.book.dao.BookDao;
import com.xworkz.book.dao.BookDaoTwo;
import com.xworkz.book.dto.BookDto;

public class BookWriter {

	public static void main(String[] args) {
		
		BookDto dto = new BookDto("Classmate", 60, "White", "Ruled", 120l);
		
		BookDto dto1 = new BookDto("Rajguru", 21, "Pink", "Unruled", 72l);
		
		BookDao dao = new BookDao();
		BookDaoTwo dao2 = new BookDaoTwo();
		
		boolean savedRes = dao.save(dto);
		System.out.println(savedRes);
		
		System.out.println("-----------------------------------------------------------");
		
		boolean savedRes1 = dao.save(dto1);
		System.out.println(savedRes1);
		
		System.out.println("------------------found BookDto------------------------------------");
		
		BookDto foundBook = dao.find("Classmate");
		System.out.println(foundBook);
		
		System.out.println("------------------------------------------");
		BookDto foundBook1 = dao2.find("Unruled");
		System.out.println(foundBook1);
		
		System.out.println("----------------------update------------------------------");
		BookDto updatedColor = dao.update("Yellow", 60);
		System.out.println(updatedColor);
		
		System.out.println("----------------------------------------------------------");
		BookDto updatedBookName = dao2.update("vidya", 21);
		System.out.println(updatedBookName);
		
		System.out.println("----------------------delete-------------------------------");
		boolean deletedPrice = dao.delete(60);
		System.out.println(deletedPrice);
		
		System.out.println("----------------------------------------------------------");
		BookDto[] readDto = dao.ReadAll();
			for(int i=0; i<readDto.length; i++) {
				if(readDto[i]!=null) {
			System.out.println(readDto[i]);
		}
      }
		
	}

}
