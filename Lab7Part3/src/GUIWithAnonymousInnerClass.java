import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIWithAnonymousInnerClass extends JFrame {

	public static void main(String[] args) {

		GUIWithAnonymousInnerClass c = new GUIWithAnonymousInnerClass();
		
		
		JButton button = new JButton("Button");
		
		JLabel label = new JLabel();
		
		JPanel panel = new JPanel();
		
		panel.add(label);
		panel.add(button);
		
		c.getContentPane().add(panel); 
	

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("Outer class label set by inner class " + this.getClass().getName());
			}
		});
		
		c.setSize(300, 100);
		c.setVisible(true);
	}

}
