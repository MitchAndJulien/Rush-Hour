package testme;

public class ObjectiveCar extends Car {
	private int posx;
	private int posy;
	private String type;

	public ObjectiveCar(int x1, int x2){
		super(x1,x2);
		//put this with horizontal cars
		type = "Objective Car";
	}
	
	public checkifcomplete(int){
		
	}
	public void moveCar(int x, int y){
		if(validmove==true){
		posx = x;
		posy = y;
		} else {
			System.out.println("Invalid move");
			//make an error sound
		}
	}
	
}
