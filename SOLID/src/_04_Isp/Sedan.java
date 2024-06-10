package _04_Isp;

public class Sedan implements Car{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("세단 운전즁");
		
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		System.out.println("세단 좌회전");
		
	}

	@Override
	public void turnRight() {
		System.out.println("세단 우회전");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		System.out.println("세단 정지");
		// TODO Auto-generated method stub
		
	}

}
