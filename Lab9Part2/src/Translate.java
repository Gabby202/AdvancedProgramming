import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Translate extends JFrame implements ActionListener{

	JButton button1, button2, button3;
	Locale loc1, loc2, loc3;
	JLabel label;
	 public Translate() {
		 Container c = getContentPane();
		 
		 
		 JPanel main = new JPanel();
		 
		
		 JPanel buttons = new JPanel();
		 buttons.setLayout(new GridLayout(1,3));
		 
		 button1 = new JButton("French");
		 button1.addActionListener(this);
		 button2 = new JButton("German");
		 button2.addActionListener(this);
		 button3 = new JButton("Spanish");
		 button3.addActionListener(this);
		 
		loc1 = new Locale("fr", "FR");
		loc2 = new Locale("de", "DE");
		loc3 = new Locale("sp", "SP");
		
		//ResourceBundle res = ResourceBundle.getBundle("resource.ProgramResource", loc1);
		 
		label = new JLabel("Hello");
		 
		 main.add(label);
		 
		 
		 buttons.add(button1);
		 buttons.add(button2);
		 buttons.add(button3);

		 c.add(main, BorderLayout.CENTER);
		 c.add(buttons, BorderLayout.SOUTH);
		 
		 setSize(300, 100);
		 setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button1) {
			ResourceBundle res = ResourceBundle.getBundle("resource.ProgramResource", loc1);
			label.setText(res.getString("Hello"));
			button1.setText(res.getString("French"));
			button2.setText(res.getString("German"));
			button3.setText(res.getString("Spanish"));
		}
		
		if(e.getSource() == button2) {
			ResourceBundle res = ResourceBundle.getBundle("resource.ProgramResource", loc2);
			label.setText(res.getString("Hello"));
			button1.setText(res.getString("French"));
			button2.setText(res.getString("German"));
			button3.setText(res.getString("Spanish"));
		}
		
		if(e.getSource() == button3) {
			ResourceBundle res = ResourceBundle.getBundle("resource.ProgramResource", loc3);
			label.setText(res.getString("Hello"));
			button1.setText(res.getString("French"));
			button2.setText(res.getString("German"));
			button3.setText(res.getString("Spanish"));
		}
	}
	
	public static void main(String[] args) {
		new Translate();
	}

}
