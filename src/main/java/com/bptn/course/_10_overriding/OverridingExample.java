package com.bptn.course._10_overriding;

import com.bptn.course._09_inheritance.priate;
/*
 * Overrising only exsts with methods 
 * the tostring method returnss a hexidecimal at the end.rturns an idea of the obj in memory. 
 * if an object is passed through the system.out.print ln, the tostring() method is invoked automatically 
 */

public class OverridingExample {
	
	class Person{
		priate String name;
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
	
	//@Override - Here we are telling other developers about our intention. Our intention is to override the parent class.
	//the @Override annotation is not mandatory to use but it makes the code more reasable and it also checks if the methos exist.
	/*
	 * this is an informative annotation that checks if the annotated
	 * method name and parameters exists in the parent class.
	 * . In Java, anything that starts with @ is an annotation. An annotation is metadata.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
