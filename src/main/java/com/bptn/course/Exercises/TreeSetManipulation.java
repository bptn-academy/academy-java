package com.bptn.course.Exercises;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Iterator;


public class TreeSetManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> set = new TreeSet<>();
		set.add("A");
	    set.add("B");
		set.add("C");
		
		System.out.println("Set size: " + set.size());
		
		System.out.println("First element: " + set.first());
		System.out.println("Last element: " + set.last());
		System.out.println("Elements less than 'B': " + set.headSet("B"));
		System.out.println("Elements greater than or equal to 'B': " + set.tailSet("B"));
		System.out.println("Elements between 'A'(inclusive) and 'C'(exclusive) : " + set.subSet("A", "C"));
		System.out.println("Does the set contain 'B'? " + set.contains("B"));
		set.remove("B");
		System.out.println("Set after removing 'B': " + set );

	}

}
