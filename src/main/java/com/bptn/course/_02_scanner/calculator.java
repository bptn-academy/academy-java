package com.bptn.course._02_scanner;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
			
				
				//Step 1: create an object from the scanner class
						Scanner scanner = new Scanner(System.in);
								boolean continueCalculation;
								
				//Step 2: assign values to the variable and convert int to double
								int firstNumber = 45;
								double myDouble = firstNumber;
								
								int secondNumber = 67;
								double myDouble1 = secondNumber;
								
						System.out.println(myDouble);
						System.out.println(myDouble1);
								
								
				//Step 3: display calculator menu
									 	
						System.out.println("Calculator menu");
						System.out.println("Press 1 for addition");
						System.out.println("Press 2 for subtraction");
						System.out.println("Press 3 for multiplication");
						System.out.println("Press 4 for division");
						System.out.println("Press 5 to square a number");
						System.out.println("Press 6 to find a square root");
						System.out.println("Press 7 to find the reciprocal");
								
				
				//Step 4:
						System.out.println(3);
				        System.out.println("Enter myDouble:" + myDouble);
				        System.out.println("Enter the myDouble1:" + myDouble1);
				        System.out.println("The product of the numbers 45.0 and 67.0 is = " + myDouble * myDouble1);
				       
				//Step 5: Multiplication
				
				double multiplication = myDouble * myDouble1;
				System.out.println("Multiplication = "+ multiplication);

	}

}
