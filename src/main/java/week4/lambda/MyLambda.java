package week4.lambda;

/*
 * A functional interface is an  interface with just One abstract method
 * The functional interface is not mandatory but improves the code readability
 * 
 * 
 * 
 * The functional interface annotation us an informative annotation used to express our intention to use the interface with a Lamda Expression
 * 
 */

interface Sayable{

	String say();

}

interface Sayable2 {

	String say(String str);

}

@FunctionalInterface
interface Addable {

	int add(int a, int b);

}

class MyClass implements Sayable {

	@Override
	public String say() {
		// TODO Auto-generated method stub
		return "I love Java";
	}

}


public class MyLambda {

	public static void main(String[] args) {


		Sayable obj1 = new MyClass();

		//System.out.println(obj1.say());

		/*
		 * 1. Lambda expressions allow us to create anonymous methods.
		 * 2. Lambda expressions allow us to define the body of an interface's
				abstract method without a class that implements the interface.
		 * 3. Lambda expression must be compatible with the interface's abstract
		 * 		method. In other words the Lambda expression must have the same number
		 * 		and type of parameters as the interface' abstract method.
		 * 4. The lambda expression is comprised of:

		1. Parameters
		2. Arrow Token (constant)
		3. Body

		(parameters) -> { body }

		

		 */

		Sayable obj2 = () -> "I love Java";

		System.out.println(obj2.say());

		//Sayable2 obj3 = (String str) -> {return "I love Java
		Sayable2 obj3 = str -> "I love Java - " + str ;
		System.out.println(obj3.say("BPTN"));

		Addable obj4 = (int a, int b) -> a + b;

		Addable obj5 = (a,b) ->{
			b= b * 2;
			return a + (b*3);
		};

		System.out.println(obj4.add(4, 5));
		System.out.println(obj5.add(4, 5));


	}

}
