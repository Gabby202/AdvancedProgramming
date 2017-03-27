
public  class Computer extends ElectronicDevice{

	private double speed;
	private int memory;
	private int size;
	
	private String attribute;
	
	public  Computer (String manufacturer, double speed, int memory, int size) {
		super(manufacturer);

		this.setSpeed(speed);
		this.setMemory(memory);
		this.setSize(size);
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	

	

}
