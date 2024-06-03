package _01_Lamda;
//람다식의 반환값은 Object이고 변수에 저장하려면 Object에 저장해야하는데 내가 원하는 메소드를 만들어서 사용하기 위해서는
//Object에 해당 메소드가 존재하지 않아서 사용이 불가능하다 그래서 interface를 하나 만들어 주고 안에 메소드를 하나만 만들어준다
//그리고 그 인터페이스에 있는 하나의 메소드를 오버라이드해서 람다식으로 사용한다.

public class T01_lamda {

	public static void main(String[] args) {
		//람다식을 사용할때 사용하는 interface의 규칙
		//추상 메소드로 구현이 되어있어야함
		//추상 메소드가 반드시 한 개만 있어야 됨
		Mymethod mm1 = new Mymethod() {


			@Override
			public void method() {
				System.out.println("method() call");
			}
			//윗줄에 잇는 애를 아랫쪽에 있는 람다식 코드로 변경했다.
		};
		mm1.method();
		
		mm1=() ->{
			System.out.println("람다에서 출력");
		};
		mm1.method();
		
		mm1=()-> System.out.println("람다2에서 출력");
		mm1.method();
		
	}

}
