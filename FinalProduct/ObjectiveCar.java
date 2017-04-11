
public class ObjectiveCar extends TwoHorzCar{

	public ObjectiveCar(int row, int column, int code, int[][] trafficJam, Board board){
		super(row, column, code, trafficJam, board);
	}
	
	public boolean finished(int[][] trafficJam, ObjectiveCar obj){
		while(true){
			if(obj.getColumn()>=4){
				System.out.println("you won!");
				return true;
			}else{
				//do nothing
				return false;
			}
		}
	}
}
