package _02_repetitive;

import java.util.Scanner;

public class T03_while {

	public static void main(String[] args) {

		// while(조건식) {
//		조건식이 참일때 수행
		for (int i = 1; i <= 3; i++) {
			System.out.println(i);
		}
		int i = 1;
		while (i <= 3) {
			System.out.println(i);
			if (i == 1) {
				break;
			}
			i++;
		}
		int sum=0;
		for(int j = 1;j<100;j++) {
			sum+=j;
		}
		System.out.println("1부터 100까지 합 : "+sum);
		
		
		sum = 0;
		int j = 1;
		while(j<100) {
			sum+=j++;
			
		}System.out.println("1부터 100까지 합 : "+ sum);
		
		int x = 10;
		while(x-- != 0) {
			System.out.println(x);
			
		}
		System.out.println("--------------------------------");
		
//while은 true라서 무한 반복이지만 if에서 5가 됐을때 빠져나온다		
		
		int count =0;
		while(true) {
			System.out.println(++count);
			if(count==5) {
				break;
			}
			
		}
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("멈추려면 'Q'를 넣으시오 : ");
			char input = s.next().charAt(0);
			if(input =='q'||input=='Q') break;
		}System.out.println("탈출!");
		//사용자로부터 연산할 2 숫자와 연산자를 입력받아 그 결과를 출력
		//연산자에 @를 넣으면 멈추고 그렇지 않으면 계속 입력을 받아서 결과를 출력
		
		while(true) {
			System.out.println("두 숫자와 연산자를 입력하시오\nex)+ 4 9  :");
			char ch2 = s.next().charAt(0);
			int fnum = s.nextInt();
			int snum = s.nextInt();
			
			switch (ch2) {
			case '+': 
				System.out.println(fnum + " + "+ snum+" = "+(fnum+snum));
				System.out.println("그만하시려면 연산자 대신 '@'를 입력하시오\n");
				continue;
			case '-':
				System.out.println(fnum + " - "+ snum+" = "+(fnum-snum));
				System.out.println("그만하시려면 연산자 대신 '@'를 입력하시오\n");
				continue;
			case '@':
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("설명을 잘 읽으시고 입력해주세요\n");
				continue;
			
			}break;
			
		}
		
		
		
		
		
		
		
	}

}
