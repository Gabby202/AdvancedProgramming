import javax.swing.Icon;

public  class  FavouriteAnimal extends AlbumItem{
	
	private String image;
	private String noise;
	private String legs;
	private String type;

	public FavouriteAnimal(String image, String noise, String legs, String type) {
		this.image = image;
		this.noise = noise;
		this.legs = legs; 
		this.type = type;
	}

	@Override
	public String getImage() {
		return image;
	}

	@Override
	public String getFacts() {
		return noise + "\n" +  legs + "\n" + type;
	}
	
	
	






	
	
	
	
}
