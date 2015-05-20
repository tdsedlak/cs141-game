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
	private char boardRulesArray[][] = new char [9][9];
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
		char ZONE = 'Z';
		
		initializeBoard(EMPTY);
		initializeBoardRules(EMPTY, ROOM, ZONE);
		initializeBothArrayRooms(ROOM);
		initializeBriefcase(SUITCASE);
		initializePowerUps(EMPTY, INVIN, BULLET, RADAR);
		initializePlayerPosition(PLAYER);
		initializeEnemyPositions(ENEMY, EMPTY);
		
	}

	public void initializeBoard(char EMPTY) {
		for (int i = 0; i < boardArray.length; i++){
			for (int j = 0; j < boardArray[i].length; j++){
				boardArray[i][j] = EMPTY;
			}
		}
	
	}
	
	
	public void initializeBoardRules(char EMPTY, char ROOM, char ZONE) {
		
		for (int i = 0; i < boardRulesArray.length; i++){
			for (int j = 0; j < boardRulesArray[i].length; j++){
				boardRulesArray[i][j] = EMPTY;
			}
		}
		
		/**
		 * The 6 integer is here because it needs to be a 3X3
		 * area for the safe zone, this allows that to happen.
		 */
		for (int i = 0; i < boardRulesArray.length - 6; i++){
			for (int j = 6; j < boardRulesArray[i].length; j++){
				boardRulesArray[i][j] = ZONE;
			}
		}
			
	}
	
	public void initializeBothArrayRooms(char ROOM) {
		boardArray [1][1] = ROOM;
		boardArray [1][4] = ROOM;
		boardArray [1][7] = ROOM;
		boardArray [4][1] = ROOM;
		boardArray [4][4] = ROOM;
		boardArray [4][7] = ROOM;
		boardArray [7][1] = ROOM;
		boardArray [7][4] = ROOM;
		boardArray [7][7] = ROOM;
		
		boardRulesArray [1][1] = ROOM;
		boardRulesArray [1][4] = ROOM;
		boardRulesArray [1][7] = ROOM;
		boardRulesArray [4][1] = ROOM;
		boardRulesArray [4][4] = ROOM;
		boardRulesArray [4][7] = ROOM;
		boardRulesArray [7][1] = ROOM;
		boardRulesArray [7][4] = ROOM;
		boardRulesArray [7][7] = ROOM;
	}
	
	public void initializeBriefcase(char SUITCASE) {
		int chooseRoom = rand.nextInt(9);
		
		switch (chooseRoom) {
		case 0:
			boardRulesArray [1][1] = SUITCASE;
			break;
		case 1:
			boardRulesArray [1][4] = SUITCASE;
			break;
		case 2:
			boardRulesArray [1][7] = SUITCASE;
			break;
		case 3:
			boardRulesArray [4][1] = SUITCASE;
			break;
		case 4:
			boardRulesArray [4][4] = SUITCASE;
			break;
		case 5:
			boardRulesArray [4][7] = SUITCASE;
			break;
		case 6:
			boardRulesArray [7][1] = SUITCASE;
			break;
		case 7:
			boardRulesArray [7][4] = SUITCASE;
			break;
		case 8:
			boardRulesArray [7][7] = SUITCASE;
			break;
		}
		
	}
	
	public void initializePowerUps(char EMPTY, char INVIN, char BULLET, char RADAR){
		boolean invinPosition = true;
		boolean bulletPosition = true;
		boolean radarPosition = true;
		int row = rand.nextInt(9);
		int col = rand.nextInt(9);
		
		while(invinPosition)
		{
			if(boardArray[row][col] == EMPTY) {
			boardArray[row][col] = INVIN;
			invinPosition = false;
			}
			else{
				row = rand.nextInt(9);
				col = rand.nextInt(9);
			}
		}
		
		while(bulletPosition)
		{
			if(boardArray[row][col] == EMPTY) {
			boardArray[row][col] = BULLET;
			bulletPosition = false;
			}
			else{
				row = rand.nextInt(9);
				col = rand.nextInt(9);
			}
		}
		
		while(radarPosition)
		{
			if(boardArray[row][col] == EMPTY) {
			boardArray[row][col] = RADAR;
			radarPosition = false;
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
	
	public void initializeEnemyPositions(char ENEMY, char EMPTY) {
		int numberOfEnemies = 0;
		int row = rand.nextInt(9);
		int col = rand.nextInt(9);
		
			while(numberOfEnemies < 6)
			{
				if(boardArray[row][col] == boardRulesArray[row][col] 
						&& boardArray[row][col] == EMPTY 
						&& boardRulesArray[row][col] == EMPTY) {
					boardArray[row][col] = ENEMY;
					numberOfEnemies++;
				}
				else{
					row = rand.nextInt(9);
					col = rand.nextInt(9);
				}
			}	
	}
	
	public char[][] giveBoard() {
		return boardArray;
	}
	
	public char[][] giveBoardRules() {
		return boardRulesArray;
	}
	
	
}
