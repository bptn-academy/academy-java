package com.bptn.course._practice_challenges;

import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program that accepts two floating­point numbers and checks whether they are the same up to two decimal places. 
		Scanner input = new Scanner(System.in);
		System.out.print("Input first floating number: ");
		double num1 = input.nextDouble();
		System.out.print("Input second floating number: ");
		double num2 = input.nextDouble();
		
		if (Math.abs(num1-num2) <= 0.01) {
			System.out.print("Numbers are basically same");
		} else {
			System.out.print("Numbers are different");
		}

	}

}
