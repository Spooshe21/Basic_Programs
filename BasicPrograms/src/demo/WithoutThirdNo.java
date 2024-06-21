/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  SwapNumbers.java file
 *   Project:  Number Swapping Without Third Variable
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

package demo;

/**
 * This class provides a method to swap the values of two numbers without using a third variable.
 */
public class WithoutThirdNo{

	/**
	 * Swaps the values of two numbers without using a third variable.
	 * 
	 * @param m The first number.
	 * @param n The second number.
	 */
	static void swapValuesWithoutUsingThirdVariable(int m, int n) {
		// Steps to swap the values without using a third variable
		m = m + n; // Sum of m and n is stored in m
		n = m - n; // Difference of m and n (new m - original n) is stored in n
		m = m - n; // Difference of new m (original m + original n) and new n (original m) is stored in m

		// Print the swapped values
		System.out.println("Value of m is " + m + " and Value of n is " + n);
	}

	/**
	 * Main method to demonstrate swapping of numbers without using a third variable.
	 * 
	 * @param args The command-line arguments (not used).
	 */
	public static void main(String[] args) {
		// Sample numbers to swap
		int m = 10, n = 12;

		// Call the method to swap values without using a third variable
		swapValuesWithoutUsingThirdVariable(m, n);
	}
}

