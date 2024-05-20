package _01_phone;

public class Phone_api {

//	int x;
//	static int y;
	
	String model;
	String color;
	
	Phone_api(String model,String color){
		this.model=model;
		this.color=color;
	}
	
	
	
	
	void bell(){//전화 받는거
		System.out.println("벨이 울립니다.");
	}
	void hangUp() {
		System.out.println("전화를 받습니다.");
	}
	void sendVoice(String message) {
		System.out.println("나 : "+message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방 : "+message);
	}
	void hangOut() {
		System.out.println("전화를 끊습니다.");
	}
	
}
