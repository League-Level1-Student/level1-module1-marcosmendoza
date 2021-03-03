package _07_binary_converter;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+";// must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}
	
JTextField textfield = new JTextField(20);
		JLabel label = new JLabel();
		JFrame frame = new JFrame();
	public static void main(String[] args) {
		BinaryConverter converter = new BinaryConverter();
		converter.button();

	}

	public void button() {
		

		JButton button = new JButton();
		button.addActionListener(this);
		
		JPanel panel = new JPanel();
		
		frame.setVisible(true);
		frame.add(panel);
		panel.add(label);
		panel.add(button);
		panel.add(textfield);
		frame.pack();
		
		
	}
	// 2^3  2^2  2^1  2^0  
	// 1    0    1    0  = 10 in decimal
	
	//  0    1    1   0    1   0   0   1 in binary
	//  0 + 64 + 32 + 0 +  8 + 0 + 0 + 1 = 105
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String answer = textfield.getText();
		answer = convert(answer);
		label.setText(answer);
		frame.pack();
	}
}
