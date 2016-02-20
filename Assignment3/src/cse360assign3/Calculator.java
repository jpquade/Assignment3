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
	
	/** Sets total to 0 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
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
		total += value;
	}
	
	/**  subtracts a value to the total
	 *  @param value	integer used with the operation
	 */
	public void subtract (int value) 
	{
		total -= value;
	}
	
	/**  multiplies a value into the total
	 *  @param value	integer used with the operation
	 */
	public void multiply (int value) 
	{
		total *= value;
	}
	
	/**  divides a value into the total
	 *  @param value	integer used with the operation
	 */
	public void divide (int value) 
	{
		if(value == 0)
			total = 0;
		else
			total /= value;
	}
	
	/** Displays the string of  operators used*/
	public String getHistory () 
	{
		return "";
	}
}