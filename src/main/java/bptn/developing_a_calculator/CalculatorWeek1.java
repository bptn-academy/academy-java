package bptn.developing_a_calculator;

import java.util.Scanner;

public class CalculatorWeek1 {

	public static void main(String[] args) {
        // create a scanner
		Scanner myScanner = new Scanner(System.in);
		//create a boolean variable to check whether to run the loop again or end
		boolean exit = false;
       
		// run a do while loop to ask the user for inputs until the choose to end
		do{
			System.out.println("What would you like to do today \nPress 1 for addition" + "\r\n" + "\r\n"
					+ "Press 2 for subtraction \r\n" + "\r\n" + "Press 3 for multiplication \r\n" + "\r\n"
					+ "Press 4 for division \r\n" + "\r\n" + "Press 5 to square a number \r\n" + "\r\n"
					+ "Press 6 to find a square root \r\n " + "\r\n" + "Press 7 to find the reciprocal");
			double userOperation = myScanner.nextDouble();
			System.out.println(userOperation);
			
			double firstNum;
			double secondNum;
			if(userOperation == 1) {
				System.out.println(" Enter the first Number");
				firstNum = myScanner.nextDouble();
				System.out.println(" Enter the second Number");
				secondNum = myScanner.nextDouble();
				System.out.println(firstNum + secondNum);
			}
			else if(userOperation == 2) {
				System.out.println(" Enter the first Number");
				firstNum = myScanner.nextDouble();
				System.out.println(" Enter the second Number");
				secondNum = myScanner.nextDouble();
				System.out.println(firstNum - secondNum);
			}
			else if(userOperation == 3) {
				System.out.println(" Enter the first Number");
				firstNum = myScanner.nextDouble();
				System.out.println(" Enter the second Number");
				secondNum = myScanner.nextDouble();
				System.out.println(firstNum * secondNum);
			}
			else if(userOperation == 4) {
				System.out.println(" Enter the first Number");
				firstNum = myScanner.nextDouble();
				System.out.println(" Enter the second Number");
				secondNum = myScanner.nextDouble();
                //cannot divide by zero 
				if(secondNum == 0 || firstNum == 0 ) {
					System.out.println("Sorry we cannot divide a number by zero");
				}
                double divisionResult = firstNum / secondNum;
                double divisionRemainder = firstNum % secondNum;
				System.out.printf("Dividing %.1f by %.1f the quotient is %.1f\nThe remainder is %.1f", firstNum, secondNum, divisionResult, divisionRemainder);
			}
			else if(userOperation == 5) {
				System.out.println("Enter the number to find Square: ");
				double number = myScanner.nextDouble();
				System.out.println( number * number);
			}
			else if(userOperation == 6) {
				System.out.println(" Enter the number to find Square root:");
				double number = myScanner.nextDouble();
				System.out.println( Math.sqrt(number));
			}
			else if(userOperation == 7) {
				System.out.println(" Enter the number to find reciprocal:");
				double number = myScanner.nextDouble();
				System.out.println( 1/number);
			}
			else {
				System.out.println("Invalid choice!");
			}
			System.out.println("To continue calculation Press 1, else press any other number to exit");
			double exitStartOver = myScanner.nextDouble();
            // if the user does not want to continue, set the exit boolean to be true
			if(exitStartOver != 1) {
				exit = true;
			}
    }while(!exit);
		myScanner.close();
        
    }

}
