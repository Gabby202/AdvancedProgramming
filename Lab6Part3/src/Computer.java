
public  class Computer {

	private double speed;
	private int memory;
	private int size;
	
	public  Computer (double speed, int memory, int size) {
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
