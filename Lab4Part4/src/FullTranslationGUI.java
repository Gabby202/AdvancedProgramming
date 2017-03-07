import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class FullTranslationGUI extends JFrame implements ActionListener{
	
	JComboBox<String> combo;
	String[] langs = {"English", "French"};
	JButton button;
	
	public FullTranslationGUI() {
		Container c = getContentPane();
		
		ResourceBundle res = null;
		
		Locale loc = new Locale("fr", "FR");
		res = res.getBundle("ProgramProperties_fr", loc);
		
		JPanel panel = new JPanel();
		combo = new JComboBox<String>(langs);
		combo.addActionListener(this);
		button = new JButton("List All Locales");
		button.addActionListener(this);
		JTextArea ta = new JTextArea();
		
		panel.add(combo);
		panel.add(button);
		c.add(panel, BorderLayout.NORTH);
		c.add(ta, BorderLayout.CENTER);
		
		setSize(300, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new FullTranslationGUI();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}
}
