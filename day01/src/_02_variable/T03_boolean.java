package _02_variable;

public class T03_boolean {

	public static void main(String[] args) {
//boolean 의 true와 false만 출력
		boolean bool01 = true;
		boolean bool02 = false;
		System.out.println(bool01);
		System.out.println(bool02);

		// boolean 사용 예시
		boolean bool03 = 10 < 3;
		System.out.println(bool03);

		// 변수들끼리의 논리 연산 결과도 대입 가능
		int num1 = 10;
		int num2 = 20;
		boolean bool04 = num1 <= num2;
		System.out.println(bool04);

	}

}
