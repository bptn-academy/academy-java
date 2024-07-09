package week4.junit_books;

public class Book {
	private String title;
	private double price;
	
	
	public Book(String title, double price) {
		
		this.title = title;
		this.price = price;
	}


	public String getTitle() {
		return title;
	}
	
	
	
	 String getBookInfo() {
		 
		return title + "-" + price ;
		}
	
	

}
