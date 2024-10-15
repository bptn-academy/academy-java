package com.bptn.course._Abtract;

public class Abstraction1 {

	//Abstraction using abstract class

	//Abstract class- its a class that cannot be instantiated- it cannot be used to create objects

	abstract class Shape{
		
		//Abstract method --> a method which has no implementation
		abstract void draw();
		
		abstract void print();
		
		//normal method- which has an implementation
		void moveTo(int x, int y) {
			System.out.println("Move to: "+ x + y);
		}
	}


	//Sub class(child class) extends Shape class
	class Circle extends Shape{

		@Override
		void draw() {
			
			System.out.println("Draw a circle");
			
		}

		@Override
		void print() {
			System.out.println("Print a circle");
			
		}

		
	}

	//Sub class(child class) extends Shape class
	class Rectangle extends Shape{

		@Override
		void draw() {
			System.out.println("Draw a rectangle");
			
		}

		@Override
		void print() {
			System.out.println("Print a rectangle");
			
		}

		
	}

	public class Abstraction {

		public static void main(String[] args) {
			
			//Create objects from Circle class
			Circle c1= new Circle();
			c1.draw(); 
			c1.print();
			
			c1.moveTo(2, 3);// this is an inherited method from Shape class
			
			Rectangle r1= new Rectangle();
			r1.draw();
			r1.print();
			
			r1.moveTo(5, 6);// this is an inherited method from Shape class

		}

	}
	
}

	//Major key-takeaways
	//1. Abstract class- its a class that cannot be instantiated- it cannot be used to create objects
	//2. It consists of abstract methods and normal methods
	//3. The sub class is going to implement the abstract methods from the abstract class
	//4. when a sub class implements the abstract methods from the abstract class it should follow the rules of overriding
