package com.bptn.course._practice_exercises;

import java.util.HashMap;

public class HashMapAwesomeness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		int c = 88;
		
		HashMap<String, Integer> happy = new HashMap<String, Integer>();
		happy.put("a", 10);
		happy.put("b", 3);
		happy.put("c", 88);
		System.out.println(happy.get("c"));
		
		HashMap<String,String> fun = new HashMap<>();
		
		fun.put("bobbyJoe1996", "FluffyP0nies!");
		fun.put("hellomilo@gmail.com", "Green0578");
		fun.put("hruhah@yahoo.com", "sksbai989!");
		
		fun.remove("hello@gmail.com");
		System.out.println(fun.containsValue("Green0578"));
		
		
		System.out.println(fun);
		
		
		
	
		
		
		

	}

}
