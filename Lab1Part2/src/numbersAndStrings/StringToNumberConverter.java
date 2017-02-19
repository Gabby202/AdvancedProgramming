/**
 * 
 */
package numbersAndStrings;

/**
 * @author Gavi
 *
 */
public class StringToNumberConverter {

	/**
	 * @param s convert string to number
	 * @return s
	 */
	public static int stringToNumber(String s) {
		int num = 0;

		switch (s) {
		case "one":
			num = 1;
			break;
		case "two":
			num = 2;
			break;
		case "three":
			num = 3;
			break;
		}

		return num;
	}
}
