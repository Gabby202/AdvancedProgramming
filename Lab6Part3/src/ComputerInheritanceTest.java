
public class ComputerInheritanceTest {

	public static void main(String[] args) {
		Computer c1 = new Computer(2.2, 8, 22);
		Computer c2 = new Computer(1.2, 4, 18);
		LaptopComputer c3 = new LaptopComputer(4.0, 16, 26, 12);
		LaptopComputer c4 = new LaptopComputer(5.0, 4, 12, 10);
		
		System.out.println(c1.getSpeed() + "GHZ " + c1.getMemory() + "GB " + c1.getSize() + " Inches " );
		System.out.println(c2.getSpeed() + "GHZ " + c2.getMemory() + "GB " + c2.getSize() + " Inches " );
		
		System.out.println(c3.getSpeed() + "GHZ " + c3.getMemory() + "GB " + c3.getSize() + " Inches " + c3.getBatteryLife() + " Hours");
		System.out.println(c4.getSpeed() + "GHZ " + c4.getMemory() + "GB " + c4.getSize() + " Inches " + c4.getBatteryLife() + " Hours");
		
	}
		


	
	

}
