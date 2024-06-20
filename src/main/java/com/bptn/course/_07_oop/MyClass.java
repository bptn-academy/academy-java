package com.bptn.course._07_oop;

public class MyClass {

	public static void main(String[] args) {
		
		//DRY - don't repeat yourself. Reuse your code.
		// TODO Auto-generated method stub
		String str = new String("Hello");
		/*
		 * emp1 is an object of class "Employee".
		 * The "new" keyword is used to allocate memory for the object
		 */
		Employee emp2 = new Employee();
		 /* Even though we can assign values, we really shouldn't.
		  * this is because these are attributes belonging into classes
		  * Encapsulation - We should never access properties of a class from another class. 
		  * The proper way to access them is using employee
		  * 
		  */
		double empBonus = 0.0;
		System.out.println(empBonus);
		
		System.out.println("");
		
		//Breaking Encapsulation (OOP)
		//TRICK - to rename a var, you can right click -> refactor -> rename 
		emp2.setId(1010); 
		emp2.setName("John");
		emp2.setSalary(100_000);// when you have numbers, you can use underscore to make it readable
		emp2.setPosition("Director");
		
		emp2.display(); // this is executable because it has a main block.
		//in  real life, we have one class per file BUT technically we can have more than one class per file but not really recommended.
         empBonus = emp2.calculateBonus(8);//we can use the same name as in the employee class because they are diferrent scopes
       System.out.println(empBonus);
		/*
		 * Instead of doing the steps above. We use a Parameterized Constructor
		 * Parameterized constructor
		 */
       System.out.println();
		Employee emp3 = new Employee(1030, "Mike", 90_000, "General Accountant");
		emp3.display();
		double percent = 6;
		empBonus = emp3.calculateBonus(percent);
		System.out.println(emp3);

		System.out.println("");
		
		Employee emp4 = new Employee(1040, "Lily");
		emp4.display();
		
		empBonus = emp4.calculateBonus(6);
		System.out.println(empBonus);
		
		
		// if you want to omit the data type in java, you can use "var"
		/*
		 * it is like java is inferring the data type.
		 * You cannot create attributes with var though
		 * Java allows us to create local variables using the var keyword
		 * Instance variables cannot be created with the var keyword
		 * Java will infer the type from the initial value automatically
		 */
		//var c = "BPTN";
		//static methods you can call directly.
		
		
	}

}
