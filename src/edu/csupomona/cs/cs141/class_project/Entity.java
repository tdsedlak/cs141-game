package edu.csupomona.cs.cs141.class_project;

public class Entity {
	
	int posX;
	int posY;
	
	public Entity(int X, int Y) {
		posX = X;
		posY = Y;
	}
	
	public void Move(int direction) {
		switch (direction) {
		
		case 0: posY--;
				break;
				
		case 1: posX++;
				break;
				
		case 2: posY++;
				break;
				
		case 3: posX--;
				break;
		}
	}
	
	public boolean checkMove() {
		if(posX == -1 || posX == 9 || posY == -1 || posY == 9) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public int giveXPos() {
		return posX;
	}
	
	public int giveYPos() {
		return posY;
	}

}
