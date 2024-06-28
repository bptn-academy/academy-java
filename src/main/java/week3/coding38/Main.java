package week3.coding38;

public class Main {
	   public static void main(String[] args) {

	        // Create a variable from the MyThread class here.
		   	MyThread mythread1 = new MyThread(50);
		   	MyThread mythread2 = new MyThread(50);
	        // Start the thread here
		   	mythread1.start(); 
			mythread2.start(); 
		   	
	    }
}
