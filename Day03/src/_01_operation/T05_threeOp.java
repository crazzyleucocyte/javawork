package _01_operation;

import java.util.Scanner;

public class T05_threeOp {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 7;
		//삼항연산자 : 조건식 ? 조건이 참일때 실행 : 조건이 거짓일때 실행
		
		String result = num1 < num2 ? "num1의 숫자가 더 작다":"num1의 숫자가 더 크다";
		System.out.println(result);
		System.out.println(num1 < num2 ? "num1의 숫자가 더 작다":"num1의 숫자가 더 크다");
		
		
		//숫자를 무조건 양수로 출력
		int num3 = -8;
		int re2 = num3<0? -num3:num3;
		System.out.println("절대값 : "+re2);
		
		//사용자로부터 점수를 입력 받아서 80점이상이면 합격, 그렇지 않으면 불합격 출력
		
		Scanner s = new Scanner(System.in);
		System.out.print("당신의 점수를 입력해주세요 : ");
		int score = s.nextInt();
		String pOrf = score>=80?"합격입니다.":"불합격입니다.";
		System.out.println("당신은 "+pOrf);
		
		String pf=
				score>=90 ? "A": 
				score>=80 ? "B": 
				score>=70 ? "C":
				score>=60 ? "D":"F";
		System.out.println(pf);
	}

}
