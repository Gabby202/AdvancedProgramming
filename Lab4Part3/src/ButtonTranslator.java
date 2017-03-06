import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonTranslator extends JFrame implements ActionListener{

	public ButtonTranslator() {
		Container c = getContentPane();
		c.setLayout(new GridLayout(2,2));
		
		JButton b1 = new JButton("Translate To French");
		JButton b2 = new JButton("One");
		JButton b3 = new JButton("Two");
		JButton b4 = new JButton("Three");
		
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		
		setSize(400, 300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new ButtonTranslator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
