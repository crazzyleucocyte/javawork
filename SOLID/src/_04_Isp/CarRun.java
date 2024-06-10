package _04_Isp;

public class CarRun {

	public static void main(String[] args) {
		
		FireCar fire = new FireEngine();
		
		AmbulanceCar ambul = new Ambulance();
		
		Car sedan = new Sedan();
		
		fire.drive();
		fire.turnLeft();
		fire.turnRight();
		fire.stop();
		fire.water();
		
		ambul.drive();
		ambul.turnLeft();
		ambul.turnRight();
		ambul.stop();
		ambul.patientTransport();
		
		sedan.drive();
		sedan.turnLeft();
		sedan.turnRight();
		sedan.stop();
		
		
	}

}
