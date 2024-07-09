package week3.coding37;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Integer, String> numbers = new HashMap <>();
		
		numbers.put(1, "one");
		numbers.put(2, "two");
		numbers.put(3, "three");
		numbers.put(4, "four");
		numbers.put(5, "five");
		numbers.put(6, "six");
		numbers.put(7, "seven");
		numbers.put(8, "eight");
		numbers.put(9, "nine");
		numbers.put(10, "ten");
		

		numbers.forEach((k,v) -> System.out.println( k + " : " + v) );
		
		numbers.remove(7);
		numbers.put(11, "eleven");
		
		numbers.forEach((k,v) -> System.out.println( k + " : " + v) );
		
	}

}
