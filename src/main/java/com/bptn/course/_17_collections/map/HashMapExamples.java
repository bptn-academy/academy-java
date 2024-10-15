package com.bptn.course._17_collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {

	public static void main(String[] args) {
		// create a project
		
				Map<String, Integer> hashMap= new HashMap<>();
				
				hashMap.put("Angle", 33);
				hashMap.put("Steve", 34);
				hashMap.put("John", 35);
				hashMap.put("Angle", 32);
				hashMap.put("Jane", 34);
				hashMap.put("Oluniyi", 45);
				hashMap.put(null,  20);
				hashMap.put("Johnson", null);
				
				System.out.println(hashMap);
				
				
				
				
				
				//Major key takeaways:
				//1. Does it preserve insertion order? No
				//2. Does keys allow null values?
				//3. Does values allow null values? Yes values can consist of null value-Multiple null value
				//4. Does keys allow duplicates? if we try to add the key once again, it override the value instead of value
				//5. Does values allow duplicates? Yes

			}

		


	}


