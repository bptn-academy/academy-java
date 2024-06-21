package _01_week_coding_friday;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Assuming targetNumber is given or generated.
        int targetNumber = 23;
        
        int guess = 0; ///initialize
        boolean guessedExactly = false;
        //ssw

        
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        while (!guessedExactly) {
            guess = scanner.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number correctly!");
                guessedExactly = true;
            }
        }
        
        scanner.close();

	}

}
