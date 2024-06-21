/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  LeapYearChecker.java
 *   Project:  Leap Year Checker
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

package demo;

import java.util.Scanner;

/**
 * This class checks whether a given year is a leap year or not.
 */
public class Leap {

	/**
	 * This method checks whether the given year is a leap year or not.
	 * 
	 * @param year The year to be checked for leap year.
	 * @return true if the given year is a leap year, otherwise false.
	 */
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * The main method to interact with the user and check if the entered year is a
	 * leap year.
	 * 
	 * @param args The command-line arguments (not used).
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = scan.nextInt();

		if (isLeapYear(year)) {
			System.out.println("The given year is a leap year.");
		} else {
			System.out.println("The given year is not a leap year.");
		}

		scan.close(); // Closing scanner to prevent resource leak
	}
}
