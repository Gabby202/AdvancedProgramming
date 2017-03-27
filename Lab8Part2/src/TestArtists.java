import java.util.Vector;

public class TestArtists {
	public static void main(String[] args) {
		ArtistVector v = new ArtistVector();
		
		Gorrilaz a1 = new Gorrilaz("Demon Days");
		Gorrilaz a2 = new Gorrilaz("Plastic Beach");
		Gorrilaz a3 = new Gorrilaz("The Fall");
		Gorrilaz a4 = new Gorrilaz("G Sides");
		Gorrilaz a5 = new Gorrilaz("Gorillaz");
		RedHotChiliPeppers a6 = new RedHotChiliPeppers("Californication");
		RedHotChiliPeppers a7 = new RedHotChiliPeppers("By The Way");
		RedHotChiliPeppers a8 = new RedHotChiliPeppers("Stadium Arcadium");
		RedHotChiliPeppers a9 = new RedHotChiliPeppers("Im With You");
		RedHotChiliPeppers a10 = new RedHotChiliPeppers("The Getaway");

		v.addToList(a1, a2, a3, a4,a5, a6, a7, a8, a9, a10);
		
		Vector artistDetails = v.getArtists();
		
		for(int i = 0; i < artistDetails.size(); i++) {
			
			Object currArt = new Object();
			currArt = artistDetails.elementAt(i);
			
			
			System.out.println(((MusicArtists) currArt).artistDetails());
		}
		
	}
}
