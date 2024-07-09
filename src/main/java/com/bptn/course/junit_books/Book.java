package com.bptn.course.junit_books;

public class Book {
	String title;
	double price;
	
	public Book(String title, double price){
		this.title = title;
		this.price = price;
		
	}

	public String getTitle() {
		return title;
	}

	//public void setTitle(String title) {
	//	this.title = title;
	//}
	
	public String getBookInfo() {
		return title + "-" + price;
	}

}
