
public class Level4 {

	public static void main(String[] args) {
		
		ObjectiveCar player = new ObjectiveCar(2, 1, 0, trafficJam, srt);
		
		
		TwoVertCar car1 = new TwoVertCar(3, 2, 0, trafficJam, srt);
		
		TwoVertCar car2 = new TwoVertCar(4, 5, 0, trafficJam, srt);
		
		
		ThreeVertCar car3 = new ThreeVertCar(0, 0, 0, trafficJam, srt);
		
		ThreeVertCar car4 = new ThreeVertCar(0, 3, 0, trafficJam, srt);
		
		ThreeHorzCar car5 = new ThreeHorzCar(3, 3, 0, trafficJam, srt);
		
		ThreeHorzCar car6 = new ThreeHorzCar(5, 2, 0, trafficJam, srt);
		
	}
}
