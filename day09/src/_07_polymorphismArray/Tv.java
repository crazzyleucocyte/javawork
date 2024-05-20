package _07_polymorphismArray;

public class Tv extends Product {

	Tv() {
		super(300);
		
	}
	
	@Override
	public String toString() {
		return"TV";
		//자바 오브젝트에 있는 메소드로 사용하지 않아도 자동으로 스트링 주소가 출력되도록 만들어져있는것을 
		//우리는 일부러 가져와서 리턴 값을 바꿔준 것이다.
	}//toString을 오브젝트에서 오버라이딩을 해서 가져왔는데 리턴값인 티비를 넣었으니 원래 toString주소가 아닌 Tv의 주소가 나온다
	
}
