package com.bptn.course._practice_exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;


public class HashMapManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		
		System.out.println("Map size: " + map.size());
		//I found the Map.Entry interface on the oracle.com site.  
		//I am using it to represent an entry within the for-each loop
		 for (Map.Entry<String, Integer> entry : map.entrySet()) {
			 System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
			
		 
		 int value = map.get("A");
		 System.out.println("Value of key 'A': "+ value);
		 
		 System.out.println("Map after adding a new key-value pair:");
			map.put("D", 4);
			for (Map.Entry<String, Integer> entry : map.entrySet()) {
				 System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		        }
			
			if (map.containsKey("C")) {
				System.out.println("Key 'C' exists in the map");
			}else {
				System.out.println("Key 'C' does not exist in the map");
			}
			
			
			


	}

}
