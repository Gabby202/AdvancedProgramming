
public class GunTester {

	public static void main(String[] args) {
		Gun revolver = new Revolver();
		Gun semiAutomatic = new SemiAutomatic();
		Gun cannon = new Cannon();

		revolver.getReloadInstructions();
		semiAutomatic.getReloadInstructions();
		cannon.getReloadInstructions();
	}
}
