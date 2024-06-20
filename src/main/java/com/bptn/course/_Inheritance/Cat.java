package com.bptn.course._Inheritance;

public class Cat extends Animal {
	
	@Override
	public void makeSound() {
		System.out.println("Bark");
	}
	




public static void main(String[] args) {
	Animal cat = new Cat();
	cat.makeSound();


	
}
}
