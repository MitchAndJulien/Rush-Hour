
public class Level6 {

	public static void main(String[] args) {
		
		ObjectiveCar player = new ObjectiveCar(2, 1, 1, trafficJam, srt);
		
		
		TwoHorzCar car1 = new TwoHorzCar(0, 0, 2, trafficJam, srt);
		
		TwoHorzCar car2 = new TwoHorzCar(1, 0, 3, trafficJam, srt);
		
		TwoHorzCar car3 = new TwoHorzCar(3, 0, 4, trafficJam, srt);
		
		TwoVertCar car4 = new TwoVertCar(3, 2, 5, trafficJam, srt);
		
		TwoVertCar car5 = new TwoVertCar(0, 3, 6, trafficJam, srt);
		
		TwoVertCar car6 = new TwoVertCar(4, 0, 7, trafficJam, srt);
		
		
		ThreeVertCar car7 = new ThreeVertCar(2, 3, 8, trafficJam, srt);
		
		ThreeVertCar car8 = new ThreeVertCar(1, 4, 9, trafficJam, srt);
		
		ThreeVertCar car9 = new ThreeVertCar(1, 5, 10, trafficJam, srt);
		
		ThreeHorzCar car10 = new ThreeHorzCar(5, 3, 2, trafficJam, srt);
		
	}
}
