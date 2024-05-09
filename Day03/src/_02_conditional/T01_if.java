package _02_conditional;

import java.util.Scanner;

public class T01_if {

	public static void main(String[] args) {
		// 조건문
		int num1 = 100;
		if (num1 == 100) // ;을 붙이면 if문에 참일 경우 실행하는 코드는 사라지고 조건문만 남게 되고
			System.out.println("100점입니다.");// 이 코드는 if 조건문이 참이든 거짓이든 항상 실행

		if (num1 == 10) {
			System.out.println("100점 입니다.");
			System.out.println("안녕");
		}
		int num2 = 95;
		if (num1 < num2) 
			System.out.println(num1 + "은 " + num2 + "보다 작다.");
		
		System.out.println("if의 조건과 상관 없이 실행");
		
	//사용자로부터 점수를 입력 받아 80점 이상이면 합격입니다. 축하합니다
		Scanner s = new Scanner(System.in);
		System.out.print("점수를 입력해주세요 : ");
		int score = s.nextInt();
		if(score>=80) {
			System.out.println("합격입니다.");
			System.out.println("축하합니다.");
		}
	
	
		
		
		
		
		
		
	
	}

}
