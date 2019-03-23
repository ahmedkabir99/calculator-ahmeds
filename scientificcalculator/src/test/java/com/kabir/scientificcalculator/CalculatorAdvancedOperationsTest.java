package com.kabir.scientificcalculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorAdvancedOperationsTest {
	
	@Test
	public void testSin() {
		CalculatorAdvancedOperationsInterface calc = new CalculatorAdvancedOperations();
		for(int i = 0; i < 50; i++) {
			double number = Math.random() * 1000;
			if(i % 10 == 0) {
				number = number * (-1.0);
			}
			double calculatedValue = calc.sin(number);
			Assert.assertEquals(Math.sin(number), calculatedValue, 1.0);
		}
	}
	
	@Test
	public void testSinh() {
		CalculatorAdvancedOperationsInterface calc = new CalculatorAdvancedOperations();
		for(int i = 0; i < 50; i++) {
			double number = Math.random() * 1000;
			if(i % 10 == 0) {
				number = number * (-1.0);
			}
			double calculatedValue = calc.sinh(number);
			Assert.assertEquals(Math.sinh(number), calculatedValue, 1.0);
		}
	}
	
	@Test
	public void testCos() {
		CalculatorAdvancedOperationsInterface calc = new CalculatorAdvancedOperations();
		for(int i = 0; i < 50; i++) {
			double number = Math.random() * 1000;
			if(i % 10 == 0) {
				number = number * (-1.0);
			}
			double calculatedValue = calc.cos(number);
			Assert.assertEquals(Math.cos(number), calculatedValue, 1.0);
		}
	}
	
	@Test
	public void testCosh() {
		CalculatorAdvancedOperationsInterface calc = new CalculatorAdvancedOperations();
		for(int i = 0; i < 50; i++) {
			double number = Math.random() * 1000;
			if(i % 10 == 0) {
				number = number * (-1.0);
			}
			double calculatedValue = calc.cosh(number);
			Assert.assertEquals(Math.cosh(number), calculatedValue, 1.0);
		}
	}
	
	@Test
	public void testTan() {
		CalculatorAdvancedOperationsInterface calc = new CalculatorAdvancedOperations();
		for(int i = 0; i < 50; i++) {
			double number = Math.random() * 1000;
			if(i % 10 == 0) {
				number = number * (-1.0);
			}
			double calculatedValue = calc.tan(number);
			Assert.assertEquals(Math.tan(number), calculatedValue, 1.0);
		}
	}
	
	@Test
	public void testTanh() {
		CalculatorAdvancedOperationsInterface calc = new CalculatorAdvancedOperations();
		for(int i = 0; i < 50; i++) {
			double number = Math.random() * 1000;
			if(i % 10 == 0) {
				number = number * (-1.0);
			}
			double calculatedValue = calc.tanh(number);
			Assert.assertEquals(Math.tanh(number), calculatedValue, 1.0);
		}
	}
	
	@Test
	public void testSqrt() {
		CalculatorAdvancedOperationsInterface calc = new CalculatorAdvancedOperations();
		for(int i = 0; i < 50; i++) {
			double number = Math.random() * 1000;
			if(i % 10 == 0) {
				number = number * (-1.0);
			}
			double calculatedValue = calc.sqrt(number);
			Assert.assertEquals(Math.sqrt(number), calculatedValue, 1.0);
		}
	}
}
