package _08_polymorphismArrayList;

import java.util.Arrays;

public class ProductRun {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		Tv tv=new Tv();
		Computer com=new Computer();
		GameDevice game = new GameDevice();
		
		b.buy(tv);//이렇게 입력하는것 만으로도 객체가 생성되고 tv의 주소가 넘어간다
		b.buy(com);
		b.buy(game);
		System.out.println("현재 남은 돈 : "+ b.money+"만원");
		System.out.println("보너스 점수 : "+ b.bonusPoint+"점");
		b.buy(new GameDevice());
		System.out.println("현재 남은 돈 : "+ b.money+"만원");
		System.out.println("보너스 점수 : "+ b.bonusPoint+"점");
		/*
		 * 궁금점:
		 * new Tv를 .buy에 넣을떄 강제 형변환은 어떻게 일어나나
		 * toString은 어떤 역할을 하나
		
		_07_polymorphismArray.ProductRun
		b.buy(new Tv())가 뜻하는 것은 
		parent p = new Child();
		위와 같은 코드를 뜻하게 된다
		이는 부모 자료형 변수인 p에 자식의 객체를 생성하면 오버라이딩된 메소드들은 모든 자식으로 부터 사용이 가능하므로 매우
		유용한 방식이다.
		
		 */
		
		
		b.info();
		b.refund(com);
		b.refund(com);
		b.info();
		
	}

}
