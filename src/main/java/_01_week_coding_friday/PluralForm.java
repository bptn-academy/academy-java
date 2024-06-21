package _01_week_coding_friday;

import java.util.Scanner;

public class PluralForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("# in:"); 
		int amt = inp.nextInt();
		System.out.print("word:");
	    String word = scanner2.nextLine();

	      // Print the pluralized form
	      System.out.println(amt + " " + pluralize(amt, word));
	      inp.close();
		  scanner2.close();
	}
	
	   public static String pluralize(int amt, String word) {
	        // If the amount is 1, return the singular form
	        if (amt == 1) {
	            return word;
	        }
	
	        
	//ssa
    // Apply the pluralization rules
    if (word.endsWith("fe")) {
                return word.substring(0, word.length() - 2) + "ves";
    } else if (word.endsWith("y") && !word.endsWith("ay") && !word.endsWith("oy") && !word.endsWith("ey") && !word.endsWith("uy")) {
           return word.substring(0, word.length() - 1) + "ies";
    } else if (word.endsWith("sh") || word.endsWith("ch")) {
                 return word + "es";
    } else if (word.endsWith("us")) {
                   return word.substring(0, word.length() - 2) + "i";
    } else if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
                   return word + "s";
    } else {
                    return word + "s";
    }
    
	}

}
