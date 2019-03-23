package com.kabir.scientificcalculator;

/**
 * Implements basic operations of the calculator
 * 
 * @author Ahmed Kabir
 */
public class CalculatorBasicOperations implements CalculatorBasicOperationsInterface {

	@Override
	public double add(double a, double b) {
		return a + b;
	}

	@Override
	public double subtract(double a, double b) {
		return a - b;
	}

	@Override
	public double divide(double a, double b) {
		return a / b;
	}

	@Override
	public double multiply(double a, double b) {
		return a * b;
	}
}
