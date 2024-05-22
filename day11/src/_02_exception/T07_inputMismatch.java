package _02_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T07_inputMismatch {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("정수 3개 입력");
		int sum =0;
		for(int i = 1;i<=3;i++) {
			System.out.println(i +"번째 정수 입력 : ");
			try {
			int num = s.nextInt();
			sum+=num;
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다.");
				String ex = s.nextLine();
				i--;//이 방법으로 예외가 발생 했을때 다시 해당 번째 정수 입력을 받을 수 있다.
			}
		}
		System.out.println("합계 : "+ sum);
		
	}

}
