/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  Sample program to demonstrate if else if  
 *   Project:  If_Else_If.java
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:      Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *             Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/ 

package demo;

import java.util.Scanner;

/**
 * Class New
 * This class is used to demonstrate a simple if-else statement in Java
 */
public class If_Else_If {

	/**
	 * The main method is the entry point of the program.
	 * It prompts the user to enter a number between 1-4 and prints the corresponding message.
	 * 
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scanner object for user input

		System.out.println("Enter a number between 1-4"); // Prompt user for input

		int number = scanner.nextInt(); // Read the integer input from the user

		// Check the number and print the corresponding message
		if (number == 1) {
			System.out.println("Entered number is 1");
		} else if (number == 2) {
			System.out.println("Entered number is 2");
		} else if (number == 3) {
			System.out.println("Entered number is 3");
		} else if (number == 4) {
			System.out.println("Entered number is 4");
		} else {
			System.out.println("Entered number is not between 1-4");
		}

		scanner.close(); // Close the scanner object
	}
}
