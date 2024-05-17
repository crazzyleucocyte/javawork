package _01_static;

public class T01_main_static {

	int a;
	static int b;
	
	
	
	
	public static void main(String[] args) {
		int c;
//		System.out.println(a);//인스턴스 변수로 객체를 생성해야 생성 가능하기 때문에 이대로는 오류가 난다.
//		System.out.println(c);//초기화를 안하고 출력해서 오류가 생김

		//static 클래스 변수, 클래스 메소드는 객체 생성 하지 않아도 사용 가능
		System.out.println(b);
		System.out.println(T01_api_static.nameSt);//정적 변수라서 객체 생성 없이 바로 사용
		System.out.println(T01_api_static.sMe4());
		
		System.out.println("------------------");
		//인스턴스 변수, 인스턴스 메소드는 반드시 객체를 생성해야 사용 가능
		T01_api_static s1= new T01_api_static();
		System.out.println(s1.numIn);
		System.out.println(s1.me2());
		//객체에서도 클래스 변수, 클래스 메소드도 사용 가능
		System.out.println(s1.nameSt);
		System.out.println(s1.sMe4());//되도록이면 static메소드는 변수.~~쓰지 않는것을 권장한다
		
		
		
		
	}

}
