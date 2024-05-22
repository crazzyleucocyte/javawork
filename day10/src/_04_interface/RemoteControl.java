package _04_interface;

public interface RemoteControl {
	public static final int MAX_VALUE = 100;
	
	//public static final을 쓰지 않아도 알아서 써주니 일부러 안써도 된다.
	
	int MIN_VALUE	=0;//상수
	
	void turnOff();
	void turnOn();
	void setVolume(int volume);
	
//	void setChannel(int channel);
	//abstract이 생략되어도 보이지 않는것이지 써있음
	
	default void search(String msg) {
		System.out.println("나중에 추가한 메소드"+msg);
	}
	
	
	
	
	
	
	
}
