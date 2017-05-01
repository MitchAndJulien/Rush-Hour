
public class Level10 {

	public static void main(String[] args) {
		
		int[][] trafficJam = new int[6][6];
		
		Board srt = new Board();
		
		
		ObjectiveCar car0 = new ObjectiveCar(2, 1, 1, trafficJam, srt);
		
		
		TwoHorzCar car1 = new TwoHorzCar(0, 0, 2, trafficJam, srt);
		
		TwoHorzCar car2 = new TwoHorzCar(1, 0, 3, trafficJam, srt);
		
		TwoVertCar car3 = new TwoVertCar(0, 2, 4, trafficJam, srt);
		
		TwoHorzCar car4 = new TwoHorzCar(0, 4, 5, trafficJam, srt);
		
		TwoHorzCar car5 = new TwoHorzCar(5, 0, 6, trafficJam, srt);
		
		TwoVertCar car6 = new TwoVertCar(4, 3, 7, trafficJam, srt);
		
		TwoHorzCar car7 = new TwoHorzCar(4, 4, 8, trafficJam, srt);
		
		TwoHorzCar car8 = new TwoHorzCar(5, 4, 9, trafficJam, srt);
		
		
		ThreeVertCar car9 = new ThreeVertCar(2, 0, 10, trafficJam, srt);
		
		ThreeVertCar car10 = new ThreeVertCar(1, 5, 2, trafficJam, srt);
		
		ThreeHorzCar car11 = new ThreeHorzCar(3, 1, 3, trafficJam, srt);
		
		
		srt.createBackground(srt);
		
		car0.finished(trafficJam,car0);
		
	}
}
