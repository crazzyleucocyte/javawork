package _05_polymorphism;

class Parent{
	void method1() {
		System.out.println("Parent method1()");
	}
	void method2() {
		System.out.println("Parent method2()");
	}
	
}

class Child extends Parent{
	@Override//언오테이션...?? 오류가 있나 확인해주는애? 실수를 줄여준다
	void method2() {
		System.out.println("child method2()");
	}
	void method3() {
		System.out.println("child method3()");
	}
}


public class T02_polyRun {

	public static void main(String[] args) {
//		Child child = new Child();
//		Parent parent = child;
		//위에꺼를 한 줄로 줄이면
		Parent parent2 = new Child();
		parent2.method1();
		//주의!! 오버라이딩한 메소드는 형변환과 상관 없이 무조건 객체를 생성한 곳에 들어있는 메소드 호출
		parent2.method2();
		
		
		
		
		
		
	}

}
