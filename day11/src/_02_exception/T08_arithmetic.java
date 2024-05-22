package _02_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T08_arithmetic {

	public static void main(String[] args) {

		/*
		 * 사용자로부터 2 수를 입력받아 8 0
		 * 나눈 몫 출력
		 * 나눈 나머지 출력
		 * 
		 */
		
		Scanner s= new Scanner(System.in);
		System.out.print("0을 제외한 두 수를 입력하세요");
		int num1=0;
		int num2=0;
		for(int i = 0;i<1;i++) {
		try {
			num1=s.nextInt();
			num2=s.nextInt();
			int div=num1%num2;
		} catch (InputMismatchException e) {
			System.out.println("잘 못 입력하셨거나 다시 정수 입력해주세요");
			String excep=s.nextLine();
			i--;
		} 
		catch(ArithmeticException e) {
			System.out.println("0을 입력하셨습니다.다시 0이 아닌 정수를 입력해주세요");
			String excep=s.nextLine();
			i--;
		}
		}
		System.out.println("두 수를 나눈 몫은 : "+ (num1/num2));
		System.out.println("두 수를 나눈 몫은 : "+ (num1%num2));
		
		
		
	}

}
