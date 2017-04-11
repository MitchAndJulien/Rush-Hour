import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import javax.swing.JFrame;

//slowly taking shape...:)

public class Driver{

	public static void main(String[] args) {
		
		int[][] trafficJam= new int[6][6];
		
		Board srt=new Board();
		
		ObjectiveCar car0=new ObjectiveCar(1,1,10,trafficJam,srt);
		TwoHorzCar car1=new TwoHorzCar(0,1,1,trafficJam,srt);
		//TwoHorzCar car2=new TwoHorzCar(4,4,2,trafficJam,srt);
		ThreeHorzCar car3=new ThreeHorzCar(2,2,3,trafficJam,srt);
		TwoVertCar car4 =new TwoVertCar(3,2,3,trafficJam,srt);
		//Yay finally got all buttons onto one jFrame
		
		//this is the way to go it appears...
		

		srt.createBackground(srt);
		
		
		
		
		/**
		 * this does not work...
		 */
		car0.finished(trafficJam,car0);
		
		
		
		
		
		
		/**
		 * this is some testing to see some stuff
		 * 1. to see if I can manually add in "buttons" for background (complete)
		 * 2. to see finishing congratulations.
		 */
		
//		while(z=true){
//			for(int x=0;x<=5;x++){
//				if(trafficJam[x][5]==10){
//					System.out.println("yay");
//					JFrame level=new JFrame();
//					level.setSize(1300,1000);
//					level.setLayout(null);
//					z=false;
//					break;
//				}
//			}
//		}

	//the way the gui will work is that it gets the array of ints, then
	//for ones it colors it red, blue for twos...
	//we will assume that the developers(us) know about car conflicts...	
		
	}
}
