import java.util.Vector;

public class ArtistVector {

	private Vector artists = new Vector(); 
	
	public ArtistVector () {
		
		artists = new Vector();
	}
	
	public void addToList(Gorrilaz a1, Gorrilaz a2, Gorrilaz a3, Gorrilaz a4,Gorrilaz a5, RedHotChiliPeppers a6,RedHotChiliPeppers a7, RedHotChiliPeppers a8, RedHotChiliPeppers a9, RedHotChiliPeppers a10 ) {
		
		artists.add(a1);
		artists.add(a2);
		artists.add(a3);
		artists.add(a4);
		artists.add(a5);
		artists.add(a6);
		artists.add(a7);
		artists.add(a8);
		artists.add(a9);
		artists.add(a10);

	}
	
	public Vector getArtists () {
		return artists;
	}

	public void addToList(MusicArtists a1, MusicArtists a2, MusicArtists a3, MusicArtists a4, MusicArtists a5,
			MusicArtists a6, MusicArtists a7, MusicArtists a8, MusicArtists a9, MusicArtists a10) {
		// TODO Auto-generated method stub
		
	}
}
