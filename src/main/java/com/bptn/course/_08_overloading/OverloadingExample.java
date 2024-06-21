package com.bptn.course._08_overloading;
/*
 * Overloading is a type of polymorphism.
 * Overloading is a situation where n the same class, two or more methods or constructors or both have
 *  the same name but different parameters types.
 *  some of the string constructors have different parameters , is it still considered overloading in this case
 */

class MyClass{
	int num;
	String str;
	
	/*
	 * Constructor overloading
	 * 
	 */
	
	MyClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	MyClass(int num) {
		this.num = num;
	}
	

	MyClass(String str) {
		this.str = str;
	}
	
	


	MyClass(int num, String str) {
		this.num = num;
		this.str = str;
	}


	/*
	 * Method overloading
	 */
	
	String concatenate(String str) {
		return "Hello, " + str;
	}
	


	String concatenate(String str, int num) {
		return "Hello, " + str + " " + num;
	}
	
	String concatenate(String hello, int jello) {
		return "Hello, " + hello + " " + jello;
	}
	
	//the below is not the same. Javea doesn't count the name of the method to determine overloading
	//it only considers the types of the parameters.
	String concatenate(int num, String str) {
		return "Hello, " + str + " " + num;
	}
	
}

public class OverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
