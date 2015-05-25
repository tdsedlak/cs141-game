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
	private char powerUpArray[][] = new char [9][9];
	char EMPTY = ' ';
	char ROOM = 'R';
	char PLAYER = 'P';
	char ENEMY = 'E';
	char INVIN = 'I';
	char BULLET = 'B';
	char RADAR = 'G';
	char SUITCASE = 'S';
	char ZONE = 'Z';
	
	Player player;
	Enemy enemy0;
	Enemy enemy1;
	Enemy enemy2;
	Enemy enemy3;
	Enemy enemy4;
	Enemy enemy5;
	/**
	 * 
	 */
	public Board() {
		
		initializeBoardArray(EMPTY);
		initializeBoardRulesArray(EMPTY, ZONE);
		initializePowerUpArray(EMPTY);
		initializeBothArrayRooms(ROOM);
		initializeBriefcase(SUITCASE);
		initializePowerUps(EMPTY, INVIN, BULLET, RADAR);
		initializePlayerPosition(PLAYER);
		initializeEnemyPositions(ENEMY, EMPTY);
		
	}

	public void initializeBoardArray(char EMPTY) {
		for (int i = 0; i < boardArray.length; i++){
			for (int j = 0; j < boardArray[i].length; j++){
				boardArray[i][j] = EMPTY;
			}
		}
	}
	
	
	public void initializeBoardRulesArray(char EMPTY, char ZONE) {
		
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
	
	public void initializePowerUpArray(char EMPTY) {
		for (int i = 0; i < powerUpArray.length; i++){
			for (int j = 0; j < powerUpArray[i].length; j++){
				powerUpArray[i][j] = EMPTY;
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
		
		powerUpArray [1][1] = ROOM;
		powerUpArray [1][4] = ROOM;
		powerUpArray [1][7] = ROOM;
		powerUpArray [4][1] = ROOM;
		powerUpArray [4][4] = ROOM;
		powerUpArray [4][7] = ROOM;
		powerUpArray [7][1] = ROOM;
		powerUpArray [7][4] = ROOM;
		powerUpArray [7][7] = ROOM;
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
			powerUpArray[row][col] = INVIN;
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
			powerUpArray[row][col] = BULLET;
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
			powerUpArray[row][col] = RADAR;
			radarPosition = false;
			}
			else{
				row = rand.nextInt(9);
				col = rand.nextInt(9);
			}
		}
		
	}
	
	public void initializePlayerPosition(char PLAYER) {
		Player player = new Player();
		boardArray[0][8] = PLAYER;	
	}
	
	public void initializeEnemyPositions(char ENEMY, char EMPTY) {
		int numberOfEnemies = 0;
		int row = rand.nextInt(9);
		int col = rand.nextInt(9);
		
			while(numberOfEnemies < 6)
			{
				if(boardArray[row][col] == EMPTY && boardRulesArray[row][col] == EMPTY) {
					boardArray[row][col] = ENEMY;
					CreateEnemy(numberOfEnemies, row, col);
					numberOfEnemies++;
				}
				else{
					row = rand.nextInt(9);
					col = rand.nextInt(9);
				}
			}	
	}
	
	private void CreateEnemy(int numberOfEnemies, int row, int col) {
		switch (numberOfEnemies) {
		case 0: Enemy enemy0 = new Enemy(row, col);
				break;
		case 1: Enemy enemy1 = new Enemy(row, col);
				break;
		case 2: Enemy enemy2 = new Enemy(row, col);
				break;
		case 3: Enemy enemy3 = new Enemy(row, col);
				break;
		case 4: Enemy enemy4 = new Enemy(row, col);
				break;
		case 5: Enemy enemy5 = new Enemy(row, col);
				break;
		}
		
	}

	public char[][] giveBoard() {
		return boardArray;
	}
	
	public char[][] giveBoardRules() {
		return boardRulesArray;
	}
	
	public char[][] givePowerUpArray() {
		return powerUpArray;
	}
	
	public void changePlayerPosition(int oldPosX, int oldPosY, int newPosX, int newPosY) {
		boardArray[oldPosX][oldPosY] = EMPTY;
		boardArray[newPosX][newPosY] = PLAYER;
	}
	
	public void changeEnemyPosition(int oldPosX, int oldPosY, int newPosX, int newPosY) {
		boardArray[oldPosX][oldPosY] = EMPTY;
		boardArray[newPosX][newPosY] = ENEMY;
	}

	public void Turn() {
		player.Turn();
		enemy0.Turn();
		enemy1.Turn();
		enemy2.Turn();
		enemy3.Turn();
		enemy4.Turn();
		enemy5.Turn();
	}
	
}
