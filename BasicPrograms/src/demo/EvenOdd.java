/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  EvenOddChecker.java file
 *   Project:  Number Classification
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

package demo;

import java.util.Scanner;

/**
 * This class checks whether a given number is even or odd.
 */
public class EvenOdd {

	/**
	 * Main method to take user input and check whether the number is even or odd.
	 * 
	 * @param args The command-line arguments (not used).
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		sc.close(); // Close the scanner to prevent resource leak

		// Check if the number is even or odd
		if (isEven(num)) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
	}

	/**
	 * Method to check whether a given number is even.
	 * 
	 * @param num The number to be checked.
	 * @return True if the number is even, false otherwise.
	 */
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
}
