
public class Level4 {

	public static void main(String[] args) {
		
		ObjectiveCar player = new ObjectiveCar(2, 1, 1, trafficJam, srt);
		
		
		TwoVertCar car1 = new TwoVertCar(3, 2, 2, trafficJam, srt);
		
		TwoVertCar car2 = new TwoVertCar(4, 5, 3, trafficJam, srt);
		
		
		ThreeVertCar car3 = new ThreeVertCar(0, 0, 4, trafficJam, srt);
		
		ThreeVertCar car4 = new ThreeVertCar(0, 3, 5, trafficJam, srt);
		
		ThreeHorzCar car5 = new ThreeHorzCar(3, 3, 6, trafficJam, srt);
		
		ThreeHorzCar car6 = new ThreeHorzCar(5, 2, 7, trafficJam, srt);
		
	}
}
