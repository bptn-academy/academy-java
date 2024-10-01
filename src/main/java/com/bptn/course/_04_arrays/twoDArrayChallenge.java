package com.bptn.course._04_arrays;

public class twoDArrayChallenge {

    public static void main(String[] args) {

        int[][] grades = {
            {85, 90}, 
            {88, 92}, 
            {70, 65}
        };

        // Loop through the rows
        for (int i = 0; i < grades.length; i++) {
            // Loop through the columns in each row (length of inner array)
            for (int j = 0; j < grades[i].length; j++) {
                grades[i][j] += 2; // Increment each grade by 2
            }
        }

        // Print the updated array
        System.out.println("Updated Grades:");
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}


