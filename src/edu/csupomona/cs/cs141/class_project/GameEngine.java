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
	/**
	 * 
	 */
	public void debug() {
		
	}
	public void Start() {
		Board board = new Board();
		UserInterface ui = new UserInterface();
		
		gameRunning = true;
	//	ui.PrintBoard(board.giveBoard(), board.giveBoardRules(),board.givePowerUpArray());

	//	Move();
	//	Move();
		ui.PrintBoard(board.giveBoard(), board.giveBoardRules(),board.givePowerUpArray());
		
		while(gameRunning) {
			Turn(board);
		}
	}
	
	public void Turn(Board board) {
		UserInterface ui = new UserInterface();

		board.Turn();
		ui.PrintBoard(board.giveBoard(), board.giveBoardRules(),board.givePowerUpArray());
	}
	public void Move(){
		UserInterface ui = new UserInterface();
		int choice=0;
		int choice2=0;
		Board board = new Board(0,0);
		System.out.println("Want to move?");
		Scanner b=new Scanner(System.in);
		choice=b.nextInt();
		choice2=b.nextInt();
		b.close();
		
		board.changePlayerPosition(choice+1, choice2+1);
		ui.PrintBoard(board.giveBoard(), board.giveBoardRules(),board.givePowerUpArray());

	}

}
