package week3.threads;

class MyThread extends Thread{

	
	
	
	
	
	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("Running: " + this.getName() + " - " +this.getState() );
		
		for( int i=0; i<10; i++){
			System.out.println("Running: " + this.getName() + " - " +this.getState() + " - " + i);
			
			try {
				Thread.sleep(400);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Exiting: " + this.getName() + " - " +this.getState() );
		
		
	}
	
	
	
	
}


public class ThreadExample {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("Running: " + Thread.currentThread().getName() + " - " + 
								Thread.currentThread().getState());

		
		MyThread t1 = new MyThread("T1");
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Running" + t1.getName() + " - " +t1.getState() );
		
		MyThread t2 = new MyThread("T2");
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Running" + t2.getName() + " - " +t2.getState() );
		
		MyThread t3 = new MyThread("T3");
		t3.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Running" + t3.getName() + " - " +t3.getState() );
		
		/*
		 * To start the thread we must call the start() method and the start() method calls the run method internally
		 */
		
		
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println( t1.getName() + " - " +t1.getState() );
		System.out.println( t2.getName() + " - " +t2.getState() );
		System.out.println( t3.getName() + " - " +t3.getState() );
	}

}
