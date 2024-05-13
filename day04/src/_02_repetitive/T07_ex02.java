package _02_repetitive;

public class T07_ex02 {

	public static void main(String[] args) {

		
		//bool p111
		//1.
		//1부터 100까지의 정수 중 5의 배수의 합계를 출력하는 프로그램을 작성하시오. 
//		 
//		아래 코드에서 반복문을 이용하여 합계 연산을 처리하는 코드를 추가하시오
		System.out.println("1. 1부터 100까지의 정수 중 5의 배수의 합계를 출력하는 프로그램을 작성하시오.");
		int sum=0;
		for(int i=0;i<=100;i++) {
			if((i%5)==0) {
				sum+=i;
			}
		}
		System.out.println("1부터 100까지 5의 배수의 합은"+sum+"입니다.");
		
		//혹은
		
		//1부터 100까지의 정수 중 5의 배수의 합계를 출력하는 프로그램을 작성하시오. 
//		 
//		아래 코드에서 반복문을 이용하여 합계 연산을 처리하는 코드를 추가하시오
		System.out.println("1. 1부터 100까지의 정수 중 5의 배수의 합계를 출력하는 프로그램을 작성하시오.");
		sum=0;
		for(int i=5;i<=100;i+=5) {
				sum+=i;
		}
		System.out.println("1부터 100까지 5의 배수의 합은"+sum+"입니다.");
		
		System.out.println("1부터 100까지 5의 배수의 합은"+sum+"입니다.");
		
		
		
	}

}
