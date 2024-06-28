package week3.arraylist_traversal_practice;

import java.util.List;
import java.util.ArrayList;

public class Test1 {
    
    public static String findLongest(ArrayList<String> list) {
		
        //code here
        String longest = list.get(0); ///declare longest as the value of the first element on the list
        for (String str : list) {   /// for each loop to iterate through list 
            if (str.length() > longest.length()) { // if statement to check if iteration is longer than first element and set new iteration to longest if it is longer
                longest = str;
            }
        }
    	
    	return longest;
    }
    
    //Do not modify below code
    public static void main(String[] args) {
        //instantiate ArrayList 
        ArrayList<String> values = new ArrayList<String>();
        String[] words = {"singapore", "cattle", "metropolitan", "turnstile"};
        for (int i = 0; i < words.length; i ++) {
            values.add(words[i]);
        }
        System.out.println("Expected Result: metropolitan");
        System.out.print("Your Result: ");
        System.out.println(findLongest(values));
    }
}
