package daniels;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

import gameobjectcs.BallGroup;
import gameobjectcs.Brick;
import gameobjectcs.BricksSet;
import gameobjectcs.Shield;

public class GamePanel extends JPanel {
	public static final int GAME_STOPED = 0;
	public static final int GAME_RUNNING = 1;
	public static final int GAME_PAUSED = 2;
	
	public int brokenBricks;
	public int points;
	public int lifes;
	public int gameStatus;
	
	public Shield shield;
	public BricksSet bricksSet;
	public JTextField tmpTextField = new JTextField();
	
	public GamePanel(GameFrame gameFrame) {
		setParameters(gameFrame);
		createObjects();
		addShieldKeyListener();
	}

	private void setParameters(GameFrame gameFrame) {
		this.setBackground(Color.WHITE);
		gameStatus = GAME_STOPED;
		this.setSize(gameFrame.getWidth(), gameFrame.getHeight() - 50);
	}
	
	private void createObjects() {
		shield = new Shield();
		bricksSet = new BricksSet(BricksSet.SET_1, this);
		this.add(tmpTextField);
		tmpTextField.setFocusable(true);
		tmpTextField.requestFocus();
	}
	
	@Override
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		if(gameStatus==1) {
			paintScoreTable(graphics);
			paintShield(graphics);
			paintBricksSet(graphics);
			
		}
		tmpTextField.setFocusable(true);
		tmpTextField.requestFocus();
	}
	
	private void paintScoreTable(Graphics graphics) {
		graphics.drawString("Ponts:         " , 650, 20);
		graphics.drawString("Broken bricks: " , 750, 20);
		graphics.drawString("Lifes:         " , 900, 20);
		graphics.drawString("" + points, 700, 20);
		graphics.drawString("" + brokenBricks, 850, 20);
		graphics.drawString("" + lifes, 950, 20);
	}
	
	private void paintShield(Graphics graphics) {
		graphics.drawImage(shield.image, shield.positionX, shield.positionY, null);
	}
	
	private void paintBricksSet(Graphics graphics) {
		for (Brick brick : bricksSet.bricksList) {
			if(brick.visibility == true)
				graphics.drawImage(brick.image, brick.positionX, brick.positionY, null);
		}
	}
	
	private void addShieldKeyListener() {
		tmpTextField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent keyEvent) {
			    if(keyEvent.getKeyCode() ==39){
			    	shield.move(shield.RIGHT_DIRECTION);
                    repaint();
                }else if(keyEvent.getKeyCode() ==37){
                    shield.move(shield.LEFT_DIRECTION);
                    repaint();
                }else if(keyEvent.getKeyCode() ==32){
                	//startAnimation();
                }
				
			}
		});
	}
}
