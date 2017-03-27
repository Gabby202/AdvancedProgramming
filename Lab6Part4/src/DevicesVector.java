import java.util.Vector;

public class DevicesVector {

	private Vector devices = new Vector(); 
	
	public DevicesVector () {
		
		devices = new Vector();
	}
	
	public void addToList(Computer computer, LaptopComputer laptopComputer, MobilePhone mobilePhone, WalkieTalkie walkieTalkie) {
		devices.add(computer);
		devices.add(laptopComputer);
		devices.add(mobilePhone);
		devices.add(walkieTalkie);

	}
	
	public Vector getDevices () {
		return devices;
	}
}
