package week4.junit;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class CalculatorTest {
	Calculator calc;
	
	@BeforeAll
	void initialize() {
		
		calc = new Calculator();
		System.out.println("@Test: Initialize()");
		
		
	}
	
	@Test
	void testFindMax() {
		
		System.out.println("@Test: testFindMax()");
		
		Assertions.assertEquals(4, calc.findMax(new int [] {1,3,4,2}));
		//Assertions.assertEquals(10, calc.findMax(new int [] {4,6,3,10}));
		
		int max =  calc.findMax(new int [] {4,6,3,10});
		int expected = 10;

		Assertions.assertEquals(expected, max, "The output was incorrect it expected " + max);
		
	}
	
	@BeforeEach
	void beforeEachTest() {
		/*
		 * 
		 */
		System.out.println("@BeforeEach is executed before each each");
		
	}
	

	@Test
	void testFindMaxNegative() {
		
		System.out.println("@Test: testFindMaxNegative()");
		
		assertEquals(-1, calc.findMax(new int [] { -1, -3, -4, -2}));
		//Assertions.assertEquals(10, calc.findMax(new int [] {4,6,3,10}));
		
		
		
	}
}
