package _06_polymorphismEx;

//물건 살떄

public class Buyer {
	int money=1000;
	int bonusPoint;
	
//	void buy(Computer com) {
//		
//	}
//	void buy(Tv tv) {
//		
//	}
//	void buy(GameDevice game) {
//		
//	}이렇게 하면 너무 비효율적이여서 강제 형변환을 해서 아래와 같이 한다 

	void buy(Product p) {
		money-= p.price;//내 돈에서 tv의 가격만큼 차감
		bonusPoint += p.bonusPoint;//내 포인트 점수에 티비를 샀을떄의 포인트를 추가
		System.out.println(p+"를 구입함");
		
		
	}//제품이 몇 천개가 있어도 위와 같이 Product p 하나면 된다.
	
	
	
}
