package com.bptn.course._Linkedlist;

		import java.util.LinkedList;
		import java.util.List;

		public class LinkedListDemo {
		    public static void main(String[] args) {
		        // Create a LinkedList that implements the List interface
		        List<String> linkedList = new LinkedList<>();

		        // adding courses with add() method
		        linkedList.add("Java");
		        linkedList.add("Kotlin");
		        linkedList.add("SQL");
		        linkedList.add("HTML");
		        linkedList.add("CSS");
		        linkedList.add("Python");
		        
		        System.out.println("Courses: " + linkedList);
		        
		        // accessing an element using get() method
		        String element = linkedList.get(2);

		        System.out.println("Course at index 2: " + element);
		        
		     // remove Python using remove() method
		        linkedList.remove("Python");
		        System.out.println("Courses after removing Python: " + linkedList);

		        // remove Kotlin by index using remove() method
		        linkedList.remove(1);

		        System.out.println("Final Courses: " + linkedList);


	}

}
