package _05_heritance;

class A {
	int aa = 10;
}

class B extends A {
	int bb= 200;
}

class C extends A {
	int cc = 5000;
}

class D extends C{
	int dd=30000;
}


public class T01_main_inheritance {

	public static void main(String[] args) {
//클래스를 만들어도 아래와 같이 객체 생성을 해야 사용 할 수 있다
		A a1 =new A();
		System.out.println("a1.aa : "+a1.aa);
		
		B b1=new B();
		System.out.println("b1.aa : "+b1.aa);
		System.out.println("b1.bb : "+b1.bb);
		
		C c1 = new C();
		System.out.println("c1.cc : "+c1.cc);
		System.out.println("c1.aa : "+c1.aa);
		
		D d1 = new D();
		System.out.println("d1.cc : "+d1.cc);
		System.out.println("d1.aa : "+d1.aa);
		System.out.println("d1.dd : "+d1.dd);
		
		
		
		
		
		
		
		
		
		
	}

}
