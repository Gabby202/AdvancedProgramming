package gui;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author Gavi
 *
 */
public class StringConversionFrame extends JFrame implements ActionListener{
	
	JButton button;
	JLabel label3;
	JTextField tf;
	/**
	 * 
	 */
	public StringConversionFrame(){
		Container c = getContentPane();
		c.setLayout(new GridLayout(5, 1));
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		
		button = new JButton("Change");
		button.addActionListener(this);
		
		JLabel label1 = new JLabel("Enter Number to be changed: ");
		panel1.add(label1);
		
		tf = new JTextField(16);
		panel2.add(tf);
		
		JLabel label2 = new JLabel("Your Changed input is :");
		panel3.add(label2);
		
		label3 = new JLabel();
		label3.setHorizontalAlignment(JLabel.CENTER);
		panel4.add(label3);
		
		c.add(panel1);
		c.add(panel2);
		c.add(panel3);
		c.add(panel4);
		c.add(button);
		
		
		
		setVisible(true);
		setSize(400,400);
	}
	/**
	 * 
	 * @param args convert string
	 */
	public static void main(String[] args) {
		new StringConversionFrame();
	}

	@Override
	/**
	 * @author Gavi
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button){
			String s = numbersAndStrings.NumberToStringConverter.convertToString(Integer.parseInt(tf.getText()));
			label3.setText(s);
		}
	}
}
