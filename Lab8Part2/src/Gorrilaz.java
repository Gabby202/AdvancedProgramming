
public class Gorrilaz extends MusicArtists {
	
	public Gorrilaz(String album) {
		this.album = album;
	}


	@Override
	public String artistDetails() {
		String desc = "Artist Details for" + this.getClass().getName();
		String members = "4 members";
		String formed = "Formed in 2000's";
		
		return desc + "\n" + members + "\n" + formed;
	}
}
