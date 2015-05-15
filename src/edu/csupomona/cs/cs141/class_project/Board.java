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
	private char boardArray[][] = new char[9][9];
	/**
	 * 
	 */
	public Board() {
		char EMPTY = ' ';
		char ROOM = 'R';
		
		for (int i = 0; i < boardArray.length; i++){
			for (int j = 0; j < boardArray[i].length; j++){
				boardArray[i][j] = EMPTY;
			}
		}
		
		boardArray [1][1] = ROOM;
		boardArray [1][4] = ROOM;
		boardArray [1][7] = ROOM;
		boardArray [4][1] = ROOM;
		boardArray [4][4] = ROOM;
		boardArray [4][7] = ROOM;
		boardArray [7][1] = ROOM;
		boardArray [7][4] = ROOM;
		boardArray [7][7] = ROOM;
		
		
	}
	public char[][] GiveBoard() {
		return boardArray;
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
