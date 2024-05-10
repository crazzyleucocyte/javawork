package _02_repetitive;

public class T01_for {

	public static void main(String[] args) {
		// 반복문
		/*
		 * 반복문 3가지 : for, while, do-while 특정한 규칙이 있는것들을 반복하여 사용할때
		 */
//		for(초기화;조건식;증감식){
//			실행문	
//	}

		for (int i = 1; i <= 3; i++) {
			System.out.println(i + ". 안녕하세요");
		}
		// 스택 메모리에 for을 할당하고 그 안에 변수 i를 할당하고 1로 초기화 한다
		// for문의 반복이 끝나고 나면 메모리에서 for이 사라지고 이후에 변수i또한 출력이 되지 않는다
		System.out.println("-------------------------------------");
		
		for (int i = 1; i <= 9; i+=2) {
			System.out.println(i + "번 출력");
		}
		System.out.println("-------------------------------------");

		for(int i = 10;i>=1;i--) {
			System.out.println((11-i) + "번 출력");
			
		}
		
		//1~100까지의 합계를 구하시오
		
		System.out.println("-------------------------------------");
		int sum = 0;
		for(int i =1;i<=100;i++) {
			sum+=i;
		}
		System.out.println("1부터 100까지의 합  : "+sum);
		
		for(int i =1;i<=100;i++) {
			int sum1=0;
			sum=+1;
		}
		//이 경우 한번 돌떄마다 매번 변수를 선언하는데에는 오류가 나지 않지만 
//		sum1이 0으로 초기화 되고 i의 값과 같아지기 떄문에 sum1=i가 된다
//		for에 쓰이는 i는 지역변수이다
		
		sum=0;
		for(int i=1;i<=10;i++) {
			if((i%3)==0) {
				sum+=i;
			}
		}System.out.println("1부터 10까지 3의 배수의 합 : "+sum);
		
		
		
		
		
		
		
		
		
		
		
	}

}
