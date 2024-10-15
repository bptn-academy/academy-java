package com.bptn.course._Abtract;

//Abstraction using interface (After Java 8)
//From Java 8- Interface can support abstract methods, default methods and static method

interface Operation{
	
	void draw(); //abstract method - it has no implementation
	
	//default method- has some implementation
	default int add(int a, int b) {
		return a+b
				
	}
	//static method
	static double getRandomNumber() {
		return Math.random();
		
	}
}
//sub class-create a sub class that implements the Operation interface
class Calculator implements Operations{
	
	//compiler always enforces the sub class to implement or override the methods in the abstract from the interface
	@Override
	public void draw() {
		
		System.out.println("Draw method implemented by Calculator class");
		
	}
}
public class Abstraction3 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.draw();
		
		int result = c1.add(2.3);
		
		System.out.println("The result is : "+ result);
		System.out.println("The random random is: "+Operation.getRandomNumber());
		

	}

}

//Magor key takeaways
//1. Interface cannot be instantiated
//2. Abstraction methods in the interface is implemented using a subclass
//3. Interfaces support multiple interface- astub class can implement multiple interface

//Interface cannot have instnce variables
//interface cannot have constructors
//It can consist of constants
