import java.awt.Color;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class HorzCar{

	/**
	 * The row of the left side of the Horizontal car
	 */
	protected int row;
	
	/**
	 * The column of the left side of the horizontal car
	 */
	protected int column;
	
	/**
	 * The code for the car that determines the color
	 */
	protected int carCode;
	
	/**
	 * Left button of the horizontal car
	 */
	protected JButton leftButton;
	
	/**
	 * right button of the horizontal car
	 */
	protected JButton rightButton;
	
	/**
	 * The row for the left button
	 */
	protected int leftButtonRow;
	
	/**
	 * The column for the left button
	 */
	protected int leftButtonColumn;
	
	/**
	 * The size of each button and each space for movement
	 */
	protected final int BUTTON_SIZE=150;
			
	/**
	 * Changes the color of the inputted button
	 * @param b The button that one wants to change
	 * @param code The specific color desired
	 */
	public void createColor(JButton b, int code){
		if(code==1){
			b.setBackground(Color.WHITE);
		}else if(code==2){
			b.setBackground(Color.orange);
		}else if(code==3){
			b.setBackground(Color.yellow);
		}else if(code==4){
			b.setBackground(Color.green);
		}else if(code==5){
			b.setBackground(Color.blue);
		}else if(code==6){
			b.setBackground(Color.magenta);
		}else if(code==7){
			b.setBackground(Color.cyan);
		}else if(code==8){
			b.setBackground(Color.pink);
		}else if(code==9){
			b.setBackground(Color.black);
		}else if(code==10){
			b.setBackground(Color.red);
		}
	}
	
	/**
	 * Returns a new Button
	 * @param leftButtonColumn The column of the left button
	 * @param leftButtonRow The row of the left button
	 * @param BUTTON_SIZE Size of each button
	 * @param str The text in each button
	 * @param code The color code of the car
	 * @return
	 */
	public JButton createButton(int leftButtonColumn, int leftButtonRow, int BUTTON_SIZE, String str, int code){
		JButton b=new JButton();
		b.setBounds(leftButtonColumn, leftButtonRow, BUTTON_SIZE, BUTTON_SIZE);
		b.setText(str);
		b.setFont(new Font("Arial", Font.PLAIN, 20));
		b.setBorder(BorderFactory.createRaisedBevelBorder());
		createColor(b, code);
		return b;
	}
	
	/**
	 * Getter for the row of the 2D logic array
	 * @return The row number
	 */
	public int getRow(){
		return row;
	}
	
	/**
	 * Getter for the column of the 2D logic array
	 * @return The column number
	 */
	public int getColumn(){
		return column;
	}
	
	/**
	 * Getter for the Car Color Code of 
	 * @return The car code
	 */
	public int getCarCode(){
		return carCode;
	}
	
	/**
	 * Getter for the left button row
	 * @return The left button row
	 */
	public int getLeftButtonRow(){
		return leftButtonRow;
	}
	
	/**
	 * Getter for the left button column
	 * @return The left button column
	 */
	public int getLeftButtonColumn(){
		return leftButtonColumn;
	}
	
}
