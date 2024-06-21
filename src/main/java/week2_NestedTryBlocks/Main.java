package week2_NestedTryBlocks;

public class Main {
	
	public void method() {
		try {
			
			try {
				int arr[] = {1, 2, 3, 4};
				System.out.println(arr[0]);		
				System.out.println(arr[5]);		
		}
			catch(ArithmeticException ae) {
				System.out.println("ArithmeticException occurred");				
			}
		} 
		catch(ArrayIndexOutOfBoundsException e){
		System.out.println("ArrayIndexOutOfBoundsException is handled in the outer catch block");
		
		}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main whatever = new Main();
		whatever.method();
		

	}

}
