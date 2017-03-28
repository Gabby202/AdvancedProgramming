import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyAlbum extends JFrame implements ActionListener{

	JButton next;
	Vector<Object> v;
	JLabel image;
	JTextArea ta;
	int counter = 0;
	
	public MyAlbum() {
		Container c = getContentPane();
		
		JPanel panel = new JPanel();
		JPanel panelContent = new JPanel();
		panelContent.setLayout(new GridLayout(2,1));
		
		panel.setLayout(new BorderLayout());
		next = new JButton("Next");
		next.addActionListener(this);

		
		v = new Vector<>();
		
		
		AlbumItem cat = new FavouriteAnimal("images/cat.jpg", "Meow", "4 Legs", "Mammal");
		AlbumItem dog = new FavouriteAnimal("images/dog.jpg", "Woof", "4 Legs", "Mammal");
		AlbumItem bird = new FavouriteAnimal("images/bird.jpg", "Tweet", "2 Legs", "Oviparous");
		AlbumItem horse = new FavouriteAnimal("images/horse.jpg", "Neigh", "4 Legs", "Mammal");
		AlbumItem fox = new FavouriteAnimal("images/fox.jpg", "Nya", "4 Legs", "Mammal");
		AlbumItem pig = new FavouriteAnimal("images/pig.jpg", "Oink", "4 Legs", "Mammal");
		
		AlbumItem football = new FavouriteSport("images/football.png", "Goal", "11players", "medium round ball");
		AlbumItem tennis = new FavouriteSport("images/tennis.jpg", "point", "2 playes", "small green ball");
		AlbumItem golf = new FavouriteSport("images/golf.jpg", "hole", "2 playes", "small white ball");
		AlbumItem rugby = new FavouriteSport("images/rugby.jpg", "try", "10", "egg ball");
		AlbumItem hockey = new FavouriteSport("images/hockey.jpg", "point", "10 players", "small flat ball");
		AlbumItem basketball = new FavouriteSport("images/basketball.png", "point", "10 players", "medium round ball");


		v.addElement(cat);
		v.addElement(dog);
		v.addElement(bird);
		v.addElement(horse);
		v.addElement(fox);
		v.addElement(pig);
		
		v.addElement(football);
		v.addElement(tennis);
		v.addElement(golf);
		v.addElement(rugby);
		v.addElement(hockey);
		v.addElement(basketball);
		
		image = new JLabel((new ImageIcon(((FavouriteAnimal) v.elementAt(0)).getImage())));
		ta = new JTextArea(((FavouriteAnimal) v.elementAt(0)).getFacts());

		panelContent.add(image);
		panelContent.add(ta);

		panel.add(panelContent, BorderLayout.CENTER);
		panel.add(next, BorderLayout.SOUTH);
		c.add(panel);
		setSize(300, 300);
		setVisible(true);	
	}
	
	
	
	public static void main(String[] args) {
		new MyAlbum();

		

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == next && counter < v.size() - 1) {
			
			counter++;
			image.setIcon(new ImageIcon(((AlbumItem) v.elementAt(counter)).getImage()));
			ta.setText(((AlbumItem) v.elementAt(counter)).getFacts());
			
		}
	}

}
