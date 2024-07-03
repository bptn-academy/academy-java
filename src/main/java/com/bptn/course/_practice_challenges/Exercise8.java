package com.bptn.course._practice_challenges;
import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order,
      //"decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise. 
		//accept 3 inputs from user
		//check if num1>num2>num3 and if so, print increasing
		//check if num1<num2<num3 and if so decreasing
		//else, print Neither increasing or decreasing order"
		Scanner input = new Scanner(System.in);
		System.out.print("Input first number: ");
		double num1 = input.nextDouble();
		System.out.print("Input second number: ");
		double num2 = input.nextDouble();
		System.out.print("Input third number: ");
		double num3 = input.nextDouble();
		
		if (num1 > num2 && num2 > num3) {
			System.out.print("decreasing");
		} 
		else if (num1 < num2 && num2 < num3) {
			System.out.print("increasing");
		} 
		else {
			System.out.print("Neither increasing or decreasing order");
		}
		input.close();
		
		}

	}


