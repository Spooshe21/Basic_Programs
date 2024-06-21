/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Operations.java
 *   Project:  Java Basic Operations
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

/**
 * This class demonstrates basic arithmetic operations on two integers.
 */
package demo;
public class Operations {

	/**
	 * The main method demonstrates basic arithmetic operations.
	 * @param args The command-line arguments.
	 */
	public static void main(String[] args) {
		int a = 7; // Initialize variable a with value 7
		int b = 9; // Initialize variable b with value 9

		// Print the sum of a and b
		System.out.println("Sum: " + (a + b));

		// Print the difference of a and b
		System.out.println("Difference: " + (a - b));

		// Print the product of a and b
		System.out.println("Product: " + (a * b));

		// Print the quotient of a and b
		System.out.println("Quotient: " + (a / b));
	}
}

