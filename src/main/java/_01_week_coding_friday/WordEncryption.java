package _01_week_coding_friday;

import java.util.Scanner;
public class WordEncryption {

	public static void main(String[] args) {
		///effeefss
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a word
	        System.out.print("Enter a word: ");
	        String input = scanner.nextLine();
	        
	        // Encrypt the word
	        String scrambledWord = encryptWord(input);
	        
	        // Display the encrypted word
	        System.out.println("Encrypted word: " + scrambledWord);
	        
	        scanner.close();
	    }

	    // Method to encrypt the word
	    public static String encryptWord(String word) {
	        StringBuilder encrypted = new StringBuilder();

	        for (int i = 0; i < word.length(); i++) {
	            char ch = word.charAt(i);
	            
	            
	            
	            if (ch >= 'a' && ch <= 'z') {
	                // Shift lowercase letters
	                if (ch == 'z') {
	                    encrypted.append('a');
	                } else {
	                    encrypted.append((char) (ch + 1));
	                }
	            } else if (ch >= 'A' && ch <= 'Z') {
	                // Shift uppercase letters
	                if (ch == 'Z') {
	                    encrypted.append('A');
	                } else {
	                    encrypted.append((char) (ch + 1));
	                }
	            } else {
	                // Leave non-alpha characters unchanged
	                encrypted.append(ch);
	            }
	        }

	        return encrypted.toString();

	}

}
