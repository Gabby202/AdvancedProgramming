import java.util.Vector;

public class TestArtists {
	public static void main(String[] args) {
		ArtistVector v = new ArtistVector();
		
		Gorrilaz a1 = new Gorrilaz("Demon Days", 2001);
		Gorrilaz a2 = new Gorrilaz("Plastic Beach", 2002);
		Gorrilaz a3 = new Gorrilaz("The Fall", 2004);
		Gorrilaz a4 = new Gorrilaz("G Sides", 2005);
		Gorrilaz a5 = new Gorrilaz("Gorillaz", 2007);
		RedHotChiliPeppers a6 = new RedHotChiliPeppers("Californication", 1999);
		RedHotChiliPeppers a7 = new RedHotChiliPeppers("By The Way", 2002);
		RedHotChiliPeppers a8 = new RedHotChiliPeppers("Stadium Arcadium", 2005);
		RedHotChiliPeppers a9 = new RedHotChiliPeppers("Im With You", 2009);
		RedHotChiliPeppers a10 = new RedHotChiliPeppers("The Getaway",1998);

		v.addToList(a1, a2, a3, a4,a5, a6, a7, a8, a9, a10);
		
		Vector artistDetails = v.getArtists();
		
		for(int i = 0; i < artistDetails.size(); i++) {
			
			Object currArt = new Object();
			currArt = artistDetails.elementAt(i);
			
			
			System.out.println("\n" + ((MusicArtists) currArt).artistDetails());
			System.out.print("\n" + ((MusicArtists) currArt).getYear());
		}
		
	}
}
