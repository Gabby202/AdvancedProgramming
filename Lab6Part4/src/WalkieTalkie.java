
public class WalkieTalkie extends ElectronicDevice{

	private double rangeInKm;
	
	public WalkieTalkie(String manufacturer, double rangeInKm) {
		super(manufacturer);
		
		this.setRangeInKm(rangeInKm);
	}

	public double getRangeInKm() {
		return rangeInKm;
	}

	public void setRangeInKm(double rangeInKm) {
		this.rangeInKm = rangeInKm;
	}

}
