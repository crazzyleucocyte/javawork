package _08_polymorphismArrayList;

import java.util.ArrayList;

//물건 살떄

public class Buyer {
	int money=500;
	int bonusPoint;
	ArrayList<Product> cart= new  ArrayList<Product>();
	//객체를 만들어서 쓸떄 사용하는게 리스트<>에 객체를 넣는다
	//<>에는 어떤 객체가 들어와도 된다라는 뜻이다
	//ArrayList는 객체를 생성하는것이다.
	int index = 0;

	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액부족");
			return;//보이드에서 리턴할 경우 그냥 끝난다
		}
		money-= p.price;//내 돈에서 p의 가격만큼 차감
		bonusPoint += p.bonusPoint;//내 포인트 점수에 티비를 샀을떄의 포인트를 추가
		cart.add(p);
		System.out.println(p+"를 구입함");
		
		
	}//제품이 몇 천개가 있어도 위와 같이 Product p 하나면 된다.
	
	void info() {
		int sum=0;
		String list="";//초기화
		
		if(cart.isEmpty()) {
			System.out.println("구입한 제품이 없습니다");
			return;
		}
		
		for(int i  = 0;i<cart.size();i++) {
//			if(cart[i]==null) break; 필요 없음
			Product p1=cart.get(i);//cart라는 list의 i인덱스를 p1에 저장한다.
			sum+=p1.price;
//			sum+=cart[i].price;
			if(i==cart.size()-1)list+=p1;
			else list += p1+", ";
		}System.out.println("\n구입한 총 금액 : "+sum+"만원");
		System.out.println("구입한 목록 : "+list);
	}
	
	void refund(Product p) {
		if(cart.remove(p)) {//p 상품이 cart에 있을 경우 트루가 나와서 제거해야함
			money-=p.price;
			bonusPoint -=p.bonusPoint;
			System.out.println(p+"반품");
		}else {
			System.out.println("구입하지 않은 상품입니다.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
