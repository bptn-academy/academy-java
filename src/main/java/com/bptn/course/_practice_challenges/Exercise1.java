package com.bptn.course._practice_challenges;
import java.util.Scanner;


public class Exercise1 {

	public static void main(String[] args) {
		
		//1. Write a Java program to get a number from the user and print whether it is positive or negative.
//Test Data
//Input number: 35
//Expected Output :
//Number is positive
		// TODO Auto-generated method stub
		//input number
	
		Scanner input = new Scanner(System.in);
		System.out.println("Input number: ");
		int guess = input.nextInt();
		if (guess > 0) {
			System.out.println("Number is positive");
		}
		else if (guess < 0) {
			System.out.println("Number is negative");
		} else {
			System.out.println("Number is zero");
		}
		
	}

}
