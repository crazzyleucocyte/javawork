package 상속;

public class 다형성 {
	/*
	 *다형성이란?
	
	하나의 참조변수로 여러타입의 객체를 참조할 수 있는것
	 *
	 *
	 *class Car(){}
	 *class ChildCar extrnds Car(){}
	 *class main(){
	 *
	 * Car carv=new ChildCar()
	 * ChildCar chCar = (ChildCar)Car()
	 * ChildCar car2=new Car() //오류가 난다
	 * 
	 * new 부모타입을 자식타입에 넣으면 오류가 나지만
	 * new 자식타입을 부모타입네 넣으면 오류가 안나고
	 * new부모타입을 자식타입으로 형변환해서 자식타입에 넣으면 오류가 안난다 
	 * 
	 * 다형성을 하는 이유는 하나의 부모 클래스에서 여러개의 자식 클래스를 만들 수 있다는 장점을 이용해 자식 클래스들을 라이브러리화 하여 사용하는 것이다.
	 * 
	 * _07_polymorphismArray.ProductRun{
	 * 		b.buy(new Tv())가 뜻하는 것은 
		parent p = new Child();
		위와 같은 코드를 뜻하게 된다
		이는 부모 자료형 변수인 p에 자식의 객체를 생성하면 오버라이딩된 메소드들은 모든 자식으로 부터 사용이 가능하므로 매우
		유용한 방식이다.
		}
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.parent();
		System.out.println("-------------");
		//부모 객체 생성 후 부모 메소드 실행
		
		Child c = new Child();
		c.Child();
		c.parent();
		System.out.println("-------------");
		//자식 객체 생성 후 자식 메소드 실행
		
		Parent pe= c;
		pe.parent();//이건 부모꺼입니다.
		pe.parent();
		System.out.println("-------------");
		//부모에 자식을 대입해서 자식 객체를 생성할때 부모 클래스도 같이 생성이 되는데 여기서 자식 객체는 버리고 부모 자료형을
		//택함으로써 부모에서 자식으로 오버라이딩이 된 메소드는 자식 클래스의 것으로 실행 되며
		//부모 클래스에는 없지만 자식 클래스에는 있는 메소드는 실행 되지 않는다.
		
		//부모 클래스를 강제 형변환해서 자식 클래스의 자료형으로 지정하는 방법은 하나로 정해져있다.
		
		
		//중요!!!!!!!!!!!!!!!!!!!!!!!!
		Parent per= new Child();
		Child cild=(Child)per;
		//부모 클래스 변수를 강제 형변환해서 자식 클래스의 자료형으로 지정하려면 위의 코드처럼 해야한다
		//그리고 처름부터 부모 객체로 만들어진 변수라면 자식 자료형으로 형변환 시 에러가 나기 때문에 
		//부모 변수를 자식의 자료형으로 변경하려면 처음부터 부모 객체로 지정된 변수가 아니여야 한다.
		//이때 오류가 발생하지 않도록 if문이나 instanceof를 사용해서 확인 후 사용한다.
		//중요!!!!!!!!!!!!!!!!!!!!!!!!
		
		p=cild;
		Child cil=(Child)p;//처음에 부모 객체로 생성한 변수의 경우 에러가 나지만 자식 객체를 참조하면 가능하다
		cil.Child();
		cil.parent();
		//자식에 부모를 강제 형변환해서 대입한 경우
		//범위가 더 넓은 부모를 자식 자료형으로 형변환 하여 자식 자료형으로 대입한 경우 자식에 있는 모든 메소드와
		//부모에 있는 모든 메소드를 사용 가능하지만 부모에서 자식으로 오버라이딩이 된 경우 자식의 메소드로 실행이 된다.
		
//		Child c = new Child();
		
		
	}
}


class Parent{
	
	Parent(){
		System.out.println("부모");
	}
	void parent() {
		System.out.println("이건 부모입니다.");
	}
}
class Child extends Parent {
	
	Child(){
		System.out.println("자식");
	}
	void Child() {
		System.out.println("이건 자식입니다.");
	}
	void parent() {
		System.out.println("이건 부모꺼입니다.");
	}
}
















