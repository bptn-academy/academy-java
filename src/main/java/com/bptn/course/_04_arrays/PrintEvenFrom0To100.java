package com.bptn.course._04_arrays;

public class PrintEvenFrom0To100 {

	public static void main(String[] args) {
		// Approach-1
		
		for(int i= 2; i<=100; i+=2) {
		
		System.out.println(i);
		
	}
		//Approach-2
		for(int i=1 ; i<= 100; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}

  }
}
