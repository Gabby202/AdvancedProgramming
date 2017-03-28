public  class  FavouriteSport extends AlbumItem{
	
	private String image;
	private String score;
	private String players;
	private String ball;

	public FavouriteSport(String image, String score, String players, String ball) {
		this.image = image;
		this.score = score;
		this.players = players; 
		this.ball = ball;
	}

	@Override
	public String getImage() {
		return image;
	}

	@Override
	public String getFacts() {
		return score + "\n" +  players + "\n" + ball;
	}
	
	
	






	
	
	
	
}
