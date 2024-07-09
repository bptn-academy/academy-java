package com.bptn.course._practice_challenges;
import java.util.Scanner;

public class Exercise5_FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to print Floyd's Triangle. 
		//Test Data
		//Input number of rows : 5
		//Expected Output :
		//Input number of rows :  5
		//1 
		//2 3 
		//4 5 6 
		//7 8 9 10 
		//11 12 13 14 15 
		Scanner input = new Scanner(System.in);
		System.out.print("Input number of rows: ");
		int numRow = input.nextInt();
		int number = 1;
		
		for (int row=1; row<=numRow; row++) {
			for (int column=1; column<=row; column++ ) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();	
						//print each index based on the numbers of print lines
			
			
		}

	}

}
