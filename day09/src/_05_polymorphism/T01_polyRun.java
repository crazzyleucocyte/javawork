package _05_polymorphism;

class A{int a=1;}

class B extends A{int b=2;}

class C extends A{int c=4;}


class D extends B{int d=3;}

class E extends C{int e =5;}

public class T01_polyRun {

	public static void main(String[] args) {
		//자동 형변환 : 자식을 부모 타입으로 형변환
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;//b는 사용하지 않고 A만 사용하겠다
		A a2 = c;//C는 사용하지 않고 A만 사용하겠다
		A a3 = d;//d와 B는 사용하지 않고 A만 사용
		A a4 = e;// e, c 아요안함
		
//		B b1=c;//b와 c는 상속 관계가 아니므로 오류가 난다
//		C c1=d;//c와 d는 상속 관계가 아니므로 오류가 난다
		
		System.out.println(b.a);
		System.out.println(b.b);
		
		System.out.println(a1.a);
//		System.out.println(a1.b);//a1은 b를 사용하지 않는다고 했으므로 오류가 뜬다
		System.out.println(a2.a);//c XXXX
		System.out.println(a3.a);//d,b XXXX
		System.out.println(a4.a);//e,c XXXXX
		
		
		
		
	}

}
