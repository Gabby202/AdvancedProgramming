import java.io.IOException;

public class NestedTryCatch {

	public static void main(String[] args) {
		String[] s = new String[4];

		try {
			System.out.println(s[5]);
		} catch (IndexOutOfBoundsException e) {
			try {
				System.out.println("caught oob");
				throw new IOException();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
	}

}
