
public class Gorrilaz extends MusicArtists {
	
	private int year;
	
	public Gorrilaz(String album, int year) {
		this.album = album;
		this.year = year;
	}


	@Override
	public String artistDetails() {
		String desc = "Artist Details for" + this.getClass().getName();
		String members = "4 members";
		String formed = "Formed in 2000's";
		
		return desc + "\n" + members + "\n" + formed  + "\n" + album + "\n";
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
}
