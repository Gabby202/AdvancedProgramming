
public final class ShapeCalculations {

	public static final double PI = 3.14159265;

	private ShapeCalculations() { }
	
	public static double getVolumeOfCylinder(int r, int h) {

		double volume = PI * (Math.pow(r, 2)) * h;

		return volume;

	}

	public static double getVolumeOfCube(int a) {

		double volume = Math.pow(a, 3);
		return volume;
	}

	public static double getAreaOfSphere(int r) {

		double area = 4 * PI * (Math.pow(r, 2));

		return area;
	}

}
