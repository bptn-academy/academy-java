package week3.coding36;

import java.util.HashSet;
import java.util.Set;

public class HashSetManipulation {

	public static void main(String[] args) {

		// Create a HashSet and populate it with initial values
		Set <String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
			

		// Print the size of the set
		System.out.println("Set size: "+ set.size());

		// Use for loop to print the values in the set
		
		for(String str: set) {
			System.out.println("Value: " + str);

		}
		

		// Use add() method to add a new value to the set
		set.add("D");
		
		System.out.println("Set after using add():");
		for(String str: set) {
			System.out.println("Value: " + str);

		}
		

		// Use remove() method to remove a value from the set
		set.remove("A");
		System.out.println("Set after using remove():");
		for(String str: set) {
			System.out.println("Value: " + str);

		}
		
		

		// Use contains() method to check if the value "C" exists in the set
		if (set.contains("C")==true) {
			System.out.println("Value 'C' exists in the set.");
		}else {
			System.out.println("Value 'C' doesn't exists in the set.");
		}
		

	}

}
