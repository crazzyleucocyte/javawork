package _07_polymorphismArray;

public class Computer extends Product {

	Computer() {
		super(120);
		
	}
	
	@Override
	public String toString() {
		return"Computer";
	}//toString을 오브젝트에서 오버라이딩을 해서 가져왔는데 리턴값인 티비를 넣었으니 원래 toString주소가 아닌 Tv의 주소가 나온다
	
}
