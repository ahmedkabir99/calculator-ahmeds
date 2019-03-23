package com.kabir.scientificcalculator;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import org.junit.Assert;
import org.junit.Test;

public class SciCalculatorTest {

	@Test
	public void testCreateFrame() {
		SciCalculator cal = new SciCalculator();
		JFrame frame = cal.createFrame();
		Rectangle bound = new Rectangle(100, 100, 425, 430);
		Assert.assertEquals(bound, frame.getBounds());
	}
	
	@Test
	public void testCreateDisplay() {
		SciCalculator cal = new SciCalculator();
		JTextField txtField = cal.createDisplay();
		Assert.assertEquals(10, txtField.getColumns());
	}
	
	@Test
	public void testCreateNumberButton() {
		SciCalculator cal = new SciCalculator();
		String buttonLabel = "00";
		JButton button = cal.createNumberButton(buttonLabel, 10, 320, 125, 60);
		Assert.assertEquals(buttonLabel, button.getText());
	}
	
	@Test
	public void testCreateOperationButton() {
		SciCalculator cal = new SciCalculator();
		String buttonLabel = "%";
		JButton button = cal.createOperationButton(buttonLabel, 10, 320, 125, 60);
		Assert.assertEquals(buttonLabel, button.getText());
	}
	
	@Test
	public void testCreateValidAdvancedOperationButton() {
		SciCalculator cal = new SciCalculator();
		String buttonLabel = "Sinh";
		JButton button = cal.createOperationButton(buttonLabel, 10, 320, 125, 60);
		Assert.assertEquals(buttonLabel, button.getText());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCreateInvalidAdvancedOperationButton() {
		SciCalculator cal = new SciCalculator();
		String buttonLabel = "XYZZZ";
		cal.createAdvancedOperationButton(buttonLabel, 10, 320, 125, 60);
	}
	
	@Test
	public void testCreateDotButton() {
		SciCalculator cal = new SciCalculator();
		JButton button = cal.createDotButton();
		Assert.assertEquals(".", button.getText());
	}
	
	@Test
	public void testCreateBackButton() {
		SciCalculator cal = new SciCalculator();
		JButton button = cal.createBackButton();
		Assert.assertEquals("←", button.getText());
	}
	
	@Test
	public void testCreateClearButton() {
		SciCalculator cal = new SciCalculator();
		JButton button = cal.createClearButton();
		Assert.assertEquals("C", button.getText());
	}
	
	@Test
	public void testNumberTenButtonPressed() throws InterruptedException {
		SciCalculator cal = new SciCalculator();
		String buttonLabel = "10";
		JButton button = cal.createNumberButton(buttonLabel, 10, 320, 125, 60);
		ActionEvent event = new ActionEvent(button, ActionEvent.ACTION_PERFORMED, "Anything", System.currentTimeMillis(), 0);
		for(ActionListener listener : button.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		Assert.assertEquals(buttonLabel, cal.getTxtDisplay().getText());
	}
	
	@Test
	public void testSquareAdvancedOperationButtonPressed() throws InterruptedException {
		SciCalculator cal = new SciCalculator();
		
		String buttonLabel = "10";
		JButton button = cal.createNumberButton(buttonLabel, 10, 320, 125, 60);
		ActionEvent event = new ActionEvent(button, ActionEvent.ACTION_PERFORMED, "Anything", System.currentTimeMillis(), 0);
		for(ActionListener listener : button.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		String squareButtonLabel = "x\u00B2";
		JButton squarebutton = cal.createAdvancedOperationButton(squareButtonLabel, 50, 320, 125, 60);
		for(ActionListener listener : squarebutton.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		Assert.assertEquals("100.0", cal.getTxtDisplay().getText());
	}
	
	@Test
	public void testSinAdvancedOperationButtonPressed() throws InterruptedException {
		SciCalculator cal = new SciCalculator();
		
		String buttonLabel = "90";
		JButton button = cal.createNumberButton(buttonLabel, 10, 320, 125, 60);
		ActionEvent event = new ActionEvent(button, ActionEvent.ACTION_PERFORMED, "Anything", System.currentTimeMillis(), 0);
		for(ActionListener listener : button.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		String squareButtonLabel = "Sin";
		JButton squarebutton = cal.createAdvancedOperationButton(squareButtonLabel, 50, 320, 125, 60);
		for(ActionListener listener : squarebutton.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		Assert.assertEquals("0.8939966636005579", cal.getTxtDisplay().getText());
	}
	
	@Test
	public void testSinhAdvancedOperationButtonPressed() throws InterruptedException {
		SciCalculator cal = new SciCalculator();
		
		String buttonLabel = "90";
		JButton button = cal.createNumberButton(buttonLabel, 10, 320, 125, 60);
		ActionEvent event = new ActionEvent(button, ActionEvent.ACTION_PERFORMED, "Anything", System.currentTimeMillis(), 0);
		for(ActionListener listener : button.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		String squareButtonLabel = "Sinh";
		JButton squarebutton = cal.createAdvancedOperationButton(squareButtonLabel, 50, 320, 125, 60);
		for(ActionListener listener : squarebutton.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		Assert.assertEquals("6.102016471589204E38", cal.getTxtDisplay().getText());
	}
	
	@Test
	public void testCosAdvancedOperationButtonPressed() throws InterruptedException {
		SciCalculator cal = new SciCalculator();
		
		String buttonLabel = "0";
		JButton button = cal.createNumberButton(buttonLabel, 10, 320, 125, 60);
		ActionEvent event = new ActionEvent(button, ActionEvent.ACTION_PERFORMED, "Anything", System.currentTimeMillis(), 0);
		for(ActionListener listener : button.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		String opButtonLabel = "Cos";
		JButton opButtonbutton = cal.createAdvancedOperationButton(opButtonLabel, 50, 320, 125, 60);
		for(ActionListener listener : opButtonbutton.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		Assert.assertEquals("1.0", cal.getTxtDisplay().getText());
	}
	
	@Test
	public void testCoshAdvancedOperationButtonPressed() throws InterruptedException {
		SciCalculator cal = new SciCalculator();
		
		String buttonLabel = "0";
		JButton button = cal.createNumberButton(buttonLabel, 10, 320, 125, 60);
		ActionEvent event = new ActionEvent(button, ActionEvent.ACTION_PERFORMED, "Anything", System.currentTimeMillis(), 0);
		for(ActionListener listener : button.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		String opButtonLabel = "Cosh";
		JButton squarebutton = cal.createAdvancedOperationButton(opButtonLabel, 50, 320, 125, 60);
		for(ActionListener listener : squarebutton.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		Assert.assertEquals("1.0", cal.getTxtDisplay().getText());
	}
	
	@Test
	public void testTanAdvancedOperationButtonPressed() throws InterruptedException {
		SciCalculator cal = new SciCalculator();
		
		String buttonLabel = "45";
		JButton button = cal.createNumberButton(buttonLabel, 10, 320, 125, 60);
		ActionEvent event = new ActionEvent(button, ActionEvent.ACTION_PERFORMED, "Anything", System.currentTimeMillis(), 0);
		for(ActionListener listener : button.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		String opButtonLabel = "Tan";
		JButton squarebutton = cal.createAdvancedOperationButton(opButtonLabel, 50, 320, 125, 60);
		for(ActionListener listener : squarebutton.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		Assert.assertEquals("1.6197751905438615", cal.getTxtDisplay().getText());
	}
	
	@Test
	public void testTanhAdvancedOperationButtonPressed() throws InterruptedException {
		SciCalculator cal = new SciCalculator();
		
		String buttonLabel = "45";
		JButton button = cal.createNumberButton(buttonLabel, 10, 320, 125, 60);
		ActionEvent event = new ActionEvent(button, ActionEvent.ACTION_PERFORMED, "Anything", System.currentTimeMillis(), 0);
		for(ActionListener listener : button.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		String opButtonLabel = "Tanh";
		JButton squarebutton = cal.createAdvancedOperationButton(opButtonLabel, 50, 320, 125, 60);
		for(ActionListener listener : squarebutton.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		Assert.assertEquals("1.0", cal.getTxtDisplay().getText());
	}
	
	@Test
	public void testPowerOfThreeAdvancedOperationButtonPressed() throws InterruptedException {
		SciCalculator cal = new SciCalculator();
		
		String buttonLabel = "3";
		JButton button = cal.createNumberButton(buttonLabel, 10, 320, 125, 60);
		ActionEvent event = new ActionEvent(button, ActionEvent.ACTION_PERFORMED, "Anything", System.currentTimeMillis(), 0);
		for(ActionListener listener : button.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		String opButtonLabel = "x\u00B3";
		JButton squarebutton = cal.createAdvancedOperationButton(opButtonLabel, 50, 320, 125, 60);
		for(ActionListener listener : squarebutton.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		Assert.assertEquals("27.0", cal.getTxtDisplay().getText());
	}
	
	@Test
	public void testPiAdvancedOperationButtonPressed() throws InterruptedException {
		SciCalculator cal = new SciCalculator();
		
		String opButtonLabel = "\u03C0";
		JButton button = cal.createAdvancedOperationButton(opButtonLabel, 50, 320, 125, 60);
		ActionEvent event = new ActionEvent(button, ActionEvent.ACTION_PERFORMED, "Anything", System.currentTimeMillis(), 0);
		for(ActionListener listener : button.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		Assert.assertEquals("3.141592653589793", cal.getTxtDisplay().getText());
	}
	
	@Test
	public void testBackButtonPressed() throws InterruptedException {
		SciCalculator cal = new SciCalculator();
		
		String buttonLabel = "10";
		JButton button = cal.createNumberButton(buttonLabel, 10, 320, 125, 60);
		ActionEvent event = new ActionEvent(button, ActionEvent.ACTION_PERFORMED, "Anything", System.currentTimeMillis(), 0);
		for(ActionListener listener : button.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		JButton backbutton = cal.createBackButton();
		for(ActionListener listener : backbutton.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		Assert.assertEquals("1", cal.getTxtDisplay().getText());
	}
	
	@Test
	public void testEqualsButtonForAdditionPressed() throws InterruptedException {
		SciCalculator cal = new SciCalculator();
		
		String buttonLabel = "10";
		JButton button = cal.createNumberButton(buttonLabel, 10, 320, 125, 60);
		ActionEvent event = new ActionEvent(button, ActionEvent.ACTION_PERFORMED, "Anything", System.currentTimeMillis(), 0);
		for(ActionListener listener : button.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		JButton opButton = cal.createOperationButton("+", 20, 320, 125, 60);
		for(ActionListener listener : opButton.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		for(ActionListener listener : button.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		JButton equalsButton = cal.createEqualsButton();
		for(ActionListener listener : equalsButton.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		Assert.assertEquals("20.00", cal.getTxtDisplay().getText());
	}
	
	@Test
	public void testEqualsButtonForSubtractionPressed() throws InterruptedException {
		SciCalculator cal = new SciCalculator();
		
		String twentyButtonLabel = "20";
		JButton button = cal.createNumberButton(twentyButtonLabel, 10, 320, 125, 60);
		ActionEvent event = new ActionEvent(button, ActionEvent.ACTION_PERFORMED, "Anything", System.currentTimeMillis(), 0);
		for(ActionListener listener : button.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		JButton opButton = cal.createOperationButton("-", 20, 320, 125, 60);
		for(ActionListener listener : opButton.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		String tenButtonLabel = "10";
		JButton tenButton = cal.createNumberButton(tenButtonLabel, 30, 320, 125, 60);
		for(ActionListener listener : tenButton.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		JButton equalsButton = cal.createEqualsButton();
		for(ActionListener listener : equalsButton.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		Assert.assertEquals("10.00", cal.getTxtDisplay().getText());
	}
	
	@Test
	public void testEqualsButtonForMultiplicationPressed() throws InterruptedException {
		SciCalculator cal = new SciCalculator();
		
		String twentyButtonLabel = "20";
		JButton button = cal.createNumberButton(twentyButtonLabel, 10, 320, 125, 60);
		ActionEvent event = new ActionEvent(button, ActionEvent.ACTION_PERFORMED, "Anything", System.currentTimeMillis(), 0);
		for(ActionListener listener : button.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		JButton opButton = cal.createOperationButton("*", 20, 320, 125, 60);
		for(ActionListener listener : opButton.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		String tenButtonLabel = "10";
		JButton tenButton = cal.createNumberButton(tenButtonLabel, 30, 320, 125, 60);
		for(ActionListener listener : tenButton.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		JButton equalsButton = cal.createEqualsButton();
		for(ActionListener listener : equalsButton.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		Assert.assertEquals("200.00", cal.getTxtDisplay().getText());
	}
	
	@Test
	public void testEqualsButtonForDivisionPressed() throws InterruptedException {
		SciCalculator cal = new SciCalculator();
		
		String twentyButtonLabel = "20";
		JButton button = cal.createNumberButton(twentyButtonLabel, 10, 320, 125, 60);
		ActionEvent event = new ActionEvent(button, ActionEvent.ACTION_PERFORMED, "Anything", System.currentTimeMillis(), 0);
		for(ActionListener listener : button.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		JButton opButton = cal.createOperationButton("/", 20, 320, 125, 60);
		for(ActionListener listener : opButton.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		String tenButtonLabel = "10";
		JButton tenButton = cal.createNumberButton(tenButtonLabel, 30, 320, 125, 60);
		for(ActionListener listener : tenButton.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		JButton equalsButton = cal.createEqualsButton();
		for(ActionListener listener : equalsButton.getActionListeners()) {
			listener.actionPerformed(event);
		}
		Thread.sleep(100);
		
		Assert.assertEquals("2.00", cal.getTxtDisplay().getText());
	}
}
