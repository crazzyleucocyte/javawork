package _06_polymorphismEx;

public class Tv extends Product {

	Tv() {
		super(300);
		
	}
	
	@Override
	public String toString() {
		return"TV";
	}//toString을 오브젝트에서 오버라이딩을 해서 가져왔는데 리턴값인 티비를 넣었으니 원래 toString주소가 아닌 Tv의 주소가 나온다
	
}
