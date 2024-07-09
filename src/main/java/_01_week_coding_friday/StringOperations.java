package _01_week_coding_friday;

import java.util.Scanner;

public class StringOperations {
////efefes
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
        int continueStringOperations;
		
        
        
		do {
			System.out.println("/................String Menu................/ ");
			System.out.println("Press 1 for Palindrome Check");
			System.out.println("Press 2 to reverse a String ");
			System.out.println("Press 3 to Concatenate two Strings ");
			System.out.println("Press 4 for String Comparison ");
			System.out.println("Press 5 to Calculate the Length of String");
			System.out.println("Enter the option:");
			
			int userInput = scanner.nextInt();
			
			switch (userInput) {
			
			case 1 :
				System.out.println("Enter a string to check if it is a Palindrome: ");
				String userString = scanner2.nextLine();
				String reverseUserString = "";
				for (int i = userString.length() - 1; i >= 0; i--) {
					reverseUserString += userString.charAt(i);
			       }
				if (userString.equals(reverseUserString)) {
			           System.out.println("Input string is palindrome");
			       } else {
			           System.out.println("Input string is not palindrome");
			       } 
				break;
			case  2: 
				System.out.println("Enter a string to reverse it: ");
				String userString6 = scanner2.nextLine();
				String reverseUserString1 = "";
				for (int i = userString6.length() - 1; i >= 0; i--) {
					reverseUserString1 += userString6.charAt(i);
			       }
				System.out.println("The reversed value of the string " + userString6 + "is:" + reverseUserString1);
				break;
			case  3:
				System.out.println("Enter the first string you would like to concatenate");
				String userString1 = scanner2.nextLine();
				System.out.println("Enter the first string you would like to concatenate");
				String userString2 = scanner2.nextLine();
				System.out.println("The combination of the two strings is: "  + userString1 + userString2);
				break;
			case  4:
				System.out.println("Enter the first string");
				String userString3 = scanner2.nextLine();
				System.out.println("Enter the second string you would like to compare to the first");
				String userString4 = scanner2.nextLine();
				if (userString3.equals(userString4)) {
			           System.out.println("The entered strings are equal");
			       } else {
			           System.out.println("The entered strings are not equal");
			       }           
				break;  				
			case  5:
				System.out.println("Enter any string to determine its length");
				String userString5 = scanner2.nextLine();
				System.out.println("The length of the string is: " + userString5.length() + "."  );
			default :
				System.out.println("Invalid choice! Please make a valid choice.");  ////Print error when user's choice is not between 1 and 5
				
			
		}System.out.print("To continue String Operation Press 1, else press any other number to exit: ");
		continueStringOperations = scanner.nextInt();
	}
		
		while (continueStringOperations == 1);
		
		  scanner.close();
		  scanner2.close();
	        System.out.println("End of Program.");
		

		}
}
