package _01_week_coding_friday;

import java.util.Scanner;

public class Calculator {
///fefwefx
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        int continueCalculation;

        do {     
            // Display Calculator Menu
            System.out.print("/................Calculator Menu................\n");
            System.out.print("Press 1 for addition\n");
            System.out.print("Press 2 for subtraction\n");
            System.out.print("Press 3 for multiplication\n");
            System.out.print("Press 4 for division\n");
            System.out.print("Press 5 to square a number\n");
            System.out.print("Press 6 to find a square root\n");
            System.out.print("Press 7 to find the reciprocal\n");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {                                                                                 // if user's choice is 1 do addition
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                System.out.println("The sum of the numbers " + num1 + " and " + num2 + " is = " + (num1 + num2)); ///Print result of calculation
            } else if (choice == 2) {                                                                           //if user's choice is 2 do subtraction
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                System.out.println("The difference between the numbers " + num1 + " and " + num2 + " is = " + (num1 - num2));  ///Print result of subtraction
            } else if (choice == 3) { 																					//if user's choice is 3 do multiplication
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                System.out.println("The product of the numbers " + num1 + " and " + num2 + " is = " + (num1 * num2));  /// Print result of multiplication
            } else if (choice == 4) {                                                                                     // Do Division if user's choice is 4
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                if (num2 != 0) {													///// Nested if to branch division by 0 
                    System.out.println("Dividing " + num1 + " by " + num2 + " the quotient is " + (num1 / num2)); /// Print one line for result of the quotient
                    System.out.println("The remainder is " + (num1 % num2));										//// Print a second line for the result of the remainder	
                } else {
                    System.out.println("Division by zero is not allowed."); ////Print error when second number is zero
                }
            } else if (choice == 5) {                                            // From choice 5 we only need one num, Do Square if user's choice is 5
                System.out.print("Enter the number: ");
                double num = scanner.nextDouble();
                System.out.println("The Square of the number " + num + " is = " + (num * num));  ///print result of squared num
            } else if (choice == 6) { // Square Root
                System.out.print("Enter the number: ");
                double num = scanner.nextDouble();
                if (num >= 0) {  												///// Nested if to branch for only square roots of positive numbers
                    System.out.println("The Square Root of the number " + num + " is = " + Math.sqrt(num)); ///Using Math.sqrt to return the correctly rounded positive square root of a double value.
                } else {
                    System.out.println("The Square root of a negative number is not a real number.");  /// error if number is less than zero
                }
            } else if (choice == 7) { // Reciprocal
                System.out.print("Enter the number: ");
                double num = scanner.nextDouble();
                if (num != 0) {   												///// Nested if to branch  when number is 0 since the reciprocal of zero is infinite
                    System.out.println("The Reciprocal of the number " + num + " is = " + (1 / num));
                } else {
                    System.out.println("Reciprocal of zero is not defined."); /////Print Error for dividing by zero
                }
                
            } else {
                System.out.println("Invalid choice! Please make a valid choice.");  ////Print error when user's choice is not between 1 and 7
            }

            System.out.print("To continue do Calculation Press 1, else press any other number to exit: ");
            continueCalculation = scanner.nextInt();
        } while (continueCalculation == 1);

        scanner.close();
        System.out.println("End of Program.");

		
	}

}
