package _01_phone;

public class PhoneRun_main {

	public static void main(String[] args) {

		SmartPhone_api sPhone1= new SmartPhone_api("note20","white");
		
		System.out.println("model명 : "+sPhone1.model);
		System.out.println("색상 : "+sPhone1.color);
		
		sPhone1.bell();
		sPhone1.hangOut();
		sPhone1.receiveVoice("안녕하세요 홍길동 입니다.");
		sPhone1.sendVoice("네 반가워요");
		sPhone1.hangOut();
		sPhone1.search("java");
		
		Phone_api Phone1=new Phone_api("apple2", "black");
		Phone1.bell();
		Phone1.hangOut();
//		Phone1.search();  사용 못함
		
		
		
	}

}
