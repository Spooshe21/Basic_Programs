/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  EmployeeDetails.java
 *   Project:  Employee Management System
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

/**
 * This class represents an Employee with name, salary, and address.
 */
package demo;

public class Employee {

	// Global variables
	static String employeeName;
	static float employeeSalary;
	static String employeeAddress;

	/**
	 * Sets the details of the employee.
	 * 
	 * @param name    The name of the employee.
	 * @param salary  The salary of the employee.
	 * @param address The address of the employee.
	 */
	static void set(String name, float salary, String address) {
		employeeName = name;
		employeeSalary = salary;
		employeeAddress = address;
	}

	/**
	 * Retrieves and prints the details of the employee.
	 */
	static void get() {
		System.out.println("Employee name is: " + employeeName); // Print the employee name
		System.out.println("Employee CTC is: " + employeeSalary); // Print the employee salary
		System.out.println("Employee address is: " + employeeAddress); // Print the employee address
	}

	/**
	 * The main method to demonstrate the Employee class functionality.
	 * 
	 * @param args The command-line arguments.
	 */
	public static void main(String args[]) {
		// Set the details of an employee
		Employee.set("Spoorthi Shetty", 35000.0f, "jp-nagar");

		// Retrieve and print the details of the employee
		Employee.get();
	}
}
