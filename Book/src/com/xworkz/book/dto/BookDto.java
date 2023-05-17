package com.xworkz.book.dto;

public class BookDto {
	
	private String bookName;
	private int price;
	private String color;
	private String type;
	private long noOfPages;
	
	public BookDto() {
		System.out.println("Default constructor");
	}
	
	public BookDto(String bookName, int price, String color, String type, long noOfPages) {
		super();
		this.bookName = bookName;
		this.price = price;
		this.color = color;
		this.type = type;
		this.noOfPages = noOfPages;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(long noOfPages) {
		this.noOfPages = noOfPages;
	}

	@Override
	public String toString() {
		return "BookDto [bookName=" + bookName + ", price=" + price + ", color=" + color + ", type=" + type
				+ ", noOfPages=" + noOfPages + "]";
	}

}
