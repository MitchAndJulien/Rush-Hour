
public class Level5 {

	public static void main(String[] args) {
		
		ObjectiveCar player = new ObjectiveCar(2, 1, 1, trafficJam, srt);
		
		
		TwoHorzCar car1 = new TwoHorzCar(0, 0, 2, trafficJam, srt);
		
		TwoVertCar car2 = new TwoVertCar(4, 0, 3, trafficJam, srt);
		
		TwoVertCar car3 = new TwoVertCar(0, 5, 4, trafficJam, srt);
		
		TwoVertCar car4 = new TwoVertCar(2, 5, 5, trafficJam, srt);
		
		TwoHorzCar car5 = new TwoHorzCar(4, 4, 6, trafficJam, srt);
		
		TwoHorzCar car6 = new TwoHorzCar(5, 4, 7, trafficJam, srt);
		
		
		ThreeVertCar car7 = new ThreeVertCar(1, 0, 8, trafficJam, srt);
		
		ThreeHorzCar car8 = new ThreeHorzCar(3, 1, 9, trafficJam, srt);
		
		ThreeVertCar car9 = new ThreeVertCar(0, 3, 10, trafficJam, srt);
		
		ThreeVertCar car10 = new ThreeVertCar(1, 4, 2, trafficJam, srt);
		
	}
}
