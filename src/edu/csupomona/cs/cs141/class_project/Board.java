/**
 * CS 141: Introduction to Programming and Problem Solving
 * Professor: Edwin Rodr&iacute;guez
 *
 * Programming Game Assignment
 *
 * <Ninja Assassin Game. Collect the document and escape the
 * building before getting caught to win.>
 *
 * Team SyntaxErrors
 *   <Shane Avila, Celine Castillo, Andrew Russo, Tom Sedlak>
 */
package edu.csupomona.cs.cs141.class_project;

/**
 *
 */
public class Board {
	private char board[][] = new char[9][9];
	/**
	 * 
	 */
	public Board() {
		final char EMPTY = '*';
		final char ROOM = 'R';
		
		for (int i = 0; i < board.length; i++){
			for (int j = 0; j < board[i].length; j++){
				board[i][j] = EMPTY;
			}
		}
		
		board [1][1] = ROOM;
		board [1][4] = ROOM;
		board [1][7] = ROOM;
		board [4][1] = ROOM;
		board [4][4] = ROOM;
		board [4][7] = ROOM;
		board [7][1] = ROOM;
		board [7][4] = ROOM;
		board [7][7] = ROOM;
		
		for (int i = 0; i < board.length; i++){
			for (int j = 0; j < board[i].length; j++){
				System.out.printf("%-3S","[" + board[i][j] + "]");
			}
			System.out.println();
		}
		
		
	}
	/**
	 * 
	 */
	public void initializeSafeZone() {
		
	}
	/**
	 * 
	 */
	public void initializeRooms() {
		
	}
	/**
	 * 
	 */
	public boolean briefcase() {
		return false;
		
	}
	
}
