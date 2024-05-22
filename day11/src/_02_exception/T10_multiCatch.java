package _02_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T10_multiCatch {

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
//			num[3]=5;
			int a = 5/0;
			System.out.println("합계 : "+sum);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 넘어섬");
		} catch(InputMismatchException e){
			System.out.println("정수만 넣으세요");
		} catch(ArithmeticException e) {
			System.out.println("예외 발생");
		}
		
	}

}
