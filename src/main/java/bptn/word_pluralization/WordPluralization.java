package bptn.word_pluralization;

import java.util.Scanner;

public class WordPluralization {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("# in:");
		int amt = inp.nextInt();
		inp.nextLine(); // this line is necessary
		System.out.print("word:");
		String word = inp.nextLine();
		// leave the above unedited, write your code below:
		if (amt == 1) {
			System.out.printf("%d %s", amt, word);
		} else if (amt > 1 || amt < 1) {
			if (word.endsWith("fe")) {
				System.out.printf("%d %s", amt, ((word.substring(0, word.length() - 2) + "ves")));
			} else if (word.endsWith("y") && !isVowel(word.charAt(word.length() - 2))) {
				System.out.printf("%d %s", amt, ((word.substring(0, word.length() - 1) + "ies")));
			} else if (word.endsWith("sh") || word.endsWith("ch")) {
				System.out.printf("%d %s", amt, word + "es");
			} else if (word.endsWith("us")) {
				System.out.printf("%d %s", amt, ((word.substring(0, word.length() - 2) + "i")));
			} else if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
				System.out.printf("%d %s", amt, (word + "s"));
			} else {
				System.out.printf("%d %s", amt, word + "s");
			}
		}
		inp.close();
	}

	private static boolean isVowel(char c) {
		return "aeiou".indexOf(Character.toLowerCase(c)) != -1;
	}

}
