package com.bptn.course._01_variables;

import java.util.Random;

public class randomNumber {

	public static void main(String[] args) {
		
	      

		      // create instance of Random class
		        Random rand = new Random();
		   
		        // Generate random integers in range 0 to 100
		        int rand_int1 = rand.nextInt(100);
		        
		   
		        // Print random integers
		        System.out.println("Random Integers: "+rand_int1);
		        
		   
		        // Generate Random doubles
		        double rand_dub1 = rand.nextDouble();
		       
		   
		        // Print random doubles
		        System.out.println("After execution the Random Number is: "+rand_dub1);
		      
		    
		        
		        



		   

	}

}
