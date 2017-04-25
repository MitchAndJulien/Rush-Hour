import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JButton;

//convert everything here into a vertical car


public class ThreeVertCar extends HorzCar{

	//hopefully condense car class into two: horz and vert
	//when you instantiate a car, you need to add the buttons...
	//prob need vert and horz interfaces...
	
	//code represents the artwork that should be displayed...
	private int row;
	private int column;
	private int carCode;
	private JButton downButton;
	private JButton middleButton;
	private JButton upButton;
	private int upButtonRow;
	private int upButtonColumn;
	private final int BUTTON_SIZE=150;
	//private int buttonCode;
	
	public ThreeVertCar(int row, int column, int code, int[][] trafficJam, Board board){
		//Bottom side is primary side
		if(row>=3 || column>5 || trafficJam[row][column] != 0 || trafficJam[row+1][column] != 0 || trafficJam[row+2][column] !=0){
			System.out.println("failed to add ThreeVertCar");
		}else{
		this.row=row;
		this.column=column;
		this.carCode=code;
		upButtonRow=row*BUTTON_SIZE;
		upButtonColumn=column*BUTTON_SIZE;
		trafficJam[row][column]=code;
		trafficJam[row+1][column]=code;
		trafficJam[row+2][column] = code;
		
		
		//according to row column make image
		//grab image from the place in hard drive
		//place image at buttonRow, buttonColumn
		
		//or just have the buttons be the interface...
		//:)
		
		
		//according to row column make button
		downButton = createButton(upButtonColumn,upButtonRow+2*BUTTON_SIZE, BUTTON_SIZE, "move down", carCode);
		//downButton = new JButton();
		//downButton.setBounds(upButtonColumn,upButtonRow+2*BUTTON_SIZE, BUTTON_SIZE, BUTTON_SIZE);
		//downButton.setText("move down");
		//downButton.setBorder(BorderFactory.createRaisedBevelBorder());
		board.addButton(downButton);
		moveDownPress(trafficJam,downButton);
		
		upButton = createButton(upButtonColumn, upButtonRow, BUTTON_SIZE, "move up", carCode);
		//upButton = new JButton();
		//upButton.setBounds(upButtonColumn, upButtonRow, BUTTON_SIZE, BUTTON_SIZE);
		//upButton.setText("move up");
		//upButton.setBorder(BorderFactory.createRaisedBevelBorder());
		board.addButton(upButton);
		moveUpPress(trafficJam,upButton);
		
		middleButton = createButton(upButtonColumn, upButtonRow + BUTTON_SIZE, BUTTON_SIZE, "stay put", carCode);
		//middleButton = new JButton();
		//middleButton.setBounds(upButtonColumn, upButtonRow + BUTTON_SIZE, BUTTON_SIZE, BUTTON_SIZE);
		//middleButton.setText("stay put");
		board.addButton(middleButton);
		
		}	
		
	}
	
	public void moveDown(int[][] trafficJam){
		if(trafficJam[row+3][column] == 0){
			trafficJam[row][column]=0;
			trafficJam[row+1][column] = 0;
			trafficJam[row+2][column] = 0;
			row=row+1;
			trafficJam[row][column]=carCode;
			trafficJam[row+1][column] = carCode;
			trafficJam[row+2][column] = carCode;
			upButtonRow = upButtonRow + BUTTON_SIZE;
			upButton.setBounds(upButtonColumn, upButtonRow, BUTTON_SIZE, BUTTON_SIZE);
			downButton.setBounds(upButtonColumn,upButtonRow+BUTTON_SIZE+BUTTON_SIZE, BUTTON_SIZE, BUTTON_SIZE);
			middleButton.setBounds(upButtonColumn, upButtonRow + BUTTON_SIZE, BUTTON_SIZE, BUTTON_SIZE);
			//moveDownPress(trafficJam,downButton);

		}else{
			System.out.println("movedown failed");
		}
	}
	
	public void moveUp(int[][] trafficJam){
		if(row>0 && trafficJam[row-1][column]==0){
			trafficJam[row][column]=0;
			trafficJam[row+1][column] = 0;
			trafficJam[row+2][column] = 0;
			row=row-1;
			trafficJam[row][column]=carCode;
			trafficJam[row+1][column] = carCode;
			trafficJam[row+2][column] = carCode;
			upButtonRow=upButtonRow-BUTTON_SIZE;
			upButton.setBounds(upButtonColumn, upButtonRow, BUTTON_SIZE, BUTTON_SIZE);
			downButton.setBounds(upButtonColumn,upButtonRow+(2*BUTTON_SIZE), BUTTON_SIZE, BUTTON_SIZE);
			middleButton.setBounds(upButtonColumn, upButtonRow + BUTTON_SIZE, BUTTON_SIZE, BUTTON_SIZE);
			//moveUpPress(trafficJam,upButton);
//
			
		}else{
			System.out.println("moveup failed");
		}
	}
	
	public void moveDownPress(int[][] trafficJam, JButton b){
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
						moveDown(trafficJam);
						//you have just pressed to the right...
						//move buttons and images to the right...
						System.out.println(Arrays.deepToString(trafficJam));
					}
					public void mouseReleased(MouseEvent arg0) {
						
					}
				}
		);
	}
	
	public void moveUpPress(int[][] trafficJam,JButton b){
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
						moveUp(trafficJam);
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
	public int getDownButtonRow(){
		return upButtonRow;
	}
	public int getDownButtonColumn(){
		return upButtonColumn;
	}
	
	
}
