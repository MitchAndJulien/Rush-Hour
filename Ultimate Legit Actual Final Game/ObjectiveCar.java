import javax.swing.JFrame;

/**
 * The car that needs to be put in the exit
 * @author julienzhu
 *
 */
public class ObjectiveCar extends TwoHorzCar{

	/**
	 * 
	 * @param row The row to place the left side of the 2D logic layer
	 * @param column The column to place the left side of the 2D logic layer
	 * @param code The color of the Car
	 * @param trafficJam The 2D logic layer
	 * @param level The actual interactive screen
	 */
	public ObjectiveCar(int row, int column, int code, int[][] trafficJam, Level level){
		super(row, column, code, trafficJam, level);
		
	}
}
