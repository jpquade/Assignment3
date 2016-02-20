package cse360assign3;

/** Junit test class file
 * @author Jeremy Quade
 * @version Feb 19, 2016
 * 
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	/** Checks if an object was created  */
	@Test
	public void testCalculator() {
		Calculator simpleCalculator = new Calculator();
		assertNotNull(simpleCalculator);
	}
	
	/** Tests if a total will be returned  */
	@Test
	public void testGetTotal() {
		Calculator simpleCalculator = new Calculator();
		
		assertEquals(0, simpleCalculator.getTotal());
	}
	
	/** Tests the add operation  */
	@Test
	public void testAdd() {
		Calculator simpleCalculator = new Calculator();
		
		simpleCalculator.add(4);
		
		assertEquals(4, simpleCalculator.getTotal());
	}
	
	/** Tests the subtract operation  */
	@Test
	public void testSubtract() {
		Calculator simpleCalculator = new Calculator();
		
		simpleCalculator.subtract(4);
		
		assertEquals(-4, simpleCalculator.getTotal());
	}
	
	/** Tests the multiply operation  */
	@Test
	public void testMultiply() {
		Calculator simpleCalculator = new Calculator();
		
		simpleCalculator.add(3);
		simpleCalculator.multiply(2);
		
		assertEquals(6, simpleCalculator.getTotal());
	}
	
	/** Tests the divide operation  */
	@Test
	public void testDivide() {
		Calculator simpleCalculator = new Calculator();
		
		simpleCalculator.add(3);
		simpleCalculator.divide(3);
		
		assertEquals(1, simpleCalculator.getTotal());
		
		simpleCalculator.divide(0);
		
		assertEquals(0, simpleCalculator.getTotal());
	}
	
	/** Checks if the getHistory method gives a proper return of operators and values  */
	@Test
	public void testGetHistory() {
		Calculator simpleCalculator = new Calculator();
		
		simpleCalculator.add(4);
		simpleCalculator.divide(0);
		simpleCalculator.subtract(8);
		simpleCalculator.multiply(2);
		
		assertEquals("0 + 4 / 0 - 8 * 2", simpleCalculator.getHistory());
	}

}