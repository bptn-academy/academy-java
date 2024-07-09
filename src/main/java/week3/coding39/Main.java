package week3.coding39;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class Main  {

    public static void main(String[] args) throws InterruptedException {

    List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(5,1,4,3,6,2));

    // Create a t1 and t2 of MyThread class here.
    MyThread t1 = new MyThread("T1",list);
	
	///System.out.println("Running" + t1.getName() + " - " +t1.getState() );
	
	MyThread t2 = new MyThread("T2",list);
	
	//System.out.println("Running" + t2.getName() + " - " +t2.getState() );

    // Start t1 and t2 threads here
	t1.start();
	t2.start();
	
    // Run the join() method from t1 and t2 threads here
	t1.join();
	t1.join();
    // Print out the list variable here.
	System.out.println(list);
}

}