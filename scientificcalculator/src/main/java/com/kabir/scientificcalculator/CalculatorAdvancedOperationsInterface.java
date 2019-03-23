package com.kabir.scientificcalculator;

/**
 * Advanced calculator functions interface
 *  
 * @author Ahmed Kabir
 */
public interface CalculatorAdvancedOperationsInterface {
	
	public double PI = Math.PI;
	
	/**
	 * Finds Sin series of the given number
	 * 
	 * @param number Number
	 * 
	 * @return Result of the Sin
	 */
	public double sin(double number);
	
	/**
	 * Finds Cos series of the given number
	 * 
	 * @param number Number
	 * 
	 * @return Result of the Cos
	 */
	public double cos(double number);
	
	/**
	 * Finds Tan series of the given number
	 * 
	 * @param number Number
	 * 
	 * @return Result of the tan
	 */
	public double tan(double number);
	
	/**
	 * Find Sinh series of the given number
	 * 
	 * @param number Number
	 * 
	 * @return Result of the Sinh
	 */
	public double sinh(double number);
	
	/**
	 * Find Cosh series of the given number
	 * 
	 * @param number Number
	 * 
	 * @return Result of the Cosh
	 */
	public double cosh(double number);
	
	/**
	 * Find Tanh series of the given number
	 * 
	 * @param number Number
	 * 
	 * @return Result of the Tanh
	 */
	public double tanh(double number);
	
	/**
	 * Find the square root of the given number
	 * 
	 * @param number Number
	 * 
	 * @return Result of the square root
	 */
	public double sqrt(double number);
	
	/**
	 * Find the power of the given number
	 * 
	 * @param number Number
	 * @param power Power
	 * 
	 * @return Result of the power function
	 */
	public double power(double number, double power);
}
