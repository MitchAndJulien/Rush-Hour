import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WinScreen {

	private JFrame win;
	
	private JButton winner;
	
	public WinScreen(){
		win = new JFrame();
		win.setSize(1300, 1000);
		win.setVisible(false);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		winner = new JButton("YOU WIN");
		winner.setBounds(500,500,500,500);
		win.add(winner);
		win.repaint();
		winner.setOpaque(true);
		winner.setBackground(Color.GREEN);
	}
	
	public void setVisible(boolean a){
		this.win.setVisible(a);
	}
	
	public JButton winbutton(){
		return this.winner;
	}
	
	
}
