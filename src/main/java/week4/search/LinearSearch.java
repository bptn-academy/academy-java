package week4.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.SortedSet;


public class LinearSearch {

	 static int linearSearch( int [] arr, int key) {
		 
		 int size = arr.length;
	    // Iterate over all elements in the List using for-each loop
	    for (int i =0  ; i < size; i++) {
	      // Check if the current value is equal to the target
	      if (arr[i] == key) {
	        // If so, return true
	        return i;
	      }
	    }
	    // If the target was not found, return false
	    return -1;
	  }
	
	public static void main(String[] args) {
		
		int [] input = {58,65,1,2,3,4,5,6,95,10,203,256,42,753,621,9632,1111,5555};
		
		int key = 621;
		
		//List <Integer> numbers = new ArrayList<>(Arrays.asList(58,65,1,2,3,4,5,6,95,10,203,256,42,753,621,9632,1111,5555));
		
		System.out.println(LinearSearch.linearSearch(input, key));
		
		
	}

}
