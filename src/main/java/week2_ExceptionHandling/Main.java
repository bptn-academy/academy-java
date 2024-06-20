package week2_ExceptionHandling;

public class Main {
	
	public void method1() {
		int arr[] = {1, 2, 3, 4};
		System.out.println(arr[4]);
	}
	
	public void method2(){
	try {
		method1();
		
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Method2: ArrayIndexOutOfBoundsException handled");
		
	}
	}
	
	public static void main(String args[]) {
	
		Main exceptionSolutionObject = new Main();
		exceptionSolutionObject.method2();	

}
}
