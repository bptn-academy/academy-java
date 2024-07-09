package com.bptn.course._practice_exercises;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetManipulation {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		 set.add("A");
		 set.add("B");
		 set.add("C");
		 
		 System.out.println("Set size: " + set.size());
		 
		 for (String element : set) {
			 System.out.println("Element: " + element);
		 }
		 
		 Iterator<String> newIt = set.iterator();
		 System.out.println("Elements in the set (using iterator): ");
		 while (newIt.hasNext()) {
			 
			 System.out.println("Element" + newIt.next());
		 
		 }
		 
		 set.remove("A");
		 System.out.println("Elements after using remove(): " + set);
		 
		 
		 if (set.contains("B")) {
			 System.out.println("Element 'B' exists in the set.");
		 } else {
			 System.out.println("Element 'B' does not exist in the set.");
		 }
		 
		 set.clear();
		 System.out.println("Set after using clear(): " + set);
	}

}
