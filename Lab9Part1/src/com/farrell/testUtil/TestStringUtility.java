package com.farrell.testUtil;
import com.farrell.util.*;

/**
 *class to get ascii totals 
 * @author Gabby
 *
 */
public class TestStringUtility {
	
	/**
	 * main method
	 * @param args main method
	 */
	public static void main(String[] args) {
		
		StringUtility u = new StringUtility();
		
		u.getProductOfAsciiValues("hello");
		u.getSumOfAcsiiValues("hello");
		
	}
}
