package com.bptn.course._08_polymorphism;


//Parent class
class Animal{
	
	void makesound(){
		System.out.println("Animal makes a sound");
		
	
	}
	
}
	
	//Sub class
	class Dog extends Animal{
		
		//has its own methods
		// @Override
		void makeSound() {
			System.out.println("Dod barks");
		}
	
}
public class Polymorphism {

	public static void main(String[] args) {
		
		//create an object from Dog class
		Animal a1=new Animal();
		a1.makesound();
		
		//create an object from Dog class
		Dog d1 =new Dog();
		d1.makeSound();
		
		

	}
	
} 




//Major key takeaways
//method overriding
//1. Scenario- when the subclass decides to override method in the parent class
//2.Name of the method, return type of the method and number of parameters in the overriden method should be the same
//3. By convention, the overriden method has @override annotation above it method signature
//4. static method in parent class can not be overidden 
//5. Runtime is also called Polymorphisim