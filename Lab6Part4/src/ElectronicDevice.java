
public class ElectronicDevice {

	private String manufacturer;
	
	public ElectronicDevice(String manufacturer) {
		this.setManufacturer(manufacturer);
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String toString() {
		return manufacturer;
	}

}
