package _03_overloading;

import java.util.Arrays;

class ThisAaa{//같은 패키지 안에 같은 이름을 가진 클래스는 존재할 수 없다
	int num;
	double dou;
	String str;
	
	
	//생성자에서 this() : 다른 생성자 호출
	//this()는 맨 첫줄에 있어야 됨
	
	ThisAaa(){
		this(1,1.0,"홍길동"); //ThisAaa(int num,double dou,String name)를 호출했음
//		num=1;
//		dou=1.0;
//		str="홍길동"; //위에서 this로 호출해서 다시 쓸 필요가 없다
		System.out.println("매개변수가 없는 생성자");
	}
	ThisAaa(int num){
		this.num=num;
		dou =1.2;
		str ="홍길동";
		System.out.println("매개변수가 1개인 생성자");
	}
	
	ThisAaa(int num,double dou){
		this(num,dou,"홍길동");
		System.out.println("매개변수가 2개인 생성자(int, double)");
	}
	ThisAaa(int num,double dou,String name){
		this.num=num;
		this.dou =dou;
		str =name;
		System.out.println("매개변수가 3개인 생성자(int, double, String)");
	}
	
	void method(int... num) {
		System.out.println("인자가 0개 이상");
		System.out.println(Arrays.toString(num));
		//이렇게 하고 main에 있는 배열을 인수로 쓸 경우 배열 출력 가능 
	}
	void method(int num, String... str) {
	//인수가 몇 개가 올지 모를때 가변인자를 쓴다 이때 앞에 있는 int형 num은 반드시 들어와야 한다 ...은 0개 이상을 뜻한다
	}
//	void method(String... str, String num) {
//	//오류 발생 가변인자는 항상 앞에 있어야 한다 왜냐하면 ...은 끝이 없기 때문에 아무리 써도 num은 들어갈 수 없다
//	}	
	
	void method(String name, int num, String... str) {
		
	}
	
	
	
}






public class T03_main_ThisConOverlaoding {

	public static void main(String[] args) {

		ThisAaa a1 = new ThisAaa();
//		ThisAaa a2 = new ThisAaa(5);
//		ThisAaa a3 = new ThisAaa(5,3.2);
//		ThisAaa a4 = new ThisAaa(5,3.2,"나");
	}

}
