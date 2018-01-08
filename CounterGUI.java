//Author Peter Adamson and Andrew Hampton

import javax.swing.*;
import java.awt.*;

public class CounterGUI extends JFrame{

	private final int WIDTH = 150;
	private final int HEIGHT = 200;
	private JTextField incrementField;
	private JButton incrementButton;
	private JButton decrementButton;

	public CounterGUI(){
		setSize(WIDTH, HEIGHT);
		setTitle("CounterGUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createComponents();
	}

	private void createComponents(){
		incrementField = new JTextField(3);
		incrementButton = new JButton("Increment");
		decrementButton = new JButton("Decrement");
		incrementField.setHorizontalAlignment(JTextField.RIGHT);

		JPanel fieldPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		fieldPanel.add(incrementField);
		buttonPanel.add(incrementButton);
		buttonPanel.add(decrementButton);
		add(buttonPanel, BorderLayout.CENTER);
		add(fieldPanel, BorderLayout.LINE_START);
		
			
	}	

	public static void main(String[] args){
		CounterGUI app = new CounterGUI();
		app.setVisible(true);
	}
}
