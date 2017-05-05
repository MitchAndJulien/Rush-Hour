import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class VertCar {

	protected int row;
	protected int column;
	protected int carCode;
	protected JButton upButton;
	protected JButton downButton;
	protected int upButtonRow;
	protected int upButtonColumn;
	protected final int BUTTON_SIZE=150;
	protected int lengthCode;
	
	
	/**
	Chooses a color for the car
	**/
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
		}else if(code==11){
			b.setBackground(Color.gray);
		}
	}
	
	
	/**
	Creates the button
	**/
	public JButton createButton(int upButtonColumn, int upButtonRow, int BUTTON_SIZE, String str, int code){
		JButton b=new JButton();
		b.setBounds(upButtonColumn, upButtonRow, BUTTON_SIZE, BUTTON_SIZE);
		b.setText(str);
		b.setFont(new Font("Arial", Font.PLAIN, 20));
		b.setBorder(BorderFactory.createRaisedBevelBorder());
		createColor(b, code);
		return b;
	}
	
	
	
}
