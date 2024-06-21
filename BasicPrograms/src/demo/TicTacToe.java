/********************************************************************************************
 *   COPYRIGHT (C) 2024 CREVAVI TECHNOLOGIES PVT LTD
 *   The reproduction, transmission or use of this document/file or its
 *   contents is not permitted without written authorization.
 *   Offenders will be liable for damages. All rights reserved.
 *---------------------------------------------------------------------------
 *   Purpose:  TicTacToe.java
 *   Project:  Tic-Tac-Toe Game
 *   Platform: Cross-platform (Windows, macOS, Linux)
 *   Compiler: JDK-22
 *   IDE:  	   Eclipse IDE for Enterprise Java and Web Developers (includes Incubating components)
 *	           Version: 2024-03 (4.31.0)
 *             Build id: 20240307-1437
 ********************************************************************************************/

/**
 * This class represents a Tic-Tac-Toe game board and provides methods for printing the board.
 */
package demo;
public class TicTacToe {

	/**
	 * The main method creates a Tic-Tac-Toe game board and prints it.
	 * @param args The command-line arguments.
	 */
	public static void main(String[] args) {
		char[][] gameBoard = {
				{' ', '|', ' ', '|', ' '},
				{'-', '|', '-', '|', '-'},
				{' ', '|', ' ', '|', ' '},
				{'-', '|', '-', '|', '-'},
				{' ', '|', ' ', '|', ' '}
		};
		printBoard(gameBoard);
	}

	/**
	 * Prints the Tic-Tac-Toe game board.
	 * @param gameBoard The 2D array representing the game board.
	 */
	static void printBoard(char[][] gameBoard) {
		for (int r = 0; r < gameBoard.length; r++) {
			for (int c = 0; c < gameBoard[0].length; c++) {
				System.out.print(gameBoard[r][c]);
			}
		}
		System.out.println();
	}
}
