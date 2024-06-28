package week3.coding37;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		Map <String, Integer> people = new HashMap <>();

		people.put("Angie", 33);
		people.put("Steve", 30);
		people.put("John", 32);

		//System.out.println(people);

		for (Entry <String, Integer> entry: people.entrySet()) {

			System.out.println( "Name: " +entry.getKey() + ", Age:" + entry.getValue() );

		}


	}

}
