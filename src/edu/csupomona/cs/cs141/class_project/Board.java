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

import java.util.*;

/**
 *
 */
public class Board {
	Random rand = new Random();
	
	private char boardArray[][] = new char[9][9];
	private char safeZoneArray[][] = new char [9][9];
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
		initializeRooms(ROOM);
		initializeBriefcase(SUITCASE);
		initializePowerUps(INVIN, BULLET, RADAR);
		initializePlayerPosition(PLAYER);
		initializeSafeZone(EMPTY, ROOM, ZONE);
		initializeEnemyPositions(ENEMY);
		
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
		boolean invinPosition = true;
		boolean bulletPosition = true;
		boolean radarPosition = true;
		int row = rand.nextInt(9);
		int col = rand.nextInt(9);
		
		while(invinPosition)
		{
			if(boardArray[row][col] == ' ') {
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
			if(boardArray[row][col] == ' ') {
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
			if(boardArray[row][col] == ' ') {
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
	
	public void initializeSafeZone(char EMPTY, char ROOM, char ZONE) {
		
		for (int i = 0; i < safeZoneArray.length; i++){
			for (int j = 0; j < safeZoneArray[i].length; j++){
				safeZoneArray[i][j] = EMPTY;
			}
		}
		
		for (int i = 0; i < safeZoneArray.length - 6; i++){
			for (int j = 6; j < safeZoneArray[i].length; j++){
				safeZoneArray[i][j] = ZONE;
			}
		}
		
		safeZoneArray [1][1] = ROOM;
		safeZoneArray [1][4] = ROOM;
		safeZoneArray [1][7] = ROOM;
		safeZoneArray [4][1] = ROOM;
		safeZoneArray [4][4] = ROOM;
		safeZoneArray [4][7] = ROOM;
		safeZoneArray [7][1] = ROOM;
		safeZoneArray [7][4] = ROOM;
		safeZoneArray [7][7] = ROOM;	
	}
	
	private void initializeEnemyPositions(char ENEMY) {
		boolean enemyPosition = true;
		int numberOfEnemies = 0;
		int row = rand.nextInt(9);
		int col = rand.nextInt(9);
		
			while(enemyPosition && numberOfEnemies < 5)
			{
				if(boardArray[row][col] == safeZoneArray[row][col] 
						&& boardArray[row][col] == ' ' 
						&& safeZoneArray[row][col] == ' ') {
					boardArray[row][col] = ENEMY;
					numberOfEnemies++;
				}
				else{
					row = rand.nextInt(9);
					col = rand.nextInt(9);
				}
			}	
	}
	
}
