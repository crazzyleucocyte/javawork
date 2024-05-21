package _03_abstract;

public class FolderPhone extends Phone {

	FolderPhone(String owner) {
		super(owner);
	}

	@Override
	void turnOn() {
		System.out.println("폰을 열어 전화를 받습니다.");
	}

	@Override
	void turnOff() {
		System.out.println("폰을 닫아 전화를 끊습니다.");
	}

}
