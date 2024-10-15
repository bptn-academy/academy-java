package com.bptn.course._01_variables;

public class Variables {
    public static void main(String[] args) {
        // Declare two integer variables and assign them values
        int num1 = 10;
        int num2 = 5;

        // Perform arithmetic operations and store the results in new variables
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;

        // Print the original variables and the results of the arithmetic operations
        System.out.println("Original variables: num1 = " + num1 + ", num2 = " + num2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        // Reassign new values to the original integer variables and print them
        num1 = 20;
        num2 = 8;
        System.out.println("Reassigned variables: num1 = " + num1 + ", num2 = " + num2);

        // Declare a character variable and a string variable and print them
        char myChar = 'A';
        String myString = "Hello, World!";
        System.out.println("Character variable: " + myChar);
        System.out.println("String variable: " + myString);
    }
}
