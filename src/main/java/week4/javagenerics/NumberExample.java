package week4.javagenerics;

import java.util.ArrayList;

public class NumberExample {
	
	public static int sum(ArrayList <Integer> numbers) {
        int total = 0;
        for (Integer number : numbers) {
            total += number;
        }
        return total;
    

}
	

	public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
       // numbers.add(3.3);  // Long example
       // numbers.add(4.4);
        numbers.add(5);
        
        int sumNumbers = sum(numbers);
		
        System.out.println(sumNumbers);
	}       
        

}
