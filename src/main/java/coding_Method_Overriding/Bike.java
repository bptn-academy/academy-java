package coding_Method_Overriding;

public class Bike extends Vehicle{
	String bikeHandle;
	
	public Bike(String color, String brand, String bikeHandle) {
		super(color, brand);
		
		this.bikeHandle = bikeHandle;
	}
	public void print() { 
		  super.print(); 
		}
}
