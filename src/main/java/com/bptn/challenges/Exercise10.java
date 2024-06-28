package com.bptn.challenges;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer number less than ten billion: ");
		int number = input.nextInt();
		
		for (int i=1; i< number.length + 1; i++) {
			System.out.print(i);
		}
		

	}

}
