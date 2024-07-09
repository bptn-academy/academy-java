package com.bptn.course._06_palindrome;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		   System.out.println("Enter the string to check for palindrome: ");
	       Scanner scanner = new Scanner(System.in);
	       String input = scanner.nextLine();
	       String reverseInput = "";

	       // Reverse the input string
	       //using the for loop to initialize the interger i to the index of the input by subtracting 1 from the length
	       //and creating a condition that keeps the loop running as long a i is greater than  or equal to 0
	       //using the i-- post decrement to change the value of i and move the index from the end all through to the beginning
	       for (int i = input.length() - 1; i >= 0; i--) {
	           reverseInput += input.charAt(i);
	       }
	       ///Print out the new string in reverse
	       System.out.println(reverseInput);
	       // Conditional statement to print if reverse is a palindrome or not
	       if (input.equals(reverseInput)) {
	           System.out.println("Input string is palindrome");
	       } else {
	           System.out.println("Input string is not palindrome");
	       }
	       scanner.close();	       
	}

}
