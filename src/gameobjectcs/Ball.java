package gameobjectcs;

import javax.swing.ImageIcon;

public class Ball extends GameObject{
	private boolean isMoving;
	
	
	public Ball() {
		super();
		image = new ImageIcon("ball.gif").getImage();
		width = image.getWidth(null);
		height = image.getHeight(null);
		isMoving = false;
	}
}
