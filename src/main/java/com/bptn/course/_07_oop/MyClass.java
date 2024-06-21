package com.bptn.course._07_oop;

public class MyClass {

	public static void main(String[] args) {

		String str = new String("Hello");

		/*
		 * 1. Direct - not recommended
		 */
		
		/*
		 * emp1 is an object of class employee.
		 * new keyword is used to allocate memory for the
		 * object.
		 */
		Employee emp1 = new Employee();
		
		// Breaking Encapsulation (OOP Concepts)
		//emp1.id = 1010;
		//emp1.name = "John";
		//emp1.salary = 80_000;
		//emp1.position = "Manager";
		
		emp1.display();
		double empBonus = emp1.calculateBonus(10);
		System.out.println(empBonus);
		System.out.println("");
		
		/*
		 * 2. Getters and Setters.
		 */
		
		Employee emp2 = new Employee();
		
		// Breaking Encapsulation (OOP Concepts)
		emp2.setId(1020);
		emp2.setName("Jane");
		emp2.setSalary(100_000);
		emp2.setPosition("Director");
		
		emp2.display();
		empBonus = emp2.calculateBonus(8);
		System.out.println(empBonus);
		System.out.println("");
		
		/*
		 * 3. Parameterized Constructor 
		 */
		Employee emp3 = new Employee(1030,"Mike", 90_000, "General Accountant");
		emp3.display();
		empBonus = emp3.calculateBonus(12);
		System.out.println(empBonus);
		System.out.println("");

		Employee emp4 = new Employee(1040,"Lily");
		emp4.display();
		empBonus = emp4.calculateBonus(5);
		System.out.println(empBonus);
		
		
		
		String a = "Hello";
		
		int b = 4;
	
		/*
		 * Java allows us to create local variables using the var keyword. 
		 * Instance variables cannot be created with the var keyword.
		 * 
		 * Java will infer the type from the initial value automatically.
		 */
				
		var c = "BPTN";
		
	
		
		
		
		
		
	}

}
