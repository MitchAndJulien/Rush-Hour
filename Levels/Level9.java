
public class Level9 {

	public static void main(String[] args) {
		
		int[][] trafficJam = new int[6][6];
		
		Board srt = new Board();
		
		
		ObjectiveCar car0 = new ObjectiveCar(2, 0, 1, trafficJam, srt);
		
		
		TwoHorzCar car1 = new TwoHorzCar(0, 2, 2, trafficJam, srt);
		
		TwoHorzCar car2 = new TwoHorzCar(0, 4, 3, trafficJam, srt);
		
		TwoHorzCar car3 = new TwoHorzCar(1, 4, 4, trafficJam, srt);
		
		TwoVertCar car4 = new TwoVertCar(4, 2, 5, trafficJam, srt);
		
		TwoVertCar car5 = new TwoVertCar(1, 3, 6, trafficJam, srt);
		
		TwoVertCar car6 = new TwoVertCar(2, 5, 7, trafficJam, srt);
		
		TwoVertCar car7 = new TwoVertCar(4, 5, 8, trafficJam, srt);
		
		
		ThreeHorzCar car8 = new ThreeHorzCar(3, 1, 9, trafficJam, srt);
		
		ThreeVertCar car9 = new ThreeVertCar(3, 0, 10, trafficJam, srt);
		
		ThreeVertCar car10 = new ThreeVertCar(2, 4, 11, trafficJam, srt);
		
		
		srt.createBackground(srt);
		
		car0.finished(trafficJam,car0);
		
	}
}
