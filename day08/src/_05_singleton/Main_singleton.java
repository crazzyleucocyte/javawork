package _05_singleton;

public class Main_singleton {

	public static void main(String[] args) {
//		객체 생성 불가
//		Api_singleton s1 = new Api_singleton();
		Api_singleton singleton1 = Api_singleton.getSingleton();//객체의 주소가 반환된다
		Api_singleton singleton2 = Api_singleton.getSingleton();//객체의 주소가 반환된다
		Api_singleton singleton3 = Api_singleton.getSingleton();//객체의 주소가 반환된다
		//Api_singleton이 클래스 타입의 자료형이 되어서 Api_singleton 자료형의 singleton변수가 생겼다
		
		if(singleton1==singleton2) System.out.println("같은 객체");
		else System.out.println("다른 객체");
		System.out.println(singleton1);
		//_05_singleton.Api_singleton@626b2d4a
		//     패키지           클래스        주소
	}

}
