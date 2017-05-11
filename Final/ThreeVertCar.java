import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JButton;


public class ThreeVertCar extends VertCar{
	private int row;
	private int column;
	private int carCode;
	private JButton downButton;
	private JButton middleButton;
	private JButton upButton;
	private int upButtonRow;
	private int upButtonColumn;
	private final int BUTTON_SIZE=150;
	
	public ThreeVertCar(int row, int column, int code, int[][] trafficJam, Level level){
		//top side is primary side
		if(row>3 || column>5 || trafficJam[row][column] != 0 || trafficJam[row+1][column] != 0 || trafficJam[row+2][column] !=0){
			System.out.println("failed to add ThreeVertCar");
		}else{
			System.out.println("what is going on");
		this.row=row;
		this.column=column;
		this.carCode=code;
		upButtonRow=row*BUTTON_SIZE;
		upButtonColumn=column*BUTTON_SIZE;
		trafficJam[row][column]=code;
		trafficJam[row+1][column]=code;
		trafficJam[row+2][column] = code;
		
		downButton = createButton(upButtonColumn,upButtonRow+2*BUTTON_SIZE, BUTTON_SIZE, "move down", carCode);
		level.getLevel().add(downButton);
		
		moveDownPress(trafficJam,downButton);
		
		upButton = createButton(upButtonColumn, upButtonRow, BUTTON_SIZE, "move up", carCode);
		level.getLevel().add(upButton);
		
		moveDownPress(trafficJam,downButton);
		moveUpPress(trafficJam,upButton);
		
		middleButton = createButton(upButtonColumn, upButtonRow + BUTTON_SIZE, BUTTON_SIZE, "stay put", carCode);
		level.getLevel().add(middleButton);
		
		
		}	
		
	}
	
	public void moveDown(int[][] trafficJam){
		if(row <=3  && trafficJam[row+3][column] == 0){
			System.out.println(upButtonRow);
			trafficJam[row][column]=0;
			trafficJam[row+1][column] = 0;
			trafficJam[row+2][column] = 0;
			row=row + 1;
			trafficJam[row][column]=carCode;
			trafficJam[row+1][column] = carCode;
			trafficJam[row+2][column] = carCode;
			upButtonRow = upButtonRow + BUTTON_SIZE;
			System.out.println(upButtonRow);
			upButton.setBounds(upButtonColumn, upButtonRow, BUTTON_SIZE, BUTTON_SIZE);
			middleButton.setBounds(upButtonColumn, upButtonRow + BUTTON_SIZE, BUTTON_SIZE, BUTTON_SIZE);
			downButton.setBounds(upButtonColumn,upButtonRow+BUTTON_SIZE+BUTTON_SIZE, BUTTON_SIZE, BUTTON_SIZE);
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
						moveDown(trafficJam);
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
						moveUp(trafficJam);
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
