import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class GUIWithInnerClass extends JFrame {

	JButton button;
	JLabel label;

	public GUIWithInnerClass() {
		Container c = getContentPane();

		JPanel panel = new JPanel();
		button = new JButton("Button");
		label = new JLabel("Label");

		panel.add(button);
		panel.add(label);

		c.add(panel);

		setSize(300, 100);
		setVisible(true);
	}

	class ButtonResponder extends JFrame implements ActionListener {

		public void makeButton() {
			button.addActionListener(this);
		}

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				label.setText("Outer class label set by inner class " + ButtonResponder.class.getName());
				
			}
		}

	}

	public static void main(String[] args) {
		new GUIWithInnerClass().new ButtonResponder().makeButton();
	}

}
