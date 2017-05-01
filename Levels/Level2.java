
public class Level2 {

	public static void main(String[] args) {
		
		int[][] trafficJam = new int[6][6];
		
		Board srt = new Board();
		
		
		ObjectiveCar car0 = new ObjectiveCar(2, 0, 1, trafficJam, srt);
		
		
		TwoVertCar car1 = new TwoVertCar(0, 0, 2, trafficJam, srt);
		
		TwoVertCar car2 = new TwoVertCar(1, 3, 3, trafficJam, srt);
		
		TwoVertCar car3 = new TwoVertCar(2, 4, 4, trafficJam, srt);
		
		TwoHorzCar car4 = new TwoHorzCar(5, 0, 5, trafficJam, srt);
		
		TwoVertCar car5 = new TwoVertCar(4, 2, 6, trafficJam, srt);
		
		TwoHorzCar car6 = new TwoHorzCar(5, 3, 7, trafficJam, srt);
		
		TwoHorzCar car7 = new TwoHorzCar(4, 4, 8, trafficJam, srt);
		
		
		ThreeHorzCar car8 = new ThreeHorzCar(0, 3, 9, trafficJam, srt);
		
		ThreeHorzCar car9 = new ThreeHorzCar(3, 0, 10, trafficJam, srt);
		
		ThreeVertCar car10 = new ThreeVertCar(1, 5, 2, trafficJam, srt);
		
		
		srt.createBackground(srt);
		
		car0.finished(trafficJam,car0);
		
	}
}
