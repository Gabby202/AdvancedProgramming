import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StopTheLights extends JFrame implements ActionListener {

	JButton start, stop;
	boolean startButton = false;

	public StopTheLights() {

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
		Thread lights = new Thread(new LightThreads());
		if (e.getSource() == start) {

			lights.start();
		}

		if (e.getSource() == stop) {
			lights.interrupt();
		}
	}

	public static void main(String[] args) {

		new StopTheLights();

	}

}// end

class LightThreads implements Runnable {

	public LightThreads() {

	}

	public void run() {
		
			System.out.println("Green Light");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			
			System.out.println("Amber Light");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			
			System.out.println("Red Light");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

	}// end run

}// end LightThreads class
