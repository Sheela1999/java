package com.xworkz.book.dao;

import com.xworkz.book.dto.BookDto;

public abstract class AbstractDao {
	
	public abstract boolean save(BookDto dto);
	public abstract BookDto[] ReadAll();
	public abstract BookDto find(String searchValue);
	public abstract BookDto update(String updateValue, int price);
    public abstract boolean delete(int dltValue);
}
