
public class Revolver implements Gun {

	@Override
	public void getReloadInstructions() {
		System.out.println("Reload Instructions for" + this.getClass().getName());
		System.out.println("Open Chamber");
		System.out.println("Load bullets");
		System.out.println("Close Chamber");

	}

}
