import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Lab3Part2 extends JFrame implements ActionListener {

	
	
	JButton stringLengthButton;
	JTextField inputField;
	JLabel outputLabel;

	/**
	 * @author Gavi
	 * 
	 */
	public Lab3Part2() {
		Container c = getContentPane();

		JPanel panel1 = new JPanel();
		inputField = new JTextField(16);
		stringLengthButton = new JButton("Get String Length");
		stringLengthButton.addActionListener(this);

		panel1.add(inputField);
		panel1.add(stringLengthButton);

		outputLabel = new JLabel("String Length = ");

		c.add(panel1);
		c.add(outputLabel, BorderLayout.SOUTH);

		setSize(300, 150);
		setVisible(true);
	}

	/**
	 * 
	 * @exception NullPointerException
	 *                throws when no string inputed
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == stringLengthButton) {
			try {
				if (inputField.getText().isEmpty()) {
					inputField = null;

				} else {
					outputLabel.setText("String Length = " + inputField.getText().length());
				}
			} catch (NullPointerException ex) {
				ex.printStackTrace();

				String str = JOptionPane.showInputDialog("String was empty, try again");

				outputLabel.setText("String Length = " + str.length());
			}
		}
	}

	/**
	 * @param args
	 *            call constructor
	 */
	public static void main(String[] args) {
		new Lab3Part2();
	}

}
