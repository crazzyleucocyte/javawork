package _06_static;

public class T01_api_static {
	//인스턴스 필드(속성)
	int num=10;  //변수
	final int MAX=25; //상수
	//상수 변수는 다 대분자로 쓰는게 국룰이다 final을 붙이면 상수가 되어 변경이 불가능하다
	
	void method1() {//매개변수도 지역변수이다
		//지역변수
		int me1 =3;
	}
	
	//정적 필드(정적 속성)
	static int sNum=20;
	static String sName = "강감찬";
	
	
	
	
}
