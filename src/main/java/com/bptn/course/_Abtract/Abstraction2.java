package com.bptn.course._Abtract;

//Abstraction using interface- Before class

interface ShapeInterface{
	
	//Before Java 8- interface had only abstract methods and constants
	
	void draw();
	
	double getArea();
	
}

//to implement the abstract methods from the interface we need to create a sub-class
class RectangleClass implements ShapeInterface {
	
	private double width;
	private double height;
}

@Override
public void draw() {
	
	
	
	
}

public class Abstraction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
