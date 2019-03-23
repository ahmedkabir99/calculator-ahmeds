package com.kabir.scientificcalculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorBasicOperationsTest {

	@Test
	public void testAdd() {
		CalculatorBasicOperations calc = new CalculatorBasicOperations();
		for(int i = 0; i < 50; i++) {
			double numberA = Math.random() * 1000;
			double numberB = Math.random() * 1000;
			double calculatedValue = numberA + numberB;
			Assert.assertEquals(calculatedValue, calc.add(numberA, numberB), 1.0);
		}
	}
	
	@Test
	public void testSubtract() {
		CalculatorBasicOperations calc = new CalculatorBasicOperations();
		for(int i = 0; i < 50; i++) {
			double numberA = Math.random() * 1000;
			double numberB = Math.random() * 1000;
			double calculatedValue = numberA - numberB;
			Assert.assertEquals(calculatedValue, calc.subtract(numberA, numberB), 1.0);
		}
	}
	
	@Test
	public void testDivide() {
		CalculatorBasicOperations calc = new CalculatorBasicOperations();
		for(int i = 0; i < 50; i++) {
			double numberA = Math.random() * 1000;
			double numberB = Math.random() * 1000;
			double calculatedValue = numberA / numberB;
			Assert.assertEquals(calculatedValue, calc.divide(numberA, numberB), 1.0);
		}
	}
	
	@Test
	public void testMultiply() {
		CalculatorBasicOperations calc = new CalculatorBasicOperations();
		for(int i = 0; i < 50; i++) {
			double numberA = Math.random() * 1000;
			double numberB = Math.random() * 1000;
			double calculatedValue = numberA * numberB;
			Assert.assertEquals(calculatedValue, calc.multiply(numberA, numberB), 1.0);
		}
	}
}
