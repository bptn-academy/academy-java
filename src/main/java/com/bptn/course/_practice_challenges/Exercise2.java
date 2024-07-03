package com.bptn.course._practice_challenges;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". 
		//Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
		Scanner input = new Scanner(System.in);
		System.out.print("Floating number: ");
		double floatNum = input.nextDouble();
		
		if (floatNum == 0) {
			System.out.println("zero");
		} 
		else if (floatNum >= 1 ){
			if (floatNum < 1000000) {
				System.out.println("Positive number");
			} else {
				System.out.println("Positive number & Large");
			}
		}
		else if (floatNum < 1) {
			System.out.println("Negative number & Small");
		}
		

	}

}
