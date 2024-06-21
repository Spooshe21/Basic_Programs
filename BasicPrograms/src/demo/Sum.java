/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Sum.java file
 *   Project:  Adding
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

package demo;

public class Sum {

	/**
	 * This method add the sum of two integers.
	 *
	 * @param a the first integer
	 * @param b the second integer
	 * @return the sum of a and b
	 */
	public static int addSum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		int num1 = 18;
		int num2 = 9;
		int result = addSum(num1, num2);
		System.out.println("Addition of numbers: " + result);
	}

}
