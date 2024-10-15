package com.bptn.course._03_flow_control._03_if_statement;

public class IfStatement {
    public static void main(String[] args) {
        // Declare and initialize the number variable
        int number = 15;

        // Check if the number is even
        if (number % 2 == 0) {
            // If the number is divisible by 2 with no remainder, it's even
            System.out.println(number + " is an even number.");
        } else {
            // If the number is not divisible by 2, it's odd
            System.out.println(number + " is an odd number.");
        }
    }
}
