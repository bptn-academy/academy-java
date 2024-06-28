package com.bptn.challenges;
import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to display the number rhombus structure. 
		Scanner input = new Scanner(System.in);
		System.out.print("Input number of rows: ");
		int numRow = input.nextInt();
		int number = 1;
		
		for (int row = 1; row<=numRow; row++) {
			for (int col =1; col<=row; col++) {
				System.out.println(number);
				number++;
				
			}
			System.out.println();
		} 
		

	}

}
