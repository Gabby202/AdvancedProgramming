import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Backup extends JFrame implements ActionListener, Runnable {

	JButton start, stop;
	boolean showGreen;

	public Backup() {

		Container c = getContentPane();

		JPanel panelLeft = new JPanel();
		JPanel panelRight = new JPanel();

		start = new JButton("Start");
		start.addActionListener(this);
		stop = new JButton("Stop");
		stop.addActionListener(this);

		panelLeft.add(start);
		panelLeft.add(stop);

		c.add(panelLeft, BorderLayout.WEST);
		c.add(panelRight, BorderLayout.CENTER);

		setVisible(true);
		setSize(300, 300);
	}

	// paint
	public void paint(Graphics g) {
		super.paint(g);

		green(g);
		amber(g);
		red(g);
	}

	// paint green light
	public void green(Graphics g) {
	
			g.setColor(Color.GREEN);
			g.fillOval(200, 50, 50, 50);

	
	}

	// paint amber light
	public void amber(Graphics g) {

		g.setColor(Color.ORANGE);
		g.fillOval(200, 120, 50, 50);

	}

	// paint red light
	public void red(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(200, 190, 50, 50);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == start) {
			Thread greenLight = new Thread(new Runnable() {
				public void run() {
					System.out.println("Green Light");
				}
			});

			Thread amberLight = new Thread(new Runnable() {
				public void run() {

				}
			});

			Thread redLight = new Thread(new Runnable() {
				public void run() {

				}
			});

			System.out.println("The Lights are On");
		}

		if (e.getSource() == stop) {

		}
	}

	public static void main(String[] args) {
		new Backup();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}

