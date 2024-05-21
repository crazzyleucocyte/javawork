package _04_super;

class Parent3	{
	int x;
	int z;
	Parent3(){
		System.out.println("부모생성자 호출");
		x=10;
		z=10;
	}

}

class Child3 extends Parent3{
	int x;
	int y;
	Child3(){
		System.out.println("자식생성자 호출");
		x=10*10;
		y=10*10;
	}
	
}

class GrandChild extends Child3{
	int x;
	int b;
	GrandChild(){
		System.out.println("손자 생성자 호출");
		x=10*10*10;
		b=10*10*10*10*10*10;
	}
}


public class To3_SuperRun {

	public static void main(String[] args) {
		GrandChild child = new GrandChild();//자식의 객체를 생성하면 부모와 조부모의 객체도 생성이 된다.
		//객체는 하나만 생성했는데 부모와 자식까지 생성자 메소드가 실행됐다
		System.out.println(child.x);
		System.out.println(child.y);
		System.out.println(child.z);
		System.out.println(child.b);
//		System.out.println(child.super.x);//오류가 난다
		//main에서는 super를 호출 할 수 없고 super는 상속 받은 곳에서만 호출할 수 있다.
		//(여기서는 객체만 생성한 것이므로 super는 사용할 수 없다.)
		
		Child3 child2=new Child3();
		System.out.println(child2.z);
		
		
		
	}

}
