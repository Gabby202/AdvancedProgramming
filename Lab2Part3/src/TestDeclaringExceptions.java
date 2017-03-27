import java.io.File;
import java.io.IOException;

public class TestDeclaringExceptions {

	public static void main(String[] args) {
		String s = "Hello";
		reverseString(null);
		
		//this method required a try/catch because IOException is
		//a "checked" exception.
		try {
			openFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static String reverseString(String s) throws NullPointerException {

		s = new StringBuffer(s).reverse().toString();
		return s;
	}

	public static void openFile() throws IOException {

		File file = new File("doccuments/file.txt");
		file.exists();

	}

}
