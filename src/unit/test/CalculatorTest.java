package unit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	void test() {
	  NumbersPlus();
	  NumbersSubtract();
	  NumbersMultiply();
	  NumbersDivided();
	  testBlank();
	  StringAdd();
	  NegativeNumbers();
	  

		
		
		
	}

	void NumbersPlus() {
		Calculator cal = new Calculator();
		// Testing test add
		assertEquals(25, cal.add(10, 15));
	}

	
	void NumbersSubtract() {
		Calculator cal = new Calculator();
		// Testing test subtract
		assertEquals(15,cal.subtract(25, 10));
	}
	
	void NumbersMultiply() {
		Calculator cal = new Calculator();
		// Testing the multiply
		assertEquals(150,cal.multiply(10, 15));
	}
	
	void NumbersDivided() {
		Calculator cal = new Calculator();
		// Testing the divide
		assertEquals(1,cal.divide(8,8));
	}
	void testBlank() {
		StringCalculator stringCal = new StringCalculator();
		assertEquals(0,stringCal.add(""));
	}
	
	void StringAdd() {
		StringCalculator stringCal = new StringCalculator();
		assertEquals(32, stringCal.add("1,2,3,4,6,7,9"));
	}
	
	void NegativeNumbers() {

		Exception ex =assertThrows(IllegalArgumentException.class, () -> {
			StringCalculator stringCal = new StringCalculator();
			assertEquals(32, stringCal.add("1,2,3,4,6,-7,9"));
		});
		assertEquals("Only Positive Numbers -7",ex.getMessage());

	}
	
}
