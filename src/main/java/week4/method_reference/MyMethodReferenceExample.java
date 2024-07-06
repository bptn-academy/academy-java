package week4.method_reference;

@FunctionalInterface
interface Sayable {
	void say();
}

class MyClass{
	
	static void saySomething() {
		System.out.println("I say something");
	}
	
	void saySomething2() {
		System.out.println("I say something 2");
	}
}

/*
 * We can refer to an existing method using a functional interface
 */


public class MyMethodReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sayable obj = () -> System.out.println("I say something");
		//Sayable obj =  MyClass::saySomething;
		
		//obj.say();
		hello(MyClass::saySomething);
		
//		MyClass myClass = new MyClass();
	//	Sayable obj = new MyClass()::saySomething2;
		//obj.say();
		
		//We need an object to refer to a non-sattic method
		hello(new MyClass()::saySomething2);
	}
	
	
	static void hello(Sayable obj) {
		obj.say();
		
	}
	

}
