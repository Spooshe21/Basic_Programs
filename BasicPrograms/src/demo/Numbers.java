/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  SwapNumbers.java file
 *   Project:  Number Swapping Utility
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

package demo;

/**
 * This class provides functionality to swap two numbers using a third variable.
 */
public class Numbers {

	/**
	 * Swaps the values of two numbers using a temporary variable.
	 * 
	 * @param a The first number.
	 * @param b The second number.
	 */
	public static void swapUsingTempVariable(int a, int b) {
		// Swapping the values using a temporary variable
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping:");
		System.out.println("Value of a: " + a);
		System.out.println("Value of b: " + b);
	}

	/**
	 * The main method to demonstrate the functionality of swapping numbers.
	 * 
	 * @param args The command-line arguments (not used).
	 */
	public static void main(String[] args) {
		// Initial values of the numbers to be swapped
		int num1 = 9, num2 = 5;
		System.out.println("Before swapping:");
		System.out.println("Value of num1: " + num1);
		System.out.println("Value of num2: " + num2);

		// Calling the swap method
		swapUsingTempVariable(num1, num2);
	}
}
