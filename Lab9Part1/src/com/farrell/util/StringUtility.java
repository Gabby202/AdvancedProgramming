package com.farrell.util;

/**
 * this class holds methods for calculations
 * @author Gabby class to hod methods
 *
 */
public class StringUtility {
	
	
	/**
	 * method for adding ascii
	 * @param s converts
	 */
	public static void getSumOfAcsiiValues(String s) {
		
		String convert = s;
		int total = 1;
		
		for(int i = 0; i < convert.length(); i++) {
	
			char c = convert.charAt(i);
			total = total + c;

		}
		
		System.out.println(total);
		
	}
	
	/**
	 * method for multimplying ascii
	 * @param s converts string
	 */
	public static void getProductOfAsciiValues(String s) {
		String convert = s;
		int total = 1;
		
		for (int i = 0; i < convert.length(); i++ ) {
			char c = convert.charAt(i);
			total = total * c;
		}
		
		System.out.println(total);
	}
}	
