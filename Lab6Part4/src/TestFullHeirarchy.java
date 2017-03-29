import java.util.Vector;

public class TestFullHeirarchy {

	public static void main(String[] args) {

		DevicesVector devices = new DevicesVector();

		Computer computer = new Computer("DELL", 3.0, 8, 22);
		LaptopComputer laptopComputer = new LaptopComputer("Lenovo", 2.6, 4, 16, 8);
		MobilePhone mobilePhone = new MobilePhone("Samsung", "Vodafone");
		WalkieTalkie walkieTalkie = new WalkieTalkie("Timetech", 50);

		devices.addToList(computer, laptopComputer, mobilePhone, walkieTalkie);
		Vector deviceList = devices.getDevices();

		/*	for (int i = 0; i < deviceList.size(); i++) {
			Object currDev = new Object();
			currDev = deviceList.elementAt(i);
			
			System.out.println(
			((ElectronicDevice) currDev).getManufacturer() + " " 
			+ ((Computer) currDev).getSpeed() + "GHZ " 
			+ ((Computer) currDev).getMemory() + "GB " + 
			((Computer) currDev).getSize() + "Inches " 
			);
			}*/
		
		
		System.out.println(((ElectronicDevice) deviceList.elementAt(0)).getManufacturer() + " " + ((Computer) deviceList.elementAt(0)).getSpeed() + " " +
		((Computer) deviceList.elementAt(0)).getMemory() + " " + ((Computer) deviceList.elementAt(0)).getSize());
		
		System.out.println(((ElectronicDevice) deviceList.elementAt(1)).getManufacturer() + " " + ((Computer) deviceList.elementAt(1)).getSpeed() + " " +
		((Computer) deviceList.elementAt(1)).getMemory() + " " + ((Computer) deviceList.elementAt(1)).getSize());
		
		System.out.println(((MobilePhone) deviceList.elementAt(2)).getNetworkName() + " " + ((ElectronicDevice) deviceList.elementAt(2)).getManufacturer());
		
		System.out.println(((ElectronicDevice) deviceList.elementAt(3)).getManufacturer() + " " + ((WalkieTalkie) deviceList.elementAt(3)).getRangeInKm());
			
		System.out.println("My little test " + deviceList.elementAt(0));
	}



}
