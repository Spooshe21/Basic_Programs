/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  FactorialCalculator.java
 *   Project:  Factorial Calculation
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

package demo;

import java.util.Scanner;

/**
 * This class calculates the factorial of a given number.
 */
public class Factorial {

	/**
	 * Calculates the factorial of a given number.
	 * 
	 * @param number The number for which factorial is to be calculated.
	 * @return The factorial of the given number.
	 */
	public static int calculateFactorial(int number) {
		int factorial = 1;

		for (int i = 1; i <= number; i++) {
			factorial *= i;
		}

		return factorial;
	}

	/**
	 * The main method to demonstrate the usage of the FactorialCalculator class.
	 * 
	 * @param args The command-line arguments (not used).
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = scanner.nextInt();
		scanner.close();

		int result = calculateFactorial(num);
		System.out.println("The factorial of " + num + " is: " + result);
	}
}
