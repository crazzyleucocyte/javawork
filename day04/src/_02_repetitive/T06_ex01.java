package _02_repetitive;

import java.util.Scanner;

public class T06_ex01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
//		//주사위의 숫자 맞추기 게임		
//		//com의 숫자는 1~6		
//		int com =(int)(Math.random()*6+1);//1~6
//				System.out.println(com);
//				
//				int user;
//				int sum=0;
//				int com2;
//				do { System.out.println("\n주사위의 숫자를 맞춰보세요.");
//				com2 = (int)(Math.random()*6+1);
//				user = s.nextInt();
//				if(com2!=user) {
//					System.out.println("틀렸습니다!!\n주사위 눈은"+com2+"였습니다~!");
//					
//				}else {
//					System.out.println("축하합니다 맞추셨습니다~");
//				}
//				sum++;
//					
//				}while(com2!=user);
//				System.out.println(sum+"번 만에 맞추셨습니다~!");
//		
				
				//연습문제 5장의 1번
//		1부터 100까지의 정수 중 5의 배수의 합계를 출력하는 프로그램을 작성하시오. 
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
		
		//2번 1~100까지중 짝수와 홀수의 합을 각각 구하시오
		System.out.println("\n2. 1~100까지중 짝수와 홀수의 합을 각각 구하시오");
		sum=0;
		int sum2 = 0;
		int sum1 =0;
		for(int i=1;i<=100;i++) {
			if(i%2==0)sum2+=i;
			else sum1+=i;
		}
		System.out.println("1~100까지의 짝수의 합은 :"+sum2+"입니다.");
		System.out.println("1~100까지의 홀수의 합은 :"+sum1+"입니다.");
		
		//3번 두 주사위의 눈의 합니 6이 되는 경우룰 모두 출력하시오
		System.out.println("\n3. 주사위 두 개의 눈의 합니 6이 되는 경우의 수는");
		for(int i=1;i<=6;i++) {
			for(int d=1;d<=6;d++) {
				if(i+d==6) {
					System.out.println("("+i+","+d+")");
				}
			}
		}
		//4번이중 for문을 사용하여 아래와 같이 9개의 별로 이루어진 삼각형을 출력하시오
		System.out.println("\n4.이중 for문을 사용하여 아래와 같이 9개의 별로 이루어진 삼각형을 출력하시오");
		int space =0;
		for(int i=1;i<=6;i++) {
			space=6-i;
			for(int sp = 0;sp<=space;sp++) {
				System.out.print(" ");
			}
			for(int d=1;d<i*2;d++) {
				System.out.print("*");
			}System.out.println();
		}
		
		//5번주사위 눈이 6이 될때까지 계속 반복해서 굴리고 주사위 눈이 6이 되면 지금까지 주사위를 굴린 횟수까지 출력하는 코드를 작성 하시오
		System.out.println("\n5.주사위 눈이 6이 될때까지 계속 반복해서 굴리고 주사위 눈이 6이 되면 지금까지 주사위를 굴린 횟수까지 출력하는 코드를 작성 하시오");
		int dice;
		int sum3=1;
		while(true) {
			dice = (int)(Math.random()*6)+1;
			if(dice==6) {
				System.out.println(sum3+"번을 굴려 주사위의 눈이 6이 되었습니다.");
				break;
			}
			System.out.println("("+dice+")");
			sum3++;
		}System.out.println("");
		
		
		
		
		
		
		
		
	}

}
