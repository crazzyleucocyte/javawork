package _03_overloading;

import java.util.Arrays;

class Aaa{
	int num;
	double dou;
	String str;
	
	Aaa(){
		num=1;
		dou=1.0;
		str="홍길동";
		System.out.println("매개변수가 없는 생성자");
	}
	Aaa(int num){
		this.num=num;
		dou =1.2;
		str ="홍길동";
		System.out.println("매개변수가 1개인 생성자");
	}
	Aaa(int num, String name){
		this.num=num;
		dou =1.2;
		str =name;
		System.out.println("매개변수가 2개인 생성자(int, String)");
	}
	Aaa(int num,double dou){
		this.num=num;
		this.dou =dou;
		str ="홍길동";
		System.out.println("매개변수가 2개인 생성자(int, double)");
	}
	Aaa(int num,double dou,String name){
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





public class T02_main_ConOverlaoding {

	public static void main(String[] args) {

		ThisAaa a1 = new ThisAaa();
		ThisAaa a2 = new ThisAaa(5);
		ThisAaa a3 = new ThisAaa(5,3.2);
//		ThisAaa a5 = new ThisAaa(5,"나야");
		ThisAaa a4 = new ThisAaa(5,3.2,"나");
		int num[]= {5,9,5,98,48,4963,58};
		int num2[]= {5,9};
		a4.method(num[0],num[1]);
		
	}

}
