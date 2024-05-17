package _01_static;

public class T01_api_static {
	//인스턴스 필드
	int numIn =3;
	String nameIn = "이턴스";
	
	//정적필드
	static int numSt =10;
	static String nameSt = "김정적";
	
	//인스턴스 메소드
	void me1() {
		System.out.println("인스턴스 메소드 me1()");
		System.out.println(numIn);
		System.out.println(numSt);
		//인스턴스 변수, 메소드, 클래스 변수, 메소드 모두 호출 가능
	}
	String me2() {
		System.out.println("인스턴스 메소드 me2()");
		return "me2";
	}
	
	//정적 메소드
	static void sMe3() {
		//클래스에 저장 공간이 있으므로 객체를 생성하지 않고도 사용 가능
		//인스턴스 변수 사용 불가 : 인스턴스 변수(메소드)는 반드시 객체가 생성 되어야만 사용 가능
		System.out.println("정적 메소드 sMe3()");
		System.out.println(numSt);
//		System.out.println(numIn);//static 메소드에 인스턴스 메소드를 사용할 경우 오류 발생
		//이유는 정적 메소드는 객체를 만들지 않아도 쓸 수 있지만 인스턴스 메소드는 객체를 생성해야 쓸 수 이쓰므로
		//객체 생성이 안 된상태에서 인스턴스 메소드는 사용 할 수 없어서 애러가 난다
	}
	
	static String sMe4() {
		System.out.println("정적 메소드 sMe4()");
		return "sMe4()";
	}
	
}
