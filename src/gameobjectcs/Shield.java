package gameobjectcs;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Shield extends GameObject{
	public static final int LEFT_DIRECTION = -1;
	public static final int RIGHT_DIRECTION = 1;
	public int delta = 20;
	
	public Shield() {
		super();
		image = new ImageIcon("shield.png").getImage();
		width = image.getWidth(null);
		height = image.getHeight(null);
		positionX = (1000 - width) /2 ;
		positionY = 720;	
	}
	
	public void move(int direction) {
		if(direction == LEFT_DIRECTION) {
			positionX -= delta;
		}else {
			positionX += delta;
		}
	}
	
}
