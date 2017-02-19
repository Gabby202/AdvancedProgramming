import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestFourExceptions extends JFrame implements ActionListener {

	JButton button1, button2, button3, button4;

	public TestFourExceptions() {
		Container c = getContentPane();
		c.setLayout(new GridLayout(2, 2));

		button1 = new JButton("Test IO Exception");
		button1.addActionListener(this);
		
		button2 = new JButton("Test URL Exception");
		button2.addActionListener(this);

		button3 = new JButton("Test Null Pointer Exception");
		button3.addActionListener(this);

		button4 = new JButton("Test generic Exception");
		button4.addActionListener(this);

		c.add(button1);
		c.add(button2);
		c.add(button3);
		c.add(button4);

		setVisible(true);
		setSize(500, 300);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			testException("Hi", "Whatever.txt", "http://www.itb.ie", false);
		}
		if (e.getSource() == button2) {
			testException("Hi", "Real.txt", "ht//www.itb.ie", false);
		}
		if (e.getSource() == button3) {
			testException(null, "Real.txt", "http://www.itb.ie", false);
		}
		if (e.getSource() == button4) {
			testException("Hi", "Real.txt", "http://www.itb.ie", true);
		}
	}

	public void testException(String string, String filename, String url, boolean generalExceptionActivated) {
		try {
			string.toCharArray();
			new FileReader(filename);
			new URL(url);
			if (generalExceptionActivated) {
				this.clone();
			}
		} catch (MalformedURLException e) {
			JOptionPane.showMessageDialog(null, "A URL has been badly written " + e.getStackTrace().toString());
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "An IO Exception has been caught" + e.getStackTrace());
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "A Null Pointer Exception has been caught" + e.getStackTrace());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "A generic exception has been caught" + e.getStackTrace());
		} finally {
			System.out.println("The finally block has been called");
		}
	}

	public static void main(String[] args) {
		new TestFourExceptions();
	}
}
