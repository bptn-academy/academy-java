package com.bptn.course._practice_exercises;
import java.util.Set;

import java.util.HashSet;

public class HashSetManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		
		System.out.println("Set size: "+ set.size());
		
		for(String element: set) {
			System.out.println("Value: " + element);
		}
		System.out.println("Set after using add(): ");
		set.add("D");
		for(String element: set) {
			System.out.println("Value: " + element);
		}
		set.remove("A");
		for(String element: set) {
			System.out.println("Value: " + element);
		}
		
		if(set.contains("C")) {
			System.out.println("Value 'C' exists in the set.");
		} else {
			System.out.println("Value 'C' does not exist in the set.");
		}

	 

	}

}
