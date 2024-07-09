package week3.coding32;
import java.util.List;


import java.util.ArrayList;


public class Main {
	
	  public static  List<String> convertArrayToList(String[] inputArray) {
	        
	        // Create a new ArrayList of String. 
		  List<String> arrayList = new ArrayList<>();

	        // Iterate inputArray using a for-each loop and add the elements to the new ArrayList. Hint: Use add() method to add elements to ArrayList.
		  		for(String str : inputArray) {
		  			
		  			arrayList.add(str);
		  		}
		  
	        // return the new list with elements.
		  return arrayList;
	    }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String [] cars = {"Volvo","Honda","Ford"};

        List<String> arraylist = convertArrayToList(cars);

        System.out.println(arraylist);
		

	}

}
