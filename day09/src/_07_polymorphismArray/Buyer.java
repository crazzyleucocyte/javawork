package _07_polymorphismArray;

//물건 살떄

public class Buyer {
	int money=500;
	int bonusPoint;
	Product cart[]= new  Product[10];
	int index = 0;

	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액부족");
			return;//보이드에서 리턴할 경우 그냥 끝난다
		}
		money-= p.price;//내 돈에서 p의 가격만큼 차감
		bonusPoint += p.bonusPoint;//내 포인트 점수에 티비를 샀을떄의 포인트를 추가
		cart[index++] = p;
		System.out.println(p+"를 구입함");
		
		
	}//제품이 몇 천개가 있어도 위와 같이 Product p 하나면 된다.
	
	void info() {
		int sum=0;
		String list="";//초기화
		for(int i  = 0;i<cart.length;i++) {
			if(cart[i]==null) break;
			
			sum+=cart[i].price;
			if(i==index-1)list+=cart[i];
			else list += cart[i]+", ";
		}System.out.println("\n구입한 총 금액 : "+sum+"만원");
		System.out.println("구입한 목록 : "+list);
	}
	
	
}
