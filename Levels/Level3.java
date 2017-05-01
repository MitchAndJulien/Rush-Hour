
public class Level3 {

	public static void main(String[] args) {
		
		ObjectiveCar player = new ObjectiveCar(2, 1, 1, trafficJam, srt);
		
		
		TwoHorzCar car1 = new TwoHorzCar(3, 1, 2, trafficJam, srt);
		
		TwoVertCar car2 = new TwoVertCar(4, 1, 3, trafficJam, srt);
		
		TwoHorzCar car3 = new TwoHorzCar(5, 2, 4, trafficJam, srt);
		
		
		ThreeVertCar car4 = new ThreeVertCar(2, 3, 5, trafficJam, srt);
		
		ThreeVertCar car5 = new ThreeVertCar(3, 5, 6, trafficJam, srt);
		
	}
}
