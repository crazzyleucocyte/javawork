package _02_car;

public class AmbulanceCar extends Car {
	//사이렌 울리기
	//응급처치
	boolean siren;
	
	public AmbulanceCar() {
		
	}
	
	public AmbulanceCar(String company, String model, int speed_l) {
		super(company,model,speed_l);
	}
	void powerOnOff() {
		power= !power;
		speed=0;
		if(power)System.out.println("시동이 켜졌습니다.");
		else {
			System.out.println("시동이 꺼졌습니다.");
			sirenOff();
		}
	}
	
	void sirenOn() {
		if(power) {
		siren=true;
		System.out.println("사이렌이 켜졌습니다.");
		} else System.out.println("시동을 켜주세요.");
	}
	void sirenOff() {
		siren=false;
		System.out.println("사이렌이 꺼졌습니다.");
	}
	
	void emergency() {
		sirenOn();
		System.out.println("응급 상황 발생! 응급 처치를 실시합니다!");
	}
	String ambulanceStatus() {
		return super.status()+"\n사이랜 상태 : "+(siren?"켜짐":"꺼짐");
	}
	

}
