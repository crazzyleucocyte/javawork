package _01_conditional;

import java.util.Scanner;

public class T01_switch_case {

	public static void main(String[] args) {

		int num1 = 1; // 0~2만 들어있는 변수
		
		switch(num1) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		}
		
		Scanner s = new Scanner(System.in);
		/*
		System.out.println("숫자 입력(0~2 숫자만) : ");
		int num2 = s.nextInt();
		switch (num2) {
		case 0: 
			System.out.println("0입력함");
			break;
		case 1:
			System.out.println("1입력함");
			break;
		case 2:
			System.out.println("2입력함");
			break;
		default :
			System.out.println("잘못 입력");	
		}
		System.out.println("---------------------------------");
		
		char ch = 'k'; //k, l, p
		switch(ch) {
		case 'k' :
			System.out.println("김씨입니다.");
			break;
		case 'l' :
			System.out.println("이씨입니다.");
			break;
		case 'p' :
			System.out.println("박씨입니다");
			break;
		default :
			System.out.println("성이 김, 이, 박씨가 아닙니다.");
		}

		switch(ch) {
		case 'k' :
			System.out.println("김씨입니다.");
			break;
		case 'l' :
			System.out.println("이씨입니다.");
			break;
		case 'p' :
			System.out.println("박씨입니다");
			break;
		default :
			System.out.println("성이 김, 이, 박씨가 아닙니다.");
		}
		System.out.println("---------------------------------");
		
		int month = 5;
		switch(month) {
		case 1: //이렇게 작성하면 1,12, 2는 모두 겨울 한 번만 나온다
		case 2:
		case 12:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
		case 9, 10,11:
			System.out.println("가을");
		}*/
		System.out.println("---------------------------------");
		
		//문1. 사용자로부터 2수와 연산자를 입력받아 연산결과를 출력하시오
		System.out.println("두 수와 연산자를 입력하시오(2 + 3)");
		int num = s.nextInt();
//		String op = s.next();
		char op = s.next().charAt(0);
		int num3 = s.nextInt();
		
		switch(op) {
		case '+':
			System.out.println(num+" + "+num3+" = "+(num+num3));
			break;
		case '-':
			System.out.println(num+" - "+num3+" = "+(num-num3));
			break;
		case '/':
			System.out.printf("%d %s %d = %.2f\n",num,op,num3,(double)num/num3);
			break;
		case '*':
			System.out.println(num+" * "+num3+" = "+(num*num3));
			break;
		case '%':
			System.out.println(num+" % "+num3+" = "+(num%num3));
			break;
		}
	}

}
