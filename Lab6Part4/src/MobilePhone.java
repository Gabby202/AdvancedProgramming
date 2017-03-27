
public class MobilePhone extends ElectronicDevice{

	private String networkName;
	
	public MobilePhone(String manufacturer, String networkName) {
		super(manufacturer);
		this.setNetworkName(networkName);
	}

	public String getNetworkName() {
		return networkName;
	}

	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}

}
