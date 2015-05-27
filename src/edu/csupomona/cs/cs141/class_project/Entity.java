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
	
	public boolean checkMove(int direction) {
		if(posX == -1 || posX == 9 || posY == -1 || posY == 9) {
			switch (direction) {
			case 0: direction = 2;
			break;
			case 1: direction = 3;
			break;
			case 2: direction = 0;
			break;
			case 3: direction = 1;
			break;
			}
			Move(direction);
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
	
	public void changePos(int x, int y) {
		posX = x;
		posY = y;
	}

}
