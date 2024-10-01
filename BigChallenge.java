package com.bptn.course.BigChallenges;




import java.util.*;

public class BigChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        boolean ValidNumber = true;
        
        
        do {
            
            System.out.println("/... Calculator Menu.../");					// adding menu
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for division");
            System.out.println("Press 5 to square a number");
            System.out.println("Press 6 to find the square root");
            System.out.println("Press 7 to find the reciprocal");
            

            input = scanner.nextInt();									//added scanner
          
            if (input == 1) {   // use if statement to say if a certain number is inputted, do a certain mathematical operation
                System.out.println("Enter the first number:");
                double num1 = scanner.nextDouble();			//if they want to add, record their inputs and add

                System.out.println("Enter the second number:");
                double num2 = scanner.nextDouble();

                double sum = num1 + num2; // find the sum

                System.out.println("The sum of the numbers " + num1 + " and " + num2 + " is = " + sum);		//sum displayed
                System.out.println("To continue calculations, press 1. Press anything else to exit"); // message displayed
                int inputAdd = scanner.nextInt();

                if (inputAdd==1) { // if they press 1, go back to menu

                  continue;
                } else {    // if not, stop

                  break;
                }
            
            }

              // cycle repeats for the other mathematical operations
          
            else if (input == 2) {
                System.out.println("Enter the first number:");		
                double num1 = scanner.nextDouble();

                System.out.println("Enter the second number:");
                double num2 = scanner.nextDouble();

                double difference = num1 - num2;

                System.out.println("The difference between " + num1 + " and " + num2 + " is = " + difference);
                System.out.println("To continue calculations, press 1. Press anything else to exit");
                int inputAdd = scanner.nextInt();

                if (inputAdd==1) {

                  continue;
                } else {

                  break;
                }
            
            }

       
            

            else if (input == 3) {
                System.out.println("Enter the first number:");
                double num1 = scanner.nextDouble();

                System.out.println("Enter the second number:");
                double num2 = scanner.nextDouble();

                double product = num1 * num2;

                System.out.println("The product of the numbers " + num1 + " and " + num2 + " is = " + product);
                System.out.println("To continue calculations, press 1. Press anything else to exit");
                int inputAdd = scanner.nextInt();

                if (inputAdd==1) {

                  continue;
                } else {

                  break;
                }
            
            }
            
            else if (input == 4) {
                System.out.println("Enter the first number:");
                double num1 = scanner.nextDouble();

                System.out.println("Enter the second number:");
                double num2 = scanner.nextDouble();

                double quotient = num1 / num2;
                double remainder = num1 % num2;
                if (num2 == 0) {
                	System.out.println("you cant divide by zero"); // cant divide by zero
                	continue;
                }

                System.out.println("Dividing " + num1 + " by " + num2 + "  the quotient is " + quotient);
                System.out.println("The remainder is " + remainder);
                System.out.println("To continue calculations, press 1. Press anything else to exit");
                int inputAdd = scanner.nextInt();

                if (inputAdd==1) {

                  continue;
                } else {

                  break;
                }
            
            }
            
            else if (input == 5) {
                System.out.println("Enter the number to find Square:");
                double num1 = scanner.nextDouble();

               

                double squareNum = num1 * num1;
                
           
                System.out.println( "The Square of the number " +  num1 + " is = " + squareNum);
                System.out.println("To continue calculations, press 1. Press anything else to exit");
                int inputAdd = scanner.nextInt();

                if (inputAdd==1) {

                  continue;
                } else {

                  break;
                }
            
            }
            
            else if (input == 6) {
                System.out.println("You selected to find the square root of a number. Enter the number:");
                double num1 = scanner.nextDouble();

                

                double squarerootNum = Math.sqrt(num1);
                
                

                System.out.println("The square root of  " + num1 + " is = " + squarerootNum);
                System.out.println("To continue calculations, press 1. Press anything else to exit");
                int inputAdd = scanner.nextInt();

                if (inputAdd==1) {

                  continue;
                } else {

                  break;
                }}
                
                else if (input == 7) {
                    System.out.println("Enter the number to find Reciprocal :");
                    double num1 = scanner.nextDouble();

                    

                    double reciprocalNum = 1/ num1;
                    
                    if(num1 == 0) {
                    	System.out.println("you can't take the reciprocal of zero"); //cant take reciprocal of zero
                    	continue;
                    }

                    System.out.println("The reciprocal of the number  " + num1 + " is = " + reciprocalNum);
                    System.out.println("To continue calculations, press 1. Press anything else to exit");
                    int inputAdd = scanner.nextInt();

                    if (inputAdd==1) {

                      continue;
                    } else {

                      break;
                    }
                
                }
                else if (input==8 || input ==9 || input == 0)  // if they input 8, 9 or 0, stop fully.
                System.out.println("Invalid choice! Please make a valid choice");
                {
                	continue;
                }

                
            }
            
            

        while (true);
























        scanner.close();
    }
}
