/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  NumberSumAverage.java
 *   Project:  Number Sum and Average Calculator
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

package demo;

/**
 * This class calculates the sum and average of elements in an integer array.
 */
public class NumberSumAverage {

	/**
	 * Calculates the sum and average of elements in the given integer array.
	 * 
	 * @param array The array of integers whose sum and average are to be calculated.
	 */
	public static void calculateSumAndAverage(int[] array) {
		int length = array.length;
		int sum = 0;

		// Calculate sum of elements
		for (int i = 0; i < length; i++) {
			sum += array[i];
		}

		// Calculate average
		float average = (float) sum / length;

		// Display sum and average
		System.out.println("The sum of elements is: " + sum);
		System.out.println("The average of elements is: " + average);
	}

	/**
	 * The main method to demonstrate the usage of the NumberSumAverage class.
	 * 
	 * @param args The command-line arguments (not used).
	 */
	public static void main(String[] args) {
		int[] array = {16, 2, 33, 49, 51, 6};
		calculateSumAndAverage(array);
	}
}


