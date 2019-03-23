package com.kabir.scientificcalculator;

/**
 * Implement advanced functions of the calculator
 *  
 * @author Ahmed Kabir
 */
public class CalculatorAdvancedOperations implements CalculatorAdvancedOperationsInterface {

	@Override
	public double sin(double number) {
		return Math.sin(number);
	}

	@Override
	public double cos(double number) {
		return Math.cos(number);
	}

	@Override
	public double tan(double number) {
		return Math.tan(number);
	}

	@Override
	public double sinh(double number) {
		return Math.sinh(number);
	}

	@Override
	public double cosh(double number) {
		return Math.cosh(number);
	}

	@Override
	public double tanh(double number) {
		return Math.tanh(number);
	}

	@Override
	public double sqrt(double number) {
		return Math.sqrt(number);
	}

	@Override
	public double power(double number, double power) {
		return Math.pow(number, power);
	}
}
