
public class Level8 {

	public static void main(String[] args) {
		
		int[][] trafficJam = new int[6][6];
		
		Board srt = new Board();
		
		
		ObjectiveCar car0 = new ObjectiveCar(2, 0, 1, trafficJam, srt);
		
		
		TwoHorzCar car1 = new TwoHorzCar(3, 0, 2, trafficJam, srt);
		
		TwoHorzCar car2 = new TwoHorzCar(4, 0, 3, trafficJam, srt);
		
		TwoHorzCar car3 = new TwoHorzCar(5, 0, 4, trafficJam, srt);
		
		TwoHorzCar car4 = new TwoHorzCar(1, 2, 5, trafficJam, srt);
		
		TwoHorzCar car5 = new TwoHorzCar(0, 3, 6, trafficJam, srt);
		
		TwoHorzCar car6 = new TwoHorzCar(3, 4, 7, trafficJam, srt);
		
		TwoVertCar car7 = new TwoVertCar(2, 2, 8, trafficJam, srt);
		
		TwoVertCar car8 = new TwoVertCar(2, 3, 9, trafficJam, srt);
		
		TwoVertCar car9 = new TwoVertCar(1, 4, 10, trafficJam, srt);
		
		TwoVertCar car10 = new TwoVertCar(4, 2, 11, trafficJam, srt);
		
		
		ThreeVertCar car11 = new ThreeVertCar(0, 5, 2, trafficJam, srt);
		
		ThreeHorzCar car12 = new ThreeHorzCar(4, 3, 3, trafficJam, srt);
		
		ThreeHorzCar car13 = new ThreeHorzCar(5, 3, 4, trafficJam, srt);
		
		
		srt.createBackground(srt);
		
		car0.finished(trafficJam,car0);
		
	}
}
