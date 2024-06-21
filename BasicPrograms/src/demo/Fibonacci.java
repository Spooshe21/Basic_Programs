/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  FibonacciSeries.java file
 *   Project:  Fibonacci Series Generator
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

package demo;

/**
 * This class generates the Fibonacci series up to a specified limit.
 */
public class Fibonacci {

    /**
     * Generates and prints the Fibonacci series up to a specified limit.
     * 
     * @param limit The upper limit up to which the Fibonacci series is generated.
     */
    public static void generateFibonacciSeries(int limit) {
        int firstNum = 0, secondNum = 1;
        int nextNum;

        System.out.println("Fibonacci series up to " + limit + ":");

        for (int i = 0; i <= limit; i++) {
            System.out.print(firstNum + ", ");

            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }

    /**
     * The main method to demonstrate the usage of the FibonacciSeries class.
     * 
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        int limit = 15;
        generateFibonacciSeries(limit);
    }
}
