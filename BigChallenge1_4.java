package com.bptn.course.BigChallenges;

import java.util.Random;
import java.util.Scanner;

public class BigChallenge1_4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = 23; //number to guess is 23
        int guess;

        
        System.out.print("Please enter a number between 1 and 100: ");

        while (true) { // will only break once condition is met, i.e the number is correctly guessed
            guess = scanner.nextInt(); // add user's input into guess as a number

            if (guess < targetNumber) {
                System.out.print("Too low! Try again. "); // if the guess is smaller than the 
                continue;                                  // target number, output "Too low! Try again." 
            } 
            
            else if (guess > targetNumber) {
                System.out.print("Too high! Try again. "); // if the guess is higher than the target number,
                continue;                                   // output "Too high! Try again."
            } 
            
            else if (guess == targetNumber) {
                System.out.print("Congratulations! You guessed the number correctly!");
                break;                                      // if the guess matches the target number,
                                                            // output "Congratulations! You guessed the number correctly!"
            }

            

        scanner.close();
    }
}}
