package _04_Isp;

public class Ambulance implements AmbulanceCar {

	@Override
	public void patientTransport() {
		System.out.println("구급차 환자이송중");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drive() {
		System.out.println("구급차 운전즁");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnLeft() {
		System.out.println("구급차 좌회전");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnRight() {
		System.out.println("구급차 우회전");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		System.out.println("구급차 정지");
		// TODO Auto-generated method stub
		
	}

}
