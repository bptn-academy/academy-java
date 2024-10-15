package com.bptn.course._08_polymorphism;

public class Polymorphism2 {
	
	//parent class
	class Shape{
		void drawAngle(){
			System.out.println("Animal a shape angle");
			
			//sub-class-Rectangle
			class Rectangle extends Shape{
				
				@Override
				void drawAngle(){
					
				}
			}
		}
	}
	
public static void main(String [] args) {	
}
	

}
