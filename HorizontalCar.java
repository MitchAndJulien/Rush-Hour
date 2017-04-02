
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class HorizontalCar implements HorzCar{

	//hopefully condense car class into two: horz and vert
	//when you instantiate a car, you need to add the buttons...
	//prob need vert and horz interfaces...
	
	//code represents the artwork that should be displayed...
	private int row;
	private int column;
	private int carCode;
	private JButton leftButton;
	private JButton rightButton;
	private int leftButtonRow;
	private int leftButtonColumn;
	private final int BUTTON_SIZE=150;
	//private int buttonCode;
	
	public TwoHorzCar(int row, int column, int code, int[][] trafficJam, Board board){
		//Left side is primary side
		if(row>=6 || column>=5){
			System.out.println("Inputted TwoHorzCar is not in bounds of 6x6");
		}else{
		this.row=row;
		this.column=column;
		this.carCode=code;
		leftButtonRow=row*BUTTON_SIZE;
		leftButtonColumn=column*BUTTON_SIZE;
		trafficJam[row][column]=code;
		trafficJam[row][column+1]=code;
		}
		
		//according to row column make image
		//grab image from the place in hard drive
		//place image at buttonRow, buttonColumn
		
		//or just have the buttons be the interface...
		//:)
		
		
		//according to row column make buttons
		leftButton = new JButton();
		leftButton.setBounds(leftButtonColumn, leftButtonRow, BUTTON_SIZE, BUTTON_SIZE);
		leftButton.setText("move left");
		leftButton.setBorder(BorderFactory.createRaisedBevelBorder());
		board.addButton(leftButton);
		moveLeftPress(trafficJam,leftButton);
		
		rightButton = new JButton();
		rightButton.setBounds(leftButtonColumn+BUTTON_SIZE, leftButtonRow, BUTTON_SIZE, BUTTON_SIZE);
		rightButton.setText("move right");
		rightButton.setBorder(BorderFactory.createRaisedBevelBorder());
		board.addButton(rightButton);
		moveRightPress(trafficJam,rightButton);
	}
	
	public void moveLeft(int[][] trafficJam){
		if(column-1>=0 && column+1<6 && trafficJam[row][column-1]==0){
			trafficJam[row][column+1]=0;
			column=column-1;
			trafficJam[row][column]=carCode;
			leftButtonColumn=leftButtonColumn-BUTTON_SIZE;
			leftButton.setBounds(leftButtonColumn, leftButtonRow, BUTTON_SIZE, BUTTON_SIZE);
			rightButton.setBounds(leftButtonColumn+BUTTON_SIZE, leftButtonRow, BUTTON_SIZE, BUTTON_SIZE);
			//just some debugging
			System.out.println(getRow());
			System.out.println(getColumn());
			System.out.println(getLeftButtonColumn());
		}else{
			System.out.println("moveleft failed");
		}
	}
	
	public void moveRight(int[][] trafficJam){
		if(column+2<6 && trafficJam[row][column+2]==0){
			trafficJam[row][column]=0;
			column=column+1;
			trafficJam[row][column+1]=carCode;
			leftButtonColumn=leftButtonColumn+BUTTON_SIZE;
			leftButton.setBounds(leftButtonColumn, leftButtonRow, BUTTON_SIZE, BUTTON_SIZE);
			rightButton.setBounds(leftButtonColumn+BUTTON_SIZE, leftButtonRow, BUTTON_SIZE, BUTTON_SIZE);
			//just some debugging
			System.out.println(getRow());
			System.out.println(getColumn());
			System.out.println(getLeftButtonColumn());
			//board.addRoad(trafficJam);
		}else{
			System.out.println("moveright failed");
		}
	}
	
	public void moveLeftPress(int[][] trafficJam, JButton b){
		b.addMouseListener(
				new MouseListener(){
					public void mouseClicked(MouseEvent arg0) {
					}
					public void mouseEntered(MouseEvent arg0) {
					}
					public void mouseExited(MouseEvent arg0) {
					}
					public void mousePressed(MouseEvent arg0) {
						b.setBackground(Color.blue);	
						moveLeft(trafficJam);
						//you have just pressed to the right...
						//move buttons and images to the right...
						System.out.println(Arrays.deepToString(trafficJam));
					}
					public void mouseReleased(MouseEvent arg0) {
						
					}
				}
		);
	}
	
	public void moveRightPress(int[][] trafficJam,JButton b){
		b.addMouseListener(
				new MouseListener(){
					public void mouseClicked(MouseEvent arg0) {
					}
					public void mouseEntered(MouseEvent arg0) {
					}
					public void mouseExited(MouseEvent arg0) {
					}
					public void mousePressed(MouseEvent arg0) {
						//if statement for each of the carCodes...
						b.setBackground(Color.blue);
						moveRight(trafficJam);
						//you have just pressed to the right...
						//move buttons and images to the right...
						System.out.println(Arrays.deepToString(trafficJam));
					}
					public void mouseReleased(MouseEvent arg0) {	
					}
				}
		);
	}
	

	//getters
	public int getRow(){
		return row;
	}
	public int getColumn(){
		return column;
	}
	public int getCarCode(){
		return carCode;
	}
	public int getleftButtonRow(){
		return leftButtonRow;
	}
	public int getLeftButtonColumn(){
		return leftButtonColumn;
	}
	
	
}

    
    
    
    
    
    
    
}
