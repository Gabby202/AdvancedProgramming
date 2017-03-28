
public class RedHotChiliPeppers extends MusicArtists {
	
	public RedHotChiliPeppers(String album) {
		this.album = album;
	}


	@Override
	public String artistDetails() {
		String desc = "Artist Details for" + this.getClass().getName();
		String members = "4 members";
		String formed = "Formed in 1980's";
		
		return desc + "\n" + members + "\n" + formed  + "\n" + album + "\n";
	}
}
