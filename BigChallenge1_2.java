package com.bptn.course.BigChallenges;

import java.util.Scanner;

public class BigChallenge1_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n...String Menu...");
            System.out.println("Press 1 for Palindrome Check");
            System.out.println("Press 2 to reverse a String");
            System.out.println("Press 3 to Concatenate two Strings");
            System.out.println("Press 4 for String Comparison");
            System.out.println("Press 5 to Calculate the Length of String");
            System.out.println("Press 6 to Exit");
                    // Added the entire menu above
            
            choice = scanner.nextInt();
            scanner.nextLine();         // adding a scanneer 

            switch (choice) {
                case 1:
                    System.out.println("1");
                    System.out.println("Palindrome Check");
                    System.out.print("Enter a string: ");
                    String palindromeInput = scanner.nextLine();
                    String reversePalindrome = "";  // will fill this with the reverse palindrome using a for loop

                    for (int i = palindromeInput.length() - 1; i >= 0; i--) { // starting at the end and going backwards, add the letter to
                        reversePalindrome += palindromeInput.charAt(i);        // the reverse palindrome variable
                    }

                    if (palindromeInput.equals(reversePalindrome)) { //if they're equal to each other, say its a palindrome
                        System.out.println(palindromeInput + " is a palindrome.");
                    } else {
                        System.out.println(palindromeInput + " is not a palindrome."); // if not say it isnt a palindrome
                    }
                    break;

                case 2:
                    System.out.println("2");
                    System.out.println("Reverse a String");
                    System.out.print("Enter a string: ");
                    
                    String input = scanner.nextLine();
                    String inputReverse = "";

                    for (int i = input.length() - 1; i >= 0; i--) { // similar to the palindrome, except its adding the characters into a new variable and outputting it
                        inputReverse += input.charAt(i);       //reverse input takes the last letter
                    }

                    System.out.println("The reversed string is: " + inputReverse);  // outputs the reverse word
                    break;
            
                case 3:
                    System.out.println("3");
                    System.out.print("Enter First string: ");
                    String inputUser = scanner.nextLine();
                    
                    System.out.print("Enter Second String: ");
                    String inputUser2 = scanner.nextLine();

                    String bothInput = inputUser.concat(inputUser2); //concat allows the "addition" of strings
                    System.out.println(bothInput); // outputs both strings together
                    break;

                case 4:
                    System.out.println("4");
                    System.out.println("String Comparison");
                    System.out.println("Enter First string: ");
                    String inputUser41 = scanner.nextLine();
                    
                    System.out.print("Enter Second String: ");
                    String inputUser42 = scanner.nextLine();

                    if (inputUser41.equals(inputUser42)) { //looks at both inputted strings, sees if they are the same
                        System.out.println("The entered strings are equal."); //outputs that theyre equal if they are
                    } else {
                        System.out.println("The entered strings are not equal."); // outputs that they arent if they are not
                    }
                    break;

                case 5:
                    System.out.println("5");
                    System.out.println("Length of a string");
                    System.out.print("Enter a string: ");
                    String inputUser51 = scanner.nextLine();

                    int length = inputUser51.length(); // checks how many letters are in the word the user input
                    System.out.print("The length of the entered string is: " + length);
                    break;

                

                default: // Takes care of other invalid cases
                    System.out.println("Invalid choice! Please make a valid choice.");
                    break;
            }

        } while (choice != 6);
        
        scanner.close();
    }
}
