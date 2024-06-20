package coding_Method_Overriding;

public class Car extends Vehicle{

	String steeringWheel;
	
	public Car(String color, String brand, String steeringWheel) {
		super(color,brand);
		this.steeringWheel = steeringWheel;
	}
	
	public void print() { 
		   super.print(); 
		}
}
