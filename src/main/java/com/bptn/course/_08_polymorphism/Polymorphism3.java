package com.bptn.course._08_polymorphism;

public class Polymorphism3 {
	
	void print(int interger) {
		System.out.println("Printing an interger : "+ interger);
	}
	
	void print(String s) {
		System.out.println("printing a string :"+ s);
		
	}
	int print(int a, int b) {
		
		return a+b;
					
	}
    double print(double a, double b) {
		
		return a+b;
    }

	public static void main(String[] args) {
		Polymorphism3 p1 = new Polymorphism3();
		p1.print(5);
			
		p1.print("Hello World");
		
		System.out.println(" The sum of two integers: "+ p1);
		System.out.println("The sum of two doubles: "+ p1.print(2.0, 3.0));
		
		

	}

}


//Major key takeaways

//Method overloading-  compile time polymorphism
//1. It occurs within the same class and no in+ heritance is required