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
public class UserInterface {
	
	public void menu () {
		
	}
	
	public boolean saveGame() {
		return false;
		
	}
	
	public void PrintBoard(char board[][], char boardRules[][], char powerUpsArray[][]) {
		System.out.println("Board:");
		for (int i = 0; i < board.length; i++){
			for (int j = 0; j < board[i].length; j++){
				System.out.printf("%-3S","[" + board[j][i] + "]");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Board Rules:");
		for (int i = 0; i < boardRules.length; i++){
			for (int j = 0; j < boardRules[i].length; j++){
				System.out.printf("%-3S","[" + boardRules[j][i] + "]");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Power Ups:");
		for (int i = 0; i < powerUpsArray.length; i++){
			for (int j = 0; j < powerUpsArray[i].length; j++){
				System.out.printf("%-3S","[" + powerUpsArray[j][i] + "]");
			}
			System.out.println();
		}
		
		System.out.println();
		
	}
}
