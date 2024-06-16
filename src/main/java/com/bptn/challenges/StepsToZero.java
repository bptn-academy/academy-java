package com.bptn.challenges;
import java.util.Scanner;

public class StepsToZero {
	public static int numberOfSteps(int num) {
        int steps = 0;

        // Fill in the code below based on the problem statement
        
        while ( num!= 0) {      
         if ( num%2 == 0) {
        	    num/=2;  
        	}
         else {
        	num --;         	    	
        }
        steps++;    
        }     

        return steps;
    }

    // Do not modify the code below. You can use it for a quick sanity check. 
    public static void main(String[] args) {
        int num = 14;
        int steps = numberOfSteps(num);
        System.out.println("Number of steps to reduce " + num + " to zero: " + steps);
    }

}
