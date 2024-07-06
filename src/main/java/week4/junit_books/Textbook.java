package week4.junit_books;

public class Textbook extends Book{
	
	private int edition;
	

	public Textbook(String title, double price, int edition) {
		super(title, price);
		this.edition = edition;
	}


	@Override
	String getBookInfo() {
		// TODO Auto-generated method stub
		return super.getBookInfo() + "-" + edition;
	}


	public int getEdition() {
		return edition;
	}

	
	void canSubstituteFor () {
		
	}


	boolean canSubstituteFor(Textbook other) {
		
		return  this.getTitle().equals(other.getTitle()) && this.edition >= other.getEdition();
	}
	

}
