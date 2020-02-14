import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Calculator extends JFrame {
	
	public Calculator() {
		// Ctor
		super("My Calculator");
		
		// Stack will be used to store char inputs and later perform calculations
		Stack<Character> exp = new Stack<Character>();
		
		// Set Layout
		GridBagLayout layout = new GridBagLayout();
		setLayout(layout);
		GridBagConstraints c = new GridBagConstraints();
		
		// Create output box at the top of the display
		JTextField output = new JTextField();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridwidth = 3;
		c.gridx = 0;
		c.gridy = 0;
		add(output, c);
		
		// BEGIN ADD BUTTONS
		JButton button1 = new JButton("1");
		c.weightx = 0.5;
		c.gridwidth = 1;
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 0;
	    c.gridy = 1;
	    // Perform the following, when pressed
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	numberButtonAction(output, exp, '1');
            }
        });
	    add(button1, c);
	 
	    JButton button2 = new JButton("2");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridx = 1;
	    c.gridy = 1;
	    // Perform the following, when pressed
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	numberButtonAction(output, exp, '2');
            }
        });
	    add(button2, c);
	 
	    JButton button3 = new JButton("3");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridx = 2;
	    c.gridy = 1;
	    // Perform the following, when pressed
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	numberButtonAction(output, exp, '3');
            }
        });
	    add(button3, c);
	    
	    JButton button4 = new JButton("4");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridx = 0;
	    c.gridy = 2;
	    // Perform the following, when pressed
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	numberButtonAction(output, exp, '4');
            }
        });
	    add(button4, c);
	    
	    JButton button5 = new JButton("5");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridx = 1;
	    c.gridy = 2;
	    // Perform the following, when pressed
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	numberButtonAction(output, exp, '5');
            }
        });
	    add(button5, c);
	    
	    JButton button6 = new JButton("6");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridx = 2;
	    c.gridy = 2;
	    // Perform the following, when pressed
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	numberButtonAction(output, exp, '6');
            }
        });
	    add(button6, c);
	    
	    JButton button7 = new JButton("7");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridx = 0;
	    c.gridy = 3;
	    // Perform the following, when pressed
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	numberButtonAction(output, exp, '8');
            }
        });
	    add(button7, c);
	    
	    JButton button8 = new JButton("8");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridx = 1;
	    c.gridy = 3;
	    // Perform the following, when pressed
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	numberButtonAction(output, exp, '8');
            }
        });
	    add(button8, c);
	    
	    JButton button9 = new JButton("9");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridx = 2;
	    c.gridy = 3;
	    // Perform the following, when pressed
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	numberButtonAction(output, exp, '9');
            }
        });
	    add(button9, c);
	    
	    JButton button0 = new JButton("0");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridx = 0;
	    c.gridy = 4;
	    // Perform the following, when pressed
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	numberButtonAction(output, exp, '0');
            }
        });
	    add(button0, c);
	    
	    JButton decimal = new JButton(".");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridx = 1;
	    c.gridy = 4;
	    // Perform the following, when pressed
        decimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	numberButtonAction(output, exp, '.');
            }
        });
	    add(decimal, c);
	    
	    JButton plus = new JButton("+");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridx = 2;
	    c.gridy = 4;
	    // Perform the following, when pressed
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	numberButtonAction(output, exp, '+');
            }
        });
	    add(plus, c);
	    
	    JButton minus = new JButton("-");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridx = 0;
	    c.gridy = 5;
	    // Perform the following, when pressed
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	numberButtonAction(output, exp, '-');
            }
        });
	    add(minus, c);
	    
	    JButton mult = new JButton("*");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridx = 1;
	    c.gridy = 5;
	    // Perform the following, when pressed
        mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	numberButtonAction(output, exp, '*');
            }
        });
	    add(mult, c);
	    
	    JButton divide = new JButton("/");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridx = 2;
	    c.gridy = 5;
	    // Perform the following, when pressed
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	numberButtonAction(output, exp, '/');
            }
        });
	    add(divide, c);
	    
	    JButton equals = new JButton("=");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.ipady = 20;
	    c.weightx = 0.0;
	    c.gridwidth = 2;
	    c.gridx = 0;
	    c.gridy = 6;
	    // Perform the following, when pressed
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	// insert method here to perform calculation
            	calculate(output);
            }
        });
	    add(equals, c);
	    
	    JButton clear = new JButton("C");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.0;
	    c.gridwidth = 2;
	    c.gridx = 2;
	    c.gridy = 6;
	    // Perform the following, when pressed
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	output.setText("");
            }
        });
	    add(clear, c);
	    // FINISH ADD BUTTONS
	}
	
	
	// Executes when user selects a number/decimal button
	private void numberButtonAction(JTextField output, Stack<Character> exp, char num) {
		String currentOutput = output.getText();
    	output.setText(currentOutput + num);
    	// push onto stack for later calculation
    	exp.push(num);
	}
	
	
	// Performs calculation
	private void calculate(JTextField output) {
		String input = output.getText();
		String delims = "[+\\-*/]+";
		String[] tokens = input.split(delims);
		for (int i = 0; i < tokens.length; i++)
			System.out.println(tokens[i]);
	}

	public static void main(String[] args) {
		Calculator frame = new Calculator();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(500, 400);
		frame.setVisible(true);
	}

}
