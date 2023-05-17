package com.xworkz.book.dao;

import com.xworkz.book.dto.BookDto;

public class BookDao extends AbstractDao {
	
	BookDto[] books = new BookDto[10];

	@Override
	public boolean save(BookDto dto) {
		if(dto!=null) {
			System.out.println("Dto is not null");
			
			if(dto.getBookName().length()>=3) {
				System.out.println("book name length is valid");
				
				if(dto.getBookName()!=null && dto.getColor()!=null && dto.getType()!=null) {
					System.out.println("Book name is valid");
					
					for(int i=0; i<books.length; i++) {
						if(books[i] == null) {
							books[i] = dto;
							System.out.println("Book name is saved successfully");
							return true;
						}
						System.out.println("index is not have space");
					}
					System.out.println("Array is not have enough space");
					return false;
				}
				System.out.println("book name is not valid");
			}
			System.out.println("name length is not valid");
		}
		System.out.println("dto is null");
		return false;
	}

	@Override
	public BookDto[] ReadAll() {
		for(int i=0; i<books.length; i++) {
			System.out.println(books[i]);
		}
		return books;
	}

	@Override
	public BookDto find(String searchValue) {
		if(searchValue!=null) {
			for(int i=0; i<books.length; i++) {
				if(books[i]!=null) {
					if(books[i].getBookName().equals(searchValue)) {
						System.out.println("searching name is found");
						return books[i];
					}
					System.out.println("searching name not found");
				}
				System.out.println("Array is null");
			}
			System.out.println("index is not have space");
			return null;
		}
		System.out.println("searching value is null");
		return null;
	}

	@Override
	public BookDto update(String updateValue, int price) {
		if(updateValue!=null) {
			if(updateValue.length()>=3) {
				for(int i=0; i<books.length; i++) {
					if(books[i]!=null) {
						if(books[i].getPrice() == price) {
							books[i].setColor(updateValue);
							System.out.println("color is updated successfully");
							return books[i];
						}
						System.out.println("color is" + books + "not updated");
					}
					System.out.println("updating value is null");
				}
				System.out.println("index is not having enough space");
				return null;
			}
			System.out.println("Color length is valid");
			return null;
		}
		System.out.println("Updating value is null");
		return null;
	}

	@Override
	public boolean delete(int dltValue) {
		if(dltValue!=0) {
			for(int i=0; i<books.length; i++) {
				if(books[i]!=null) {
					if(books[i].getPrice() == dltValue) {
						books[i] = null;
						System.out.println("Deleted Successfully");
						return true;
					}
					System.out.println("price is not deleted");
				}
			}
		}
		System.out.println("delete value is zero");
		return false;
	}

}
