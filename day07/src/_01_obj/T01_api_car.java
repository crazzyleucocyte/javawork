package _01_obj;

public class T01_api_car {
	String company = "삼성";
	String model = "SM7";
	String color = "흰색";
	int speed;
	boolean power;

	void power() {
		power = !power;
		if (power) {
			System.out.println("시동을 켭니다.");
		}else {
			System.out.println("시동을 끕니다.");
		}
	}
	
	int speed(int speed) {
		this.speed+=speed;
		return this.speed;
		//this는 지역변수와 인스턴스 변수의 이름이 같을 때만 사용 다를 경우 굳이 안써도 됨
	}
	
	int speedDown() {
		speed-=5;
		return speed;
	}

}
