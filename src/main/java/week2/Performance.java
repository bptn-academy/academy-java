package week2;

   class MyName{
	
	int num1;
	String newString;
	
	MyName(){
		
	}
	
	
	MyName(int num1, String newString) {
		this.num1 = num1;
		this.newString = newString;
	}
	
	public int hello(){
		return num1 * 10;
	}
	
	public int hello(int num2) {
		num2 = 3;
		return num1 * num2;
	}
	
	
}
   
 class NewClass extends MyName{
	
	@Override
	public int hello(int num2) {
		return num2/1;
		}

	@Override
	public int hello() {
		// TODO Auto-generated method stub
		return super.hello();
	}
	
 }
   
   
public class Performance {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] newStr = {"Hi", "Homa", "Yellow", "BPTN", "new", "Carlos", "Age", "Phone", "School", "Laptop"};
		
		for(int i = newStr.length -1; i>=0; i--) {
			if(newStr[i].endsWith("i")||newStr[i].endsWith("e")|| newStr[i].endsWith("a")||newStr[i].endsWith("u")||newStr[i].endsWith("o") ) {
				System.out.println(newStr[i]);	
			}
					
		}
		
		NewClass newObject = new NewClass();
		newObject.hello(100);
		System.out.println(newObject.hello(100));
		

	

}
}
