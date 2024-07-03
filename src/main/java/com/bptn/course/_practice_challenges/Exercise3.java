package com.bptn.course._practice_challenges;
import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program that takes three numbers from the user and prints the greatest number. 
		//ask user for input
		// loops through each number for the greatest
		//if number greater than all 3 
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 3 numbers:");
		System.out.print("Number 1: ");
		int num1= input.nextInt();
		System.out.print("Number 2: ");
		int num2= input.nextInt();
		System.out.print("Number 3: ");
		int num3= input.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("Greatest number is: " + num1);
		}
		else if (num2 >= num1 && num2 >= num3) {
			System.out.println("Greatest number is: " + num2);
		}
		else if (num3 >= num2 && num3 >= num1) {
			System.out.println("Greatest number is: " + num3);  
		} else {
			System.out.println("cannot find the greatest number ");  
		}
		
	
		
		
		
		

	}

}
