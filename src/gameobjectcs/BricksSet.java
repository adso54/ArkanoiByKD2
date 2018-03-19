package gameobjectcs;

import java.util.ArrayList;

import daniels.GamePanel;

public class BricksSet {
	
	public ArrayList<Brick> bricksList;
	
	public static final int SET_1 = 1;
	private int tmpPositionX;
	private int tmpPositionY;
	private int tmpFirstBrickInRowPosition;
	private final int SPARE_X = 2;
	private final int SPARE_Y = 10;
	
	public BricksSet(GamePanel gamePanel) {
		this(SET_1, gamePanel);
	}
	
	public BricksSet(int set, GamePanel gamePanel) {
		bricksList  = new ArrayList<>();
		switch(set) {
		case SET_1:
			createSet_1(gamePanel);
		}
	}

	private void createSet_1(GamePanel gamePanel) {
		for(int i=0; i<93; i++) {
			bricksList.add(new Brick(Brick.BRICK_BLACK));
			if(i==0) {
				tmpFirstBrickInRowPosition = 15;
				bricksList.get(i).positionX =  tmpFirstBrickInRowPosition; 
				bricksList.get(i).positionY =  40; 
			}else {
				tmpPositionX = bricksList.get(i-1).positionX + bricksList.get(i-1).width + SPARE_X;
				if(gamePanel.getWidth() > tmpPositionX + bricksList.get(i).width) {
					bricksList.get(i).positionX = tmpPositionX; 
					bricksList.get(i).positionY = bricksList.get(i-1).positionY; 
				}else {
					if (tmpFirstBrickInRowPosition < bricksList.get(i).width) {
						tmpFirstBrickInRowPosition = bricksList.get(i).width;
						
					}else {
						tmpFirstBrickInRowPosition = 15;
					}
					bricksList.get(i).positionX =  tmpFirstBrickInRowPosition;
					bricksList.get(i).positionY = bricksList.get(i-1).positionY + bricksList.get(i-1).height + SPARE_Y;
				}
			}
			
		}
		

	}
	

}
