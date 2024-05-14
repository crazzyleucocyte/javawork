package _03_tv;

public class To1_api_tv {
	String company="GoldStar";
	String model="브라운관 34\"";
	int inch = 34;
	int volume;
	int channel = 1;
	boolean power;
	
	void power() {
		power= !power;
		if(power) System.out.println("tv를 켭니다.");
		else System.out.println("tv를 끕니다.");
	}
	int channelUp() {
		channel++;
		return channel;
	}
	int channelDown() {
		channel--;
		return channel;
	}
	int volume(int volumeInput) {
		volume=volumeInput;
		return volume;
	}
	
	
	
	
	
}
