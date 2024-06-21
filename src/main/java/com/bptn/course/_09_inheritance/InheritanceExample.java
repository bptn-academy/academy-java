package com.bptn.course._09_inheritance;

/*
 * inheritance is when a class acquires the elements(attributes & methods) of another class to reuse code.
 * The class that the other class inherits from is called: Parent class/Super class/ Base class.
 * The class that inherits is called child/sub class/ derived class
 * The parent class can be inherited multiple times.
 * 
 * The child can only have one parent class. The child does not inherit private elements of the parent.
 * 
 * Multi-level inheritance is allowed (Parent/child/granchild)
 * 
 */

class Person{
	private String name;
	private int age;
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	
	
}

class Contractor extends Person{
	double rate;

	double getRate() {
		return rate;
	}

	void setRate(double rate) {
		this.rate = rate;
	}
	
	
}




class Employee extends Person{
	int id;
	double salary;
	String position;
	
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
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
	void display() {
		System.out.println("Employee: " + id + ", Name"+ getName());
	}
	
	
	
}
public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setId(1010);
		emp.setName("John");
		emp.setSalary(100_100);
		emp.setPosition("Manager");
		emp.display();
		
		}

}
