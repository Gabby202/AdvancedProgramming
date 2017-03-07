import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Revision1 {
	public static void main(String[] args) {
		
		int[] array = new int[4];
		
		try{
			System.out.print(array[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			FileOutputStream fos = null;
			try {
				fos = new FileOutputStream(new File("exception.txt"), true);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}  
			PrintStream ps = new PrintStream(fos);  
			e.printStackTrace(ps);
		}
		
		
	}
}
