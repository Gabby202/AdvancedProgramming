
public class LaptopComputer extends Computer {

	private int batteryLife;
	
	public LaptopComputer (double speed, int memory, int size, int batteryLife) {
		super(speed, memory, size);
	
		this.batteryLife = batteryLife;
		
	}

	public int getBatteryLife() {
		return batteryLife;
	}

	public void setBatteryLife(int batteryLife) {
		this.batteryLife = batteryLife;
	}

}
