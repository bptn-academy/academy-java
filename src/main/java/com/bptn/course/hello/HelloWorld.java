package com.bptn.course.hello;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		//Find the total lenght of the string and store it inside  a variable
		int stringLenght = s.lenght();
		
		System.out.println("The lenght of the string is:"+stringLenght);
		//substring() method - to get a part of the string
		
		String sub = s.substring(0, 8);
		
		System.out.println("The substring with start index 0 and end index 8:"+ sub);
		
		String sub1 = s.substring(3);
		System.out.println("The substring with start index 3" + sub1 );
		//toLowerCase() - converts all letters of the string to lowercase
		
		String upperCaseString = s.tolowerCase();
		
		//toLowerCase() - converts all letters of the string to case
		
		String lowerCaseString = s.toupperCase();
		
		int index = s.indexOf("World");
		
		System.out.println("The index of World is:"+ index);
		
		
		
		
		

	} 

}
