import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;


public class RushHourBoard extends InternetJButtonColor{
	
	/**
	 * An array for the 10 levels in the game
	 */
	private Level[] levels;
	
	/**
	 * Constructor that sets up the RushHour game with a start screen and 10 levels.
	 * Also sets up MouseListeners so that the Play Now and Return Home JButtons work properly.
	 */
	public RushHourBoard(){
	
		StartScreen start = new StartScreen();
		
		levels = new Level[10];
		for(int i = 0; i < 10; i ++){
			levels[i] = new Level();
			int i2 = i;
			levels[i].getreturnhome().addMouseListener(
					new MouseListener(){
						public void mouseClicked(MouseEvent arg0) {
						}
						public void mouseEntered(MouseEvent arg0) {
						}
						public void mouseExited(MouseEvent arg0) {
						}
						public void mousePressed(MouseEvent arg0) {
							start.setstartvisibility(true);
							levels[i2].getLevel().setVisible(false);
							
						}
						public void mouseReleased(MouseEvent arg0) {
							
						}
					}
			);
		}
		
		start.getPlayNow().addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				start.setstartvisibility(false);
				int i = (int) (Math.random() * 10);
				levels[i].setlevelvisible(true);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
	
		//for (int i = 0; i < 10; i++){
			//levels[i].createBackground();
		//}
		
		
		
	}	
	
	
	/**
	 * Sets up the background for all 10 levels
	 * @param a The game that the background is set for
	 */
	public void createBackground(RushHourBoard a){
		for (int i = 0; i < 10; i ++){
			createBackground(levels[i]);
		}
	}
	
	/**
	 * Creates the background for a specific level
	 * @param level The level that the background is set for
	 */
	public void createBackground(Level level){
		
		for(int side1=0;side1<=5;side1++){
			for(int side2=0;side2<=5;side2++){		
				MyButton b=new MyButton("");
				
				setColorWheel(b);
				
				b.setBounds(150*side1, 150*side2, 150, 150);
				
				b.setBorder(BorderFactory.createLoweredBevelBorder());

				b.setBackground(Color.lightGray);
				
				level.getLevel().add(b);
				
			}
		}
		level.getLevel().repaint();
	}
	
	
	public Level getlevelsfromarray(int i){
		return levels[i];
	}	
		
		
		
	
	
	
	
	
	
	
	
	
	

}
