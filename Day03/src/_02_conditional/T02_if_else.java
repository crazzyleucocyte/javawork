package _02_conditional;

import java.util.Scanner;

public class T02_if_else {

	public static void main(String[] args) {
		/*
		 * if(조건식) { 조건이 참일때 실행할 프로그램 ㄹㄹㄴㅁ
		 * } else { 조건이 거짓일떄 실행할 프로그램 }
		 */
		int num1 = 100;
		if (num1 >= 0)
			System.out.println("양수");
		else
			System.out.println("양수가 아니다.");
		// 실행할 프로그램이 한 줄 이상이면 중괄호를 반드시 넣어야 한다
		int score = 98;
		if (score >= 80) {
			System.out.println("축하합니다");
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다.");
			System.out.println("다음 기회에...");
		}
		//사용자로부터 숫자 하나를 입력받아 짝수, 홀수 출력
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int num = s.nextInt();
		if((num%=2)==0) 
			System.out.println("짝수 입니다.");
		else
			System.out.println("홀수 입니다.");
		
		
		

	}

}
