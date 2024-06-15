package bptn.word_encryption;

import java.util.Scanner;

public class WordEncryption {

	public static void main(String[] args) {
		//write your code below:
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a word to encrypt");
        String userInput = myScanner.nextLine();
        //create a variable for the encrypted string
        String encrypted = "";
        //loop throught the string and encyrpt it
        for(int i = 0; i < userInput.length(); i++){
            //check if the current index locates a character
            if(Character.isLetter(userInput.charAt(i))){
                if(Character.isUpperCase(userInput.charAt(i))){
                    //To get the next character we subtract the ascii of a from the character then add one to it We then divide it by 26 to keep the the charecters revolving around the 26 alphabets
                    encrypted += (char) ('A' + (userInput.charAt(i) - 'A'  + 1) % 26);
                }else {
                    encrypted += (char) ('a' + (userInput.charAt(i) - 'a' + 1) % 26);
                }
            }else {
                encrypted += userInput.charAt(i);
            }
        }
        System.out.println(encrypted);
        myScanner.close();
	}

}
