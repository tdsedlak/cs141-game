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
		char RADAR = 'G';
		char SUITCASE = 'S';
		
		initializeBoard(EMPTY);
		initializeRooms(ROOM);
		initializeBriefcase(SUITCASE);
		initializePowerUps(INVIN, BULLET, RADAR);
		initializePlayerPosition(PLAYER);
		
	}
	
	private void initializeBoard(char EMPTY) {
		for (int i = 0; i < boardArray.length; i++){
			for (int j = 0; j < boardArray[i].length; j++){
				boardArray[i][j] = EMPTY;
			}
		}
	
	}
	public char[][] giveBoard() {
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
	public void initializeRooms(char ROOM) {
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
	
	private void initializeBriefcase(char SUITCASE) {
		int chooseRoom = rand.nextInt(9);
		
		switch (chooseRoom) {
		case 0:
			boardArray [1][1] = SUITCASE;
			break;
		case 1:
			boardArray [1][4] = SUITCASE;
			break;
		case 2:
			boardArray [1][7] = SUITCASE;
			break;
		case 3:
			boardArray [4][1] = SUITCASE;
			break;
		case 4:
			boardArray [4][4] = SUITCASE;
			break;
		case 5:
			boardArray [4][7] = SUITCASE;
			break;
		case 6:
			boardArray [7][1] = SUITCASE;
			break;
		case 7:
			boardArray [7][4] = SUITCASE;
			break;
		case 8:
			boardArray [7][7] = SUITCASE;
			break;
		}
		
	}
	
	public void initializePowerUps(char INVIN, char BULLET, char RADAR){
		boolean isInvinEmpty = true;
		boolean isBulletEmpty = true;
		boolean isRadarEmpty = true;
		int row = rand.nextInt(9);
		int col = rand.nextInt(9);
		
		while(isInvinEmpty)
		{
			if(boardArray[row][col] == ' ') {
			boardArray[row][col] = INVIN;
			isInvinEmpty = false;
			}
			else{
				row = rand.nextInt(9);
				col = rand.nextInt(9);
			}
		}
		
		while(isBulletEmpty)
		{
			if(boardArray[row][col] == ' ') {
			boardArray[row][col] = BULLET;
			isBulletEmpty = false;
			}
			else{
				row = rand.nextInt(9);
				col = rand.nextInt(9);
			}
		}
		
		while(isRadarEmpty)
		{
			if(boardArray[row][col] == ' ') {
			boardArray[row][col] = RADAR;
			isRadarEmpty = false;
			}
			else{
				row = rand.nextInt(9);
				col = rand.nextInt(9);
			}
		}
		
	}
	
	public void initializePlayerPosition(char PLAYER) {
			boardArray[0][8] = PLAYER;	
	}
	
}
