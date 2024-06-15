package bptn.number_guessing_game;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int target = 23;
		boolean correctGuess = false;
		System.out.println("Guess a number beteen 1 and 100");
		

		while (!correctGuess) {
			int guess = myScanner.nextInt();
			if (guess >= 1 && guess <= 100) {
				if (guess > target) {
					System.out.println("Too high! Try again");
				} else if (guess < target) {
					System.out.println("Too low! Try again");
				} else {
					System.out.println("Congratulations! You guessed the number correctly!");
					correctGuess = true;
				}
			} else {
				System.out.println("Please enter a number between 1 and 100.");
			}
		}
		myScanner.close();

	}

}
