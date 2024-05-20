package _02_car;

public class Car {
	
	//속성:
//	power, speed, model, company
	
	//메소드 :시동 켜고 끄기
//	속도 올리고 내리고
	
	String company;
	String model;
	boolean power;
	int speed;
	int speed_l;
	
	Car(){
		
	}
	Car(String company, String model, int speed_l){
		this.company= company;
		this.model=model;
		this.speed_l=speed_l;
	}
	
	void powerOnOff() {
		power= !power;
		speed=0;
		if(power)System.out.println("시동이 켜졌습니다.");
		else System.out.println("시동이 꺼졌습니다.");
	}
	int SpeedUp(int speed) {
		this.speed+=speed;
		if(this.speed>speed_l)this.speed=speed_l;
		return this.speed;
	}
	
	int SpeedDown(int speed) {
		this.speed-=speed;
		if (this.speed<0)this.speed=0;
		return this.speed;
	}
	String information() {
		return "company : "+company+" | model : "+model+" | maximum speed : "+speed_l+"km/h";
	}
	String status() {
		return "시동: "+ (power?"켜짐": "꺼짐")+" \n현재 시속 : "+speed;
	}
	
}
