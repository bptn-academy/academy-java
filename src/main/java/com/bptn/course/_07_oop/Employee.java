package com.bptn.course._07_oop;

/*
 * A class is like a construction map, blueprint or template for creating objects (that means he allocates memory for that object).
 * A class has 3 types of members 
 * 1. attributes
 * 2. Constructors
 * 3. Methods
 */

public class Employee {//public or private are access modifiers. Public means the class is visible from everywhere.
	//internally systems have an integer as an i
	/*Attributes/ Properties/ Instance Variables/ Fields
	 * If you make the variables private,it will not be used anywhere else other than within the class
	 */
	 int id;
	 String name;
	 double salary;
	 String position;
	 /*
	  * A constructor is a special method that is called automatically when we create 
	  * an object of a class. We use constructors to initialize objects. 
	  * When a class doesn't have a constructor, Java automatically creates a constructor called a default constructor (you do not see it)
	  * 1. Default constructor - created by default when there are no constructors in the class
	  * 2. No-argument (no-arg) constructor - the declaration looks like the default constructor
	  * When we have a no-arg constructor, we use that to initialize the attributes/ instance variables.
	  * Note - the name of the constructor is always the class name. The constructor never returns a type, not even void.
	  * 
	  */
	 
	 //Employee(){ // this is a default constructor 
	//	  }
	 Employee(){ // this is a non-arg constructor . A default constructor looks like this without any body
		 id = 0;
		 name = "";
		 salary = 0.0;
		 position = "";
		 
	 }
	 
	
	/*
	 *To follow the encapsulation concept, we must use getters/acessors and setters/mutators to manipulate the attribute
	 * getters and setters are used to modify attributes of a class
	 * Right click -> source -> generate getters and setters 
	 * 
	 */
	
	
	/* 
	 *  A method is a blocks of code that runs when it is called. A method always belongs to a class.
	 *  If a method returns no value then use void.
	 *  Because no access modifier was added, that means that it uses the default
	 *  That means that classes within the same package can use it.
	 *  because "id" is both a parameter name for setId and the name of an instance variable. 
	 *  you use the this keyword to make sure they know it is the instance variable 
	 *  He likes to do attributes, getters and setters then methods.
	 */ 
	
	 Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
		 
	 
	Employee(int id, String name, double salary, String position) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.position = position;
	}


	int getId() {
		return id;
	}
	 /*
	  * the "this" keyword is used to remove the ambiguity when we have a method
	  * parameter with the same name as a class attribute. The "this" keyword id
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

	void display() { //this method dosn't take parameters. // method declaration
		 /*
		
		  */
		 System.out.println(id);// what is between curly braces is the method's body
		 System.out.println(name);
		 System.out.println(salary);
		 System.out.println(position);
	 }
	 /*
	  * This method takes one parameter and the return value (type is double)
	  * When a method declares that it returns a value, we must use the return keyword
	  * at the end of the method body.
	  */
		 
		 /*
		  * there are some classes that are included in your java program is - String 
		  * This is because string is included in the java.lang package .
		  *  any class in that package does not need to be imported.
		  *  Since methods tell us what to do, we use verbs for methods
		  */
	 double calculateBonus(double percentage){//this is called method declaration 
		 //final means that noone can modify the value- reconfirm this 
		//percentage = 50;
		double empBonus = salary * (percentage/100);
		return empBonus; // you can also do-  return salary * (percentage/100);
	}
		
	}
	


