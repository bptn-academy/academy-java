package com.bptn.course._16_collection_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExamples {

	public static void main(String[] args) {
		
		
		//Create an object of Hash Set
		
		Set<String> hashSet = new HashSet<>();
		
		hashSet.add("apple");
		hashSet.add("banana");
		hashSet.add("cherry");
		hashSet.add("mango");
		hashSet.add("apple"); //It allows duplicates
		hashSet.add("null"); // It allows null value? Yes
		
		System.out.println("The HashSet of fruits: "+ hashSet);
	
		
		
		//. Insertion Order
		//2. It allows null values?
		//3. It allow duplicates?
		//4. Underlying implementation
		//5. Is a Hashset indexed? -No

	}

}
