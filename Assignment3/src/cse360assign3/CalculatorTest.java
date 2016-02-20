package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator simpleCalculator = new Calculator();
		assertNotNull(simpleCalculator);
	}

	@Test
	public void testGetTotal() {
		Calculator simpleCalculator = new Calculator();
		
		assertEquals(0, simpleCalculator.getTotal());
	}

	@Test
	public void testAdd() {
		Calculator simpleCalculator = new Calculator();
		
		simpleCalculator.add(4);
		
		assertEquals(4, simpleCalculator.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator simpleCalculator = new Calculator();
		
		simpleCalculator.subtract(4);
		
		assertEquals(-4, simpleCalculator.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator simpleCalculator = new Calculator();
		
		simpleCalculator.add(3);
		simpleCalculator.multiply(2);
		
		assertEquals(6, simpleCalculator.getTotal());
	}

	@Test
	public void testDivide() {
		Calculator simpleCalculator = new Calculator();
		
		simpleCalculator.add(3);
		simpleCalculator.divide(3);
		
		assertEquals(1, simpleCalculator.getTotal());
		
		simpleCalculator.divide(0);
		
		assertEquals(0, simpleCalculator.getTotal());
	}

	@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}

}