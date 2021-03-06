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
import java.util.Scanner;


public class GameEngine {
	
	boolean gameRunning;
	
	UserInterface ui = new UserInterface();
	/**
	 * 
	 */
	public void debug() {
		
	}
	public void Start() {
		int choice=0;
		choice=ui.initialMenu();
		if(choice==1){
		gameStart();
		}

	}
	
	public void gameStart(){
		Board board = new Board();

		
		ui.PrintBoard(board.giveBoard(), board.giveBoardRules(),board.givePowerUpArray());
		
		
		gameRunning = true;
		while(gameRunning) {
			Turn(board);
		}
	}
	
	public void Turn(Board board) {
		int choice;
		boolean inMenu = true;
		while(inMenu) {
			choice = ui.PlayerMenu();
			switch (choice) {
			case 1: // Move
					boolean valid = true;
					boolean enemyValid = true;
					while(valid) {
						valid = board.PlayerMove(ui.ChooseDirection());
						System.out.println("Check");
						valid = false;
					}
					
					while(enemyValid){
						board.EnemyMove(board.enemy0);
						board.EnemyMove(board.enemy1);
						board.EnemyMove(board.enemy2);
						board.EnemyMove(board.enemy3);
						board.EnemyMove(board.enemy4);
						enemyValid = false;
						
					}
					inMenu = false;
			break;
			case 2: board.Look();
			break;
			case 3: board.Shoot();
					inMenu = false;
			break;
			case 4: // Save
			break;
			case 5: // Exit
			break;
			case 6: // Settings
			break;	
			}
		}
		
		ui.PrintBoard(board.giveBoard(), board.giveBoardRules(),board.givePowerUpArray());
		
		Turn(board);
	}	
}


