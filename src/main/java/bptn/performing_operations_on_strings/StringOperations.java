package bptn.performing_operations_on_strings;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		// create a scanner
		Scanner myScanner = new Scanner(System.in);
		// create a boolean variable to check whether to run the loop again or end
		boolean exit = false;

		// run a do while loop to ask the user for inputs until the choose to end
		do {
			System.out.println("What would you like to do today \nPress 1 for Palindrome Check\n"
					+ "Press 2 to reverse a String\n" + "Press 3 to Concatenate two Strings\n"
					+ "Press 4 for String Comparison\n" + "Press 5 to Calculate the Length of String \n");
			int userOperation = myScanner.nextInt();
			myScanner.nextLine();
			System.out.println(userOperation);

			String firstString;
			String secondString;
			if (userOperation == 1) {
				System.out.println("Enter the string");
				firstString = myScanner.nextLine();
				int left = 0;
				int right = firstString.length() - 1;
				boolean isPalindrome = true;
				while (left < right) {
					if (firstString.charAt(left) != firstString.charAt(right)) {
						isPalindrome = false;
						break;
					}
					left++;
					right--;
				}
				if (isPalindrome) {
					System.out.println(firstString + " is a palindrome");
				} else {
					System.out.println(firstString + " is not a palindrome");
				}

			} else if (userOperation == 2) {
				System.out.println("Enter the string");
				firstString = myScanner.nextLine();
				int counter = firstString.length() - 1;
				String reversed = "";
				while (counter >= 0) {
					reversed += firstString.charAt(counter);
					counter--;
				}
				System.out.println(reversed);
			} else if (userOperation == 3) {
				System.out.println("Enter the first string");
				firstString = myScanner.nextLine();
				System.out.println("Enter the second string");
				secondString = myScanner.nextLine();
				System.out.println(firstString + secondString);
			} else if (userOperation == 4) {
				System.out.println("Enter the first string");
				firstString = myScanner.nextLine();
				System.out.println("Enter the second string");
				secondString = myScanner.nextLine();
				if (firstString.equals(secondString)) {
					System.out.println("The entered strings are equal");
				} else {
					System.out.println("The entered strings are not equal");
				}

			} else if (userOperation == 5) {
				System.out.println("Enter a string ");
				String string = myScanner.nextLine();
				int stringLength = string.length();
				System.out.printf("The length of the entered string is: %d\n", stringLength);
			} else {
				System.out.println("Invalid choice! Please make a valid choice.");
			}
			System.out.println("To continue calculation Press 1, else press any other number to exit");
			int exitStartOver = myScanner.nextInt();
			// if the user does not want to continue, set the exit boolean to be true
			if (exitStartOver != 1) {
				exit = true;
			}
		} while (!exit);
		myScanner.close();
	}

}
