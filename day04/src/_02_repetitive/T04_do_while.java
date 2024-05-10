package _02_repetitive;

import java.util.Scanner;

public class T04_do_while {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		/*do {
			실행문
		}while(조건식)
		
		*-조건을 나중에 확인 하므로 조건과 상관 업이 1번은 반드시 실행
		*
		*/

		boolean b1 = false;
		while (b1) {
			System.out.println("while 조건문");
		}
		do {

			System.out.println("while 조건문");
		} while (b1);

		// 사용자로부터 숫자를 받아서 설명을 써주고 원하는것을 사용자가 선택할 수 있도록 하는 프로그램
		int input = 0;
		do {
			System.out.println("1. for문 설명, 2.while문 설명, 3.do-while문 설명, 0을 선택하면 끝내기");
			input = s.nextInt();
			switch (input) {
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break;
			case 1:
				System.out.println("for문을 선택하셨습니다.\nfor문은 조건의 횟수가 정해져 있을 떄 사용하면 좋음");
				break;
			case 2:
				System.out.println("while문을 선택하셨습니다.\nwhile문은 특정 조건에 도달했을때 break를 이용하여 끝낵때 사용하면 좋음");
				break;
			case 3:
				System.out.println("do-while문을 선택하셨습니다.\ndo-while문은 조건을 나중에 확인하므로 무조건 1번은 실행");
				break;
			}

		} while (input != 0);

		
		
	}

}
