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

		
		srt.createBackground(srt);
		
		car0.finished(trafficJam,car0);
	}
}
