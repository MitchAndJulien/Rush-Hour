package testme;

public class VerticalCar {
	
	private int posx;
	private int posy;
	private String type;

  
	public VerticalCar(int x, int y) {
		type = "Vertical Car";
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
