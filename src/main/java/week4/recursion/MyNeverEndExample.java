package week4.recursion;

public class MyNeverEndExample {

	static void neverEnd(int num) {

		System. out.println("This is a method that never ends: "+ num);
		neverEnd(num+1);
	}
	public static void main(String[] args) {
		neverEnd(0);
	}
}