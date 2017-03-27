
public class Cannon implements Gun{

	@Override
	public void getReloadInstructions() {
		System.out.println("Reload Instructions for" + this.getClass().getName());
		System.out.println("Place wadding into cannon");
		System.out.println("Load cannon ball");

	}
}
