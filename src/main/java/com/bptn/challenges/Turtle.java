package com.bptn.challenges;

public class Turtle {
	public static void main(String[] args) { // This is the method that is running
	      World habitat = new World(300,300); // Within the "main method". There is a variable named habitat. World is the type. 
	      //new World This is calling the world constructor and makes a new world for me.
	      Turtle yertle = new Turtle(habitat); 
	      // yertle is a variable of the type Turtle which will help me keep track of the turtle.
	      // new Turtle = habitat - This is going to make the new Turtle on habitat

	      yertle.forward(); // methods which say move forward
	      yertle.turnLeft(); // methods which say turn left.
	      yertle.forward(); // method that tells the method to turn forward.

	      habitat.show(true); //passes the argument true if we want to see the steps that the turtle object takes.
	      
	   // To create or declare a new object, write:
	   // ClassName variableName = new ClassName(arguments);
	   Turtle yourTurtleName = new Turtle(habitat);

	   // To run the object's method, we use . notation followed by the method name. 
	   yourTurtlename.forward();
	   
	   // To write your own class, you typically start a class declaration with public + class +  name of the class. The body of the class is defined inside the pair of curly braces
	  } 

}
