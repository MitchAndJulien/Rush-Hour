import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JButton;

//convert everything here into a vertical car


public class TwoVertCar extends VertCar{


	//when you instantiate a car, you need to add the buttons...
	//prob need vert and horz interfaces...
	
	//code represents the artwork that should be displayed...
	
	
	public TwoVertCar(int row, int column, int code, int[][] trafficJam, Board board){
		//Bottom side is primary side
		if(row>=5 || column>5){
			System.out.println("Inputted TwoHorzCar is not in bounds of 6x6");
		}else{
		this.row=row;
		this.column=column;
		this.carCode=code;
		upButtonRow=row*BUTTON_SIZE;
		upButtonColumn=column*BUTTON_SIZE;
		trafficJam[row][column]=code;
		trafficJam[row+1][column]=code;
		}
		
		//make the buttons
		upButton = createButton(upButtonColumn, upButtonRow, BUTTON_SIZE, "move up", code);
		downButton = createButton(upButtonColumn, upButtonRow + BUTTON_SIZE, BUTTON_SIZE, "move down", code);
		board.addButton(upButton);
		board.addButton(downButton);
		moveUpPress(trafficJam, upButton);
		moveDownPress(trafficJam, downButton);
		
		System.out.println("Two vert car successfully instantiated");
		
		//according to row column make image
		//grab image from the place in hard drive
		//place image at buttonRow, buttonColumn
		
		//or just have the buttons be the interface...
		//:)
		
		
		//according to row column make button
		/*downButton = new JButton();
		downButton.setBounds(upButtonColumn, upButtonRow, BUTTON_SIZE, BUTTON_SIZE);
		downButton.setText("move up");
		downButton.setBorder(BorderFactory.createRaisedBevelBorder());
		board.addButton(downButton);
		moveDownPress(trafficJam,downButton);
		
		upButton = new JButton();
		upButton.setBounds(upButtonColumn, upButtonRow+BUTTON_SIZE, BUTTON_SIZE, BUTTON_SIZE);
		upButton.setText("move down");
		upButton.setBorder(BorderFactory.createRaisedBevelBorder());
		board.addButton(upButton);
		moveUpPress(trafficJam,upButton);*/
	}
	
	public void moveDown(int[][] trafficJam){
		if(row<4 && trafficJam[row+2][column]==0){
			trafficJam[row][column]=0;
			trafficJam[row+1][column] = 0;
			row=row+1;
			trafficJam[row][column] = carCode;
			trafficJam[row+1][column]=carCode;
			upButtonRow=row*BUTTON_SIZE;
			downButton.setBounds(upButtonColumn, upButtonRow + BUTTON_SIZE, BUTTON_SIZE, BUTTON_SIZE);
			upButton.setBounds(upButtonColumn, upButtonRow, BUTTON_SIZE, BUTTON_SIZE);
		}else{
			System.out.println("movedown failed");
		}
	}
	
	public void moveUp(int[][] trafficJam){
		if(row>0 && trafficJam[row-1][column]==0){
			trafficJam[row][column]=0; 
			trafficJam[row+1][column]=0; 
			row=row-1;
			trafficJam[row][column]=carCode;
			trafficJam[row+1][column] = carCode;
			upButtonRow=row*BUTTON_SIZE;
			//downButtonRow = downButtonRow + BUTTON_SIZE;
			downButton.setBounds(upButtonColumn, upButtonRow+BUTTON_SIZE, BUTTON_SIZE, BUTTON_SIZE);
			upButton.setBounds(upButtonColumn, upButtonRow, BUTTON_SIZE, BUTTON_SIZE);
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
						//you have just pressed to go down...
						//move buttons and images down...
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
	public int getupButtonRow(){
		return upButtonRow;
	}
	public int getupButtonColumn(){
		return upButtonColumn;
	}
	
	
}
