
public class Level1 {

	public static void main(String[] args) {
		
		ObjectiveCar player = new ObjectiveCar(2, 1, 0, trafficJam, srt);
		
		
		TwoHorzCar car1 = new TwoHorzCar(0, 0, 0, trafficJam, srt);
		
		TwoHorzCar car2 = new TwoHorzCar(4, 4, 0, trafficJam, srt);
		
		TwoVertCar car3 = new TwoVertCar(4, 0, 0, trafficJam, srt);
		
		
		ThreeVertCar car4 = new ThreeVertCar(1, 0, 0, trafficJam, srt);
		
		ThreeVertCar car5 = new ThreeVertCar(0, 5, 0, trafficJam, srt);
		
		ThreeVertCar car6 = new ThreeVertCar(1, 3, 0, trafficJam, srt);
		
		ThreeHorzCar car7 = new ThreeHorzCar(5, 2, 0, trafficJam, srt);
		
	}
}
