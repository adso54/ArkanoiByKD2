package gameobjectcs;

import java.awt.Image;

import javax.swing.ImageIcon;

public class GameObject {
	public int positionX;
	public int positionY;
	public int width;
	public int height;
	public Image image;
	
	public GameObject() {
		this(0,0,0,0);
	}
	
	public GameObject(int positionX, int positionY, int width, int height) {
		this.positionX = positionX;
		this.positionY = positionY;
		this.width = width;
		this.height = height;
	}
	

}
