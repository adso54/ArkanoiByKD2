package buttons_and_other_swing_obj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import daniels.*;
import javax.swing.JButton;

public class StartButton extends JButton {
	
	public StartButton(GamePanel gamePanel){
		this.setText("Start");
		
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				gamePanel.gameStatus = 1;
				gamePanel.repaint();	
			}
		});
	}
}
