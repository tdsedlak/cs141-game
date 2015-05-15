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

import java.util.Random;

/**
 *
 */
public class Board {
	Random rand = new Random();
	
	private char boardArray[][] = new char[9][9];
	/**
	 * 
	 */
	public Board() {
		char EMPTY = ' ';
		char ROOM = 'R';
		char PLAYER = 'P';
		char ENEMY = 'E';
		char INVIN = 'I';
		char BULLET = 'B';
		char RADAR = 'R';
		char SUITCASE = 'S';
		
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
		
		int CaseX = rand.nextInt(3) * 3 + 1;
		int CaseY = rand.nextInt(3) * 3 + 1;
		boardArray [CaseX][CaseY] = SUITCASE;
		
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
