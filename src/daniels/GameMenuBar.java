package daniels;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import buttons_and_other_swing_obj.*;

public class GameMenuBar extends JMenuBar {
	private JButton start; 
	private JButton restart; 
	private JButton stop; 
	private JTextField tmpTextField = new JTextField();
	
	GameMenuBar(JFrame frame, GamePanel gamePanel){
		
		start = new StartButton(gamePanel);
		restart = new RestartButton(gamePanel);
		stop = new PauseButton(gamePanel);
		
		this.add(start);
		this.add(restart);
		this.add(stop);
		this.add(tmpTextField);
		this.setBackground(Color.GRAY);
		
	}

}
