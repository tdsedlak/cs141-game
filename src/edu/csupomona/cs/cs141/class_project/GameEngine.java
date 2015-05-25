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
public class GameEngine {
	
	boolean gameRunning;
	/**
	 * 
	 */
	public void debug() {
		
	}
	public void Start() {
		Board board = new Board();
		UserInterface ui = new UserInterface();
		
		gameRunning = true;
		
		ui.PrintBoard(board.giveBoard(), board.giveBoardRules(),board.givePowerUpArray());
		
		while(gameRunning) {
			Turn(board);
		}
	}
	
	public void Turn(Board board) {
		board.Turn();
	}

}
