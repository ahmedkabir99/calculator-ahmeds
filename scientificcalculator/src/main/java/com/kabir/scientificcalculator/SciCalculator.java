package com.kabir.scientificcalculator;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * Scientific calculator in Java Swing. 
 * 
 * @author Ahmed Kabir
 */
public class SciCalculator {
	
	private JFrame frame;
	private JTextField txtDisplay;
	
	private double firstNumber;
	private double secondNumber;
	private double result;
	private String operations;
	private String answer;
	
	private CalculatorBasicOperationsInterface basicCalc;
	private CalculatorAdvancedOperationsInterface advancedCalc;
	
	private static final Logger LOGGER = Logger.getLogger(SciCalculator.class.getName());

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run(){
				try {
					SciCalculator window = new SciCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					LOGGER.severe("Exception occured!");
				}
			}
		});
	}
	
	public SciCalculator() {
		
		basicCalc = new CalculatorBasicOperations();
		advancedCalc = new CalculatorAdvancedOperations();
		createUiComponents();
	}
	
	private void createUiComponents() {
		
		frame = createFrame();
		
		txtDisplay = createDisplay();
	
		// Create buttons for 0 to 9 numbers
		createNumberButton("0", 10, 320, 125, 60);
		createNumberButton("1", 10, 255, 60, 60);
		createNumberButton("2", 75, 255, 60, 60);
		createNumberButton("3", 140, 255, 60, 60);
		createNumberButton("4", 10, 190, 60, 60);
		createNumberButton("5", 75, 190, 60, 60);
		createNumberButton("6", 140, 190, 60, 60);
		createNumberButton("7", 10, 125, 60, 60);
		createNumberButton("8", 75, 125, 60, 60);
		createNumberButton("9", 140, 125, 60, 60);
		
		// Create buttons for basic math operations (addition, subtraction, division and multiplication)
		createOperationButton("+", 205, 60, 60, 60);
		createOperationButton("-", 140, 60, 60, 60);
		createOperationButton("/", 205, 125, 60, 60);		
		createOperationButton("*", 205, 190, 60, 60);
		
		// Advanced operations
		createAdvancedOperationButton("Sin", 275, 190, 60, 60);		// Button "Sin"
		createAdvancedOperationButton("Sinh", 340, 190, 60, 60);	// Button "Sinh"
		createAdvancedOperationButton("Cos", 275, 255, 60, 60); 	// Button "Cos"
		createAdvancedOperationButton("Cosh", 340, 255, 60, 60); 	// Button "Cosh"
		createAdvancedOperationButton("Tan", 275, 320, 60, 60);		// Button "Tan"
		createAdvancedOperationButton("Tanh", 340, 320, 60, 60); 	// Button "Tanh"
		createAdvancedOperationButton("x\u00B2", 275, 125, 60, 60);	// Button "x^2"
		createAdvancedOperationButton("x\u00B3", 340, 125, 60, 60);	// Button "x^3"
		createAdvancedOperationButton("\u03C0", 275, 60, 60, 60);	// Button "Pi"
		createAdvancedOperationButton("\u221A", 340, 60, 60, 60); 	// Button "Square Root"
		
		createBackButton();
		createClearButton();
		createDotButton();
		createEqualsButton();
	}
	
	JFrame createFrame() {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 425, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		return frame;
	}
	
	JTextField createDisplay() {
		// Display
		JTextField txtDisplay = new JTextField();
		txtDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtDisplay.setBounds(10, 11, 389, 40);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		return txtDisplay;
	}
	
	JButton createNumberButton(String buttonLabel, int posX, int posY, int width, int height) {
		
		final JButton button = new JButton(buttonLabel);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = txtDisplay.getText() + button.getText(); 
				txtDisplay.setText(value);
			}
		});
		button.setFont(new Font("SansSerif", Font.BOLD, 18));
		button.setBounds(posX, posY, width, height);
		frame.getContentPane().add(button);
		
		return button;
	}
	
	JButton createOperationButton(String operation, int posX, int posY, int width, int height) {
		
		JButton operationButton = new JButton(operation);
		operationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = operation;
			}
		});
		operationButton.setFont(new Font("SansSerif", Font.BOLD, 18));
		operationButton.setBounds(posX, posY, width, height);
		frame.getContentPane().add(operationButton);
		
		return operationButton;
	}
	
	JButton createEqualsButton() {
		
		JButton buttonEnter = new JButton("=");
		buttonEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				secondNumber = Double.parseDouble(txtDisplay.getText());
				if(operations == "+"){
					result = basicCalc.add(firstNumber, secondNumber); 
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				} else if(operations == "-"){
					result = basicCalc.subtract(firstNumber, secondNumber);
					answer = String.format("%.2f", result); 
					txtDisplay.setText(answer);
					
				} else if(operations == "*"){
					result = basicCalc.multiply(firstNumber, secondNumber); 
					answer = String.format("%.2f", result); 
					txtDisplay.setText(answer);
					
				} else if(operations == "/"){
					result = basicCalc.divide(firstNumber, secondNumber);
					answer = String.format("%.2f", result); 
					txtDisplay.setText(answer);
				}
			}
		});
		buttonEnter.setFont(new Font("SansSerif", Font.BOLD, 18));  		
		buttonEnter.setBounds(205, 255, 60, 125);
		frame.getContentPane().add(buttonEnter);
		
		return buttonEnter;
	}
	
	JButton createAdvancedOperationButton(String scientificOperation, int posX, int posY, int width, int height) {
		
		if(!"Sin".equals(scientificOperation) && !"Sinh".equals(scientificOperation) 
				&& !"Cos".equals(scientificOperation) && !"Cosh".equals(scientificOperation) 
				&& !"Tan".equals(scientificOperation) && !"Tanh".equals(scientificOperation)
				&& !"x\u00B2".equals(scientificOperation) && !"x\u00B3".equals(scientificOperation) 
				&& !"\u03C0".equals(scientificOperation) && !"\u221A".equals(scientificOperation)) {
			throw new IllegalArgumentException("Operation not allowed!");
		}
		
		JButton advancedOperationButton = new JButton(scientificOperation);
		advancedOperationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double calculatedValue = 0.0d;
				double input = 0.0d;
				switch(scientificOperation) {
					case "Sin":
						input = Double.parseDouble(String.valueOf(txtDisplay.getText()));
						calculatedValue = advancedCalc.sin(input);
						break;
					case "Sinh":
						input = Double.parseDouble(String.valueOf(txtDisplay.getText()));
						calculatedValue = advancedCalc.sinh(input);
						break;
					case "Cos":
						input = Double.parseDouble(String.valueOf(txtDisplay.getText()));
						calculatedValue = advancedCalc.cos(input);
						break;
					case "Cosh":
						input = Double.parseDouble(String.valueOf(txtDisplay.getText()));
						calculatedValue = advancedCalc.cosh(input);
						break;
					case "Tan":
						input = Double.parseDouble(String.valueOf(txtDisplay.getText()));
						calculatedValue = advancedCalc.tan(input);
						break;
					case "Tanh":
						input = Double.parseDouble(String.valueOf(txtDisplay.getText()));
						calculatedValue = advancedCalc.tanh(input);
						break;
					case "x\u00B2": // Square
						input = Double.parseDouble(String.valueOf(txtDisplay.getText()));
						calculatedValue = advancedCalc.power(input, 2.0);
						break;
					case "x\u00B3": // Power of 3
						input = Double.parseDouble(String.valueOf(txtDisplay.getText()));
						calculatedValue = advancedCalc.power(input, 3.0);
						break;
					case "\u03C0": // PI
						calculatedValue = CalculatorAdvancedOperationsInterface.PI;
						break;
					case "\u221A": // Square Root
						input = Double.parseDouble(String.valueOf(txtDisplay.getText()));
						calculatedValue = advancedCalc.sqrt(input);
						break;
					default:
						break;
				}
				txtDisplay.setText(String.valueOf(calculatedValue));
			}
		});
		advancedOperationButton.setFont(new Font("SansSerif", Font.BOLD, 11));
		advancedOperationButton.setBounds(posX, posY, width, height);
		frame.getContentPane().add(advancedOperationButton);
		return advancedOperationButton;
	}
	
	JButton createDotButton() {
		
		final JButton buttonDot = new JButton(".");	
		buttonDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dot = txtDisplay.getText() + buttonDot.getText(); 
				txtDisplay.setText(dot);
			}
		});	
		buttonDot.setFont(new Font("SansSerif", Font.BOLD, 20));
		buttonDot.setBounds(140, 320, 60, 60);
		frame.getContentPane().add(buttonDot);
		
		return buttonDot;
	}
	
	JButton createBackButton() {
		
		// Button "Backspace" "\uF0E7"
		JButton buttonBackspace = new JButton("←");
		buttonBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null; 
				if(txtDisplay.getText().length()>0){
					StringBuilder stbr = new StringBuilder(txtDisplay.getText());
					stbr.deleteCharAt(txtDisplay.getText().length()-1);
					backspace = stbr.toString(); 
					txtDisplay.setText(backspace);
				}
			}
		});
		buttonBackspace.setFont(new Font("SansSerif", Font.BOLD, 18));
		buttonBackspace.setBounds(10, 60, 60, 60);
		frame.getContentPane().add(buttonBackspace);
		return buttonBackspace;
	}
	
	JButton createClearButton() {
		// Button "C"
		JButton buttonClear = new JButton("C");
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		buttonClear.setFont(new Font("SansSerif", Font.BOLD, 18));
		buttonClear.setBounds(75, 60, 60, 60);
		frame.getContentPane().add(buttonClear);
		return buttonClear;
	}

	public JFrame getFrame() {
		return frame;
	}

	public JTextField getTxtDisplay() {
		return txtDisplay;
	}
}
