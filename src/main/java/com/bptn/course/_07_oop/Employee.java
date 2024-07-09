package com.bptn.course._07_oop;


/*
 * A Class is like a construction map, blueprint or template for creating objects ( allocate memory).
 * 
 * A Class has three types of members
 * 
 * 1. Attributes
 * 2. Constructors
 * 3. Methods
 */

public class Employee {

	/*
	 * Attributes / Properties / Instance Variables / Fields
	 */
	private int id;
	private String name;
	private double salary;
	private String position;


	/*
	 * A Constructor is a special method that is called automatically when we 
	 * create an object of a class. We use constructors to initialize objects.
	 * 
	 * 
	 * Type of Constructors:
	 * 
	 * 1. default constructor - created by default when there are no constructors
	 * in the class.
	 * 	            Employee(){
	 *	
	 *              }
	 * 2. no-arg constructor - the declaration looks like the default constructor
	 *                         but in this case you create it.  
	 *                         
	 * Note - The name of the constructor is always the name of the class, never
	 *        returns a type.
	 */
	
    Employee(){
    	
		id = 0;
		name = "";
		salary = 0.0;
		position = "";
	}

	    
    Employee(int id, String name) {
    	this.id = id;
    	this.name = name;
    	this.position = "";
    }
    
    
    Employee(int id, String name, double salary, String position) {
    	this.id = id;
    	this.name = name;
    	this.salary = salary;
    	this.position = position;
    }
    
	/*
	 * To follow the encapsulation OOP concept, we must use getters
	 * (accessor) and setters (mutators) to manipulate the attributes
	 */
	
	int getId() {
		return id;
	}

	/*
	 * the "this" keyword is used to remove the ambiguity when we have a method
	 * parameter with the same name as a class attribute. The "this" keyword is
	 * used in front of the attribute.
	 */
	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	String getPosition() {
		return position;
	}

	void setPosition(String position) {
		this.position = position;
	}

	/*
	 * A method is a block of code that runs when it is called. 
	 * A method is always associated with class. 
	 */
	
	void display(){ // method declaration / method's body is between the curly braces
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(position);		
	}
	
	/*
	 * This method takes one parameter and return a value (type double)
	 * 
	 * When a method declares that it returns a value, we must use the return
	 * keyword at the end of the method's body.
	 */
	double calculateBonus(double percentage){  // method declaration
		
		double empBonus = this.salary * (percentage/100);
		return empBonus;
	}
	
	
	
}
