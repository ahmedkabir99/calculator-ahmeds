package com.kabir.scientificcalculator;

/**
 * Basic calculator functions interface
 *  
 * @author Ahmed Kabir
 */
public interface CalculatorBasicOperationsInterface {
	
	/**
	 * Adds 2 numbers
	 * 
	 * @param a First number to add
	 * @param b Second number to add
	 * 
	 * @return Sum of the two numbers
	 */
	public double add(double a, double b);
	
	/**
	 * Subtracts second number from the first number (i.e. a - b)
	 * 
	 * @param a First number
	 * @param b Second number
	 * 
	 * @return Result of the subtraction
	 */
	public double subtract(double a, double b);
	
	/**
	 * Divides first number by the second number (i.e. a/b)
	 * 
	 * @param a First number
	 * @param b Second number
	 * 
	 * @return Result of the devision
	 */
	public double divide(double a, double b);
	
	/**
	 * Multiplies first number by the second number (i.e. a * b)
	 * 
	 * @param a First number
	 * @param b Second number
	 * 
	 * @return Result of the multiplication
	 */
	public double multiply(double a, double b);
}
