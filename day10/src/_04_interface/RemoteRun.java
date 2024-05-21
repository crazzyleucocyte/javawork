package _04_interface;

public class RemoteRun {

	public static void main(String[] args) {
		//인터페이스는 객체 생성 할 수 없다
		//그러나 형변환은 가능
		
//		RemoteControl rc1 =new RemoteControl();//오류가 난다
		Audio audio1 = new Audio();
		audio1.turnOn();
		audio1.turnOff();
		
		RemoteControl rc = audio1;//부모타입(인터페이스) 형변환은 가능하다
		rc.turnOn();
		rc.turnOff();
		
		rc=new Tv();
		rc.turnOn();
		rc.turnOff();
		
		
		
		
	}

}
