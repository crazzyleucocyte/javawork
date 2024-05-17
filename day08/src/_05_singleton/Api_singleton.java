package _05_singleton;
	// 싱글톤 : 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 기법
	//DB 연동 할때 한 번 쓴다 
	//      : 실행 클래스에서 객체를 만들지 못하도록 해야함 그래서 객체를 private로 해야한다
	//		  그리고 객체를 api에만 하나 만든다
// 객체를 많이 만들어서 쓸 수도 있지만 그럴 경우 메모리가 너무 커져서 객체를 하나만 만들어서 메모리를 적게 사용하는 방법이다


public class Api_singleton {
	//인스턴스 변수는 객체를 생성하고 나야 쓸 수 있어서 이 파일에 객체를 만들어도 메인에서는 못쓰는데 이걸 정적 변수로 바꿔주면 호출 가능하다
	private static Api_singleton singleton = new Api_singleton();
	//싱글톤의 기본 양식인듯
	
	
	private Api_singleton() {
		System.out.println("객체 생성");
	}
	//반환형이 클래스명
	//인스턴스 메소드도 객체를 만들지 않으면 호출 할 수 없다 그래서 static으로 바꿔준다
	static Api_singleton getSingleton() {
		return singleton;//정적 메소드에서는 정적 필드만 사용 가능 그래서 변수 앞에 static붙여야함
	}
	//메소드에 static을 붙여서 사용하려면 객체에도 static이 붙어야 한다
	//static-정적 Api_singleton 자료형의 getSingleton()메소드 이름
	
	
	
	
	
}
