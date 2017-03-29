import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FormFrame extends JFrame{

	JButton button;
	JTextField field;
	private RegisterPanel panel;
	static FormFrame frame;

	public FormFrame() {
		Container c = getContentPane();
		
		panel = new RegisterPanel();
	
		
		c.add(panel);
		
		setSize(300,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		frame = new FormFrame();
	}
	
	class RegisterPanel extends JPanel{
		
		public RegisterPanel() {
			field = new JTextField(16);
	
			add(field);
			button = new JButton("Submit");
			button.addActionListener(new SubmitResponder());
				
				
			add(button);
		}
		
	}
	
	class SubmitResponder implements ActionListener {

		public SubmitResponder() {
		
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button) {
				
				frame.field.setText("Submitted!");
				frame.field.setEditable(false);
				FormFrame.this.setTitle("Submitted!");
			}
		}
		
	}

}
