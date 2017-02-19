
public class TestMultipleCatches {

	public static void main(String[] args) {

		try {
			int array[] = {1, 2, 3, 4};
			System.out.print(array[4]);
			
			String s = null;
			System.out.println(s.length());

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The array is out of bounds");
		} catch(NullPointerException e){
			System.out.println("Null Pointer");			
		} catch(Exception e){
			System.out.println("Generic Exception");
		} finally{
			
		}
	}

}
