package daniels;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;


import javax.swing.*;

public class GameFrame extends JFrame {
	private Image frameIcon;
	private JFrame gameFrame = this;
	private GamePanel gamePanel;
	private JMenuBar gameMenuBar = new JMenuBar();
	
	
	public GameFrame() {
		setFrameParametes();
		
		gamePanel = new GamePanel(this);
		this.getContentPane().add(gamePanel);
		
		gameMenuBar = new GameMenuBar(gameFrame, gamePanel);
		this.getContentPane().add(gameMenuBar, BorderLayout.NORTH);
		
	}


	private void setFrameParametes() {
		this.setIconImage(getFrameIcon());
		this.setBounds(200,200, 1000,800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Lucky Arcanoid");
		this.setResizable(false);	
	}
	
	private Image getFrameIcon() {
		frameIcon = new ImageIcon("Lucky.png").getImage();
		return  frameIcon;
	}
	

}


