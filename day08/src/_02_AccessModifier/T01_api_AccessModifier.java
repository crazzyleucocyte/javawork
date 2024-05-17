package _02_AccessModifier;

public class T01_api_AccessModifier {

	private int priNum=5;
	
	void setPriNum(int priNum) {
		this.priNum = priNum;
	}
	//private 변수에 값을 지정하는 setter 메소드
	
	int getPriNum() {
		return priNum;
	}
	//private 값을 가져오는 getter 메소드
	
	private void method() {
		System.out.println("private 메소드");
	}
	
	
	
	
}
