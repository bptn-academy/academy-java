package coding_Method_Overriding;

public class Vehicle {
	String color;
	String brand;
	
	public Vehicle(String color, String brand) {
		this.color = color;
		this.brand = brand;
		
	}
	
	public void print() {  
		   System.out.println(this.color + " " + this.brand); 
		}

}
