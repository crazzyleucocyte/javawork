package _02_abstract;

import java.util.Scanner;

public class PetRun {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		System.out.println("구매를 원하시는 동물에 맞는 번호를 입력해주세요 \n1. 고양이 \n2. 구피 \n3. 게");
//		int menu=input.nextInt();
//		switch(menu) {
//		case 1:
//			Pet cat;
//			while(true) {
//			System.out.println("고양이를 선택하셨습니다.");
//			System.out.println("구매를 원하시는 고양이의 종류와 색과 특징을 입력해주세요");
//			String kind=input.next();
//			String color=input.next();
//			String feature=input.next();
//			cat=new Cat(kind,color,feature);
//			System.out.println("입력하신 정보가 맞습니까?(y/n)");
//			System.out.println(cat.info());
//			char yOrn =input.next().charAt(0);
//			if(yOrn=='y') {
//				System.out.println("고양이의 특징과 울음소리를 들려드리겠습니다.");
//				break;
//			}
//			else {
//				System.out.println("다시 입력해주세요");
//				continue;
//			}
//			}cat.sound();
//			cat.feature();
//			
//		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		
		
		
		Pet pet1=new Cat("삼색이","흰색, 노란색, 검정색","귀여움");
		pet1.info();
		pet1.sound();
		pet1.feature();
		System.out.println(pet1);
		System.out.println();
		
		Pet pet2=new Crab();
		pet2.info();
		pet2.sound();
		pet2.feature();
		System.out.println(pet2);
		System.out.println();
		
		Pet pet3=new Gupy();
		pet3.info();
		pet3.sound();
		pet3.feature();
		System.out.println(pet3);
		
		
		
		
		
		
	}
}
