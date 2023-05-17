package com.xworkz.book.dao;

import com.xworkz.book.dto.BookDto;

public class BookDaoTwo extends AbstractDao {
	
	BookDto[] books = new BookDto[10];

	@Override
	public boolean save(BookDto dto) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = dto;
				System.out.println("Book name is saved for BookDtoTwo");
				return true;
			}
		}
		return false;
	}

	@Override
	public BookDto[] ReadAll() {
		System.out.println("reading BookDto");
		return books;
	}

	@Override
	public BookDto find(String searchValue) {
		for(int i=0; i<books.length; i++) {
			if(books[i]!=null) {
				if(books[i].getType().equals(searchValue)) {
					System.out.println("searching type is found");
					return books[i];
				}
			}
		}
		return null;
	}

	@Override
	public BookDto update(String updateValue, int price) {
		for(int i=0; i<books.length; i++) {
			if(books[i]!=null) {
				if(books[i].getPrice() == price) {
					books[i].setBookName(updateValue);
					System.out.println("name is updated successfully");
					return books[i];
				}
			}
		}
		return null;
	}

	@Override
	public boolean delete(int dltValue) {
		for(int i=0; i<books.length; i++) {
			if(books[i]!=null) {
				if(books[i].getPrice() == dltValue) {
					books[i] = null;
					System.out.println("Deleted Successfully");
					return false;
				}
				
			}
		}
		return false;
	}

}
