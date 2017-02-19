/**
 * 
 */
package mathematics;

/**
 * @author Gavi
 *
 */
public class MathHelper {

	/**
	 * @param x multiply y times 
	 * @param y power of
	 * @return num
	 */
	public static int toThePowerOf(int x, int y){
		int num = x;
		int counter = 0;
		
		while(counter < y-1){
			num = (num*x);
			counter++;
		}
		
		
		return num;
	}
}
