package _03_overriding;

class Over {
	void show(String str) {
		System.out.println("부모클래스 메소드 : "+str);
	}
}

class OverChild extends Over {
	void show(String avd) {
		System.out.println("자식 클래스 메소드 : "+avd);
	}
}

public class OverridingRun {

	public static void main(String[] args) {
		OverChild ochild = new OverChild();
		ochild.show("자바 프로그래밍");
		
		Over over = new Over();
		over.show("오라클");
		
		
	}

}
