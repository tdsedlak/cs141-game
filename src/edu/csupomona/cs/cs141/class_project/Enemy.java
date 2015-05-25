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
public class Enemy extends Entity {
	
	Random rand = new Random();
	
	public Enemy(int x, int y) {
		super(x, y);
	}
	
	public int chooseDirection() {
		return rand.nextInt(4);
	}

	public void Turn() {
		// TODO Auto-generated method stub
		
	}
}
