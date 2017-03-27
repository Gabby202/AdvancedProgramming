
public class SemiAutomatic implements Gun{

	@Override
	public void getReloadInstructions() {

		System.out.println("Reload Instructions for" + this.getClass().getName());
		System.out.println("Eject magazine");
		System.out.println("Loat bullets into magazine");
		System.out.println("Insert magazine");
		System.out.println("Pull slide back");


	}

}
