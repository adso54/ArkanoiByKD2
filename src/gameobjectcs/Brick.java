package gameobjectcs;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Brick extends GameObject {
	public static final int BRICK_BLACK = 1;
	public int type;
	public boolean visibility;
	

	Brick(){
		this(BRICK_BLACK);
	}
	
	Brick(int type){
		this.type = type;	
		setIconAndSetSize();
		visibility = true;
	}


	private void setIconAndSetSize() {
		switch(type) {
		case BRICK_BLACK:
			this.image = new ImageIcon("BrickBlack.png").getImage();
			
		}
		height = image.getHeight(null);
		width = image.getWidth(null);
	}
	


}
