import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WinScreen {

	private JFrame win;
	
	private WinLogoButton meme;
	
	public WinScreen(){
		win = new JFrame();
		win.setSize(1300, 1000);
		win.setVisible(false);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		meme = new WinLogoButton();
		meme.setBounds(500,500,300,300);
		win.add(meme);
		win.repaint();
	}
	
	public void setVisible(boolean a){
		this.win.setVisible(a);
	}
	
	public JButton winbutton(){
		return this.meme;
	}
	
	
}
