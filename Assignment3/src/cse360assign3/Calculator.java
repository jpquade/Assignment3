package cse360assign3;

/** Calculator class file
 * @author Jeremy Quade
 * @version Feb 19, 2016
 * 
 */


public class Calculator 
{
	
	// the current total of the calculations
	private int total;
	
	// used for operators and operations
	private String actions;
	
	/** Sets total to 0 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
		actions = Integer.toString(total);
		
	}
	
	
	/**  returns the total  */
	public int getTotal () 
	{
		return total;
	}
	
	/**  Adds a value to the total
	 *  @param value	integer used with the operation
	 */
	public void add (int value) 
	{
		actions += " + " + value;
		total += value;
	}
	
	/**  subtracts a value to the total
	 *  @param value	integer used with the operation
	 */
	public void subtract (int value) 
	{
		actions += " - " + value;
		total -= value;
	}
	
	/**  multiplies a value with the total
	 *  @param value	integer used with the operation
	 */
	public void multiply (int value) 
	{
		actions += " * " + value;
		total *= value;
	}
	
	/**  divides the total by the value
	 *  @param value	integer used with the operation
	 */
	public void divide (int value) 
	{
		actions += " / " + value;
		if(value == 0)
			total = 0;
		else
			total /= value;
	}
	
	/** Displays the string of values and operators used  */
	public String getHistory () 
	{
		return actions;
	}
}