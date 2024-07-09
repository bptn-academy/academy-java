package week4.recursion;

public class MyFactorial {
	
	static int factorial (int num) {
		if (num == 1){
		return 1;
		}
		return num * factorial(num -1);
	}
	
	static int factorialIterative (int num) {
		int fact = 1;
		while (num >1) {
			fact = fact * num;
			num--;
		}
		
		return fact;
	}
	

	public static void main(String[] args) {
		
		System.out.println(factorial(5));
		System.out.println(factorialIterative(5));
	}

}
