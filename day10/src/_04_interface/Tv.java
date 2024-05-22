package _04_interface;

public class Tv implements RemoteControl/*,Inter, Face 이렇게 다중상속*/ {
private int volume;
	
	@Override
	public void turnOn() {
System.out.println("Tv를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VALUE)
			this.volume=RemoteControl.MAX_VALUE;
		else if(volume<RemoteControl.MIN_VALUE)
			this.volume = RemoteControl.MIN_VALUE;
		else
			this.volume = volume;
	
		System.out.println("현재 음량 : "+this.volume);
	}
	
	//인터페이스의 디폴트 메소드
	@Override
	public void search(String msg) {
		System.out.println("msg");
	}

	
}
