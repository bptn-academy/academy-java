package com.bptn.course._03_flow_control._01_while_loop;

public class WhileLoop {

	public static void main(String[] args) {
		
		
		//Declare and initialize a counter variable
		int counter=1;
		
		//Start the while loop
		while(counter <10 ) {
			
			System.out.println("Counter: "+counter); 
			
			//Increment the counter
			counter += 2; 
		}
		
		System.out.println("Executes the statement after the while loop completes");

	}

}