import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;
import resource.*;

public class ButtonTranslator extends JFrame implements ActionListener{

	
	
	public ButtonTranslator() {
		Container c = getContentPane();
		c.setLayout(new GridLayout(2,2));
		
		Locale loc = new Locale("fr", "FR");
		
		ResourceBundle res = ResourceBundle.getBundle("resource.ProgramResource", loc);
		
		
		
		JButton translateButton = new JButton(res.getString("Translate To French"));
		JButton b2 = new JButton((String)res.getString("One"));
		JButton b3 = new JButton((String)res.getString("Two"));
		JButton b4 = new JButton((String)res.getString("Three"));
		
		c.add(translateButton);
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
