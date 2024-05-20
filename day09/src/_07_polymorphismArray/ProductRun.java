package _07_polymorphismArray;

import java.util.Arrays;

public class ProductRun {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		b.buy(new Tv());//이렇게 입력하는것 만으로도 객체가 생성되고 tv의 주소가 넘어간다
		b.buy(new Computer());
		b.buy(new GameDevice());
		System.out.println("현재 남은 돈 : "+ b.money+"만원");
		System.out.println("보너스 점수 : "+ b.bonusPoint+"점");
		b.buy(new GameDevice());
		System.out.println("현재 남은 돈 : "+ b.money+"만원");
		System.out.println("보너스 점수 : "+ b.bonusPoint+"점");
		/*
		 * 궁금점:
		 * new Tv를 .buy에 넣을떄 강제 형변환은 어떻게 일어나나
		 * toString은 어떤 역할을 하나
		 */
		
		b.info();
	}

}
