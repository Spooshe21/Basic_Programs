/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  SimpleCalculator.java
 *   Project:  Simple Calculator
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

package demo;

import java.util.Scanner;

/**
 * This class implements a simple calculator to perform arithmetic operations.
 */
public class Calculator {

	/**
	 * The main method to perform arithmetic operations based on user input.
	 * 
	 * @param args The command-line arguments (not used).
	 */
	public static void main(String[] args) {
		int operator, n1, n2;

		// Displaying menu for operation selection
		System.out.println("1-ADD\n2-SUBTRACTION\n3-MULTIPLY\n4-DIVISION");
		System.out.println("Choose the operator:");

		Scanner sc = new Scanner(System.in);
		operator = sc.nextInt();

		// Inputting two numbers
		System.out.println("Enter first number:");
		n1 = sc.nextInt();
		System.out.println("Enter second number:");
		n2 = sc.nextInt();

		int result = 0;

		// Performing operation based on selected operator
		switch (operator) {
		case 1:
			result = n1 + n2;
			break;
		case 2:
			result = n1 - n2;
			break;
		case 3:
			result = n1 * n2;
			break;
		case 4:
			if (n2 != 0) {
				result = n1 / n2;
			} else {
				System.out.println("Error: Division by zero!");
			}
			break;
		default:
			System.out.println("Choice is invalid");
		}

		// Displaying the result
		System.out.println("Result of two numbers is: " + result);
	}
}
