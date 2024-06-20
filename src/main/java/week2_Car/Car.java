package week2_Car;

public class Car {
	
	private String color;
	private String brand;
	private int price;
	
	public Car(String color, String brand,int price) {
		this.color = color;
		this.brand = brand;
		this.price= price;		
	
		}
	
    void printCarDetails() {
       this.print();
       }
    
    private void print() {
    	System.out.println("Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}');
    }


}
