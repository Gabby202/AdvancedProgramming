
public class LaptopComputer extends Computer {

	private int batteryLife;
	
	public LaptopComputer (String manufacturer, double speed, int memory, int size, int batteryLife) {
		super(manufacturer, speed, memory, size);
		
		this.batteryLife = batteryLife;
		
	}

	public int getBatteryLife() {
		return batteryLife;
	}

	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}

}
