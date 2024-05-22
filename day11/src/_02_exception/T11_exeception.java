package _02_exception;

import java.util.Scanner;

public class T11_exeception {

	public static void main(String[] args) {
		try {
			int[]num = new int[3];
			Scanner s=new Scanner(System.in);
			System.out.println("정수 입력 : ");
			int sum=0;
			for(int i =0;i<num.length;i++) {
				System.out.println(i+1+"번째 정수 입력 : ");
				num[i]=s.nextInt();
				sum+=num[i];
			}
			num[3]=5;
//			int a = 5/0;
			System.out.println("합계 : "+sum);
		} catch (Exception e) {
			//Exception은 모든 예외 클래스의 최상위 클래스
			//모든 예외를 다 받을 수 있다
			System.out.println("예외 발생");
			e.printStackTrace();
			System.out.println("\n");
//			System.out.println(e);
		}
		
		/* Exception쓸때 주의점
		 * 최상위 클래스인 Exception은 다른 catch들 아래에 있어야 한다
		 *
		 *
		 */
		
	}

}
