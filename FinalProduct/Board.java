import java.util.Arrays;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Board extends InternetJButtonColor{

	private JFrame level;
	
	
	/**
	Creates the JFrame window
	**/
	public Board(){
		level=new JFrame();
		level.setSize(1300,1000);
		level.setLayout(null);
		//level.setBackground(arg0);
		//level.setState(JFrame.NORMAL);
		level.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		level.setVisible(true);	
	}
	
	public void addButton(JButton b){
		level.add(b);
	}

	public JFrame getLevel(){
		return level;
	}
	
	public void createBackground(Board board){
		
		for(int side1=0;side1<=5;side1++){
			for(int side2=0;side2<=5;side2++){		
				MyButton b=new MyButton("");			
				setColorWheel(b);
				b.setBounds(150*side1, 150*side2, 150, 150);
				b.setBorder(BorderFactory.createLoweredBevelBorder());
				b.setBackground(Color.lightGray);
				board.addButton(b);
			}
		}
	}
}
