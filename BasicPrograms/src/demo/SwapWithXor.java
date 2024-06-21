/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  SwapValues.java
 *   Project:  Java Programming Exercises
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/
package demo;

/**
 * This class demonstrates swapping two integer values using XOR operator.
 */
public class SwapWithXor {

	/**
	 * Swaps the values of two integers using XOR operator.
	 * 
	 * @param a The first integer.
	 * @param b The second integer.
	 */
	public static void swapValuesUsingXOR(int a, int b) {
		// Logic to swap values using XOR operator
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("After swapping:");
		System.out.println("Value of a: " + a);
		System.out.println("Value of b: " + b);
	}

	/**
	 * The main method to demonstrate swapping values using XOR operator.
	 * 
	 * @param args The command-line arguments (not used).
	 */
	public static void main(String[] args) {
		int m = 8, n = 2;

		// Display the original values
		System.out.println("Before swapping:");
		System.out.println("Value of m: " + m);
		System.out.println("Value of n: " + n);

		// Call the method to swap values
		swapValuesUsingXOR(m, n);
	}
}

