
public class TryCatchFinally {

	public static void main(String[] args) {

		try {
			String s = "H";
			Integer.parseInt(s);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Gabby");
		}
	}

}
