package _01_casting;

import java.util.Scanner;

public class T05_Ex02 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
//	1. 이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
	System.out.print("이름을 입력하세요 : ");
	String name = s.nextLine();
	System.out.print("성별을 입력하세요(남/여) : ");
    String gender = s.nextLine();
    System.out.print("나이를 입력하세요 : ");
    int age = s.nextInt();
    System.out.print("키를 입력하세요(cm) : ");
	double height = s.nextDouble();
	System.out.println("");
	System.out.println("키 "+height+"인 "+age+"살 "+gender+" "+name+"님 반갑습니다^^");
//
//		   ex.
//		   이름을 입력하세요 : 아무개
//		   성별을 입력하세요(남/여) : 남
//		   나이를 입력하세요 : 20
//		   키를 입력하세요(cm) : 180.5
//
//		   키 180.5cm인 20살 남자 아무개님 반갑습니다^^
//
//		2. 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
	System.out.print("첫번째 정수를 입력해주세요 : ");
	int num1 = s.nextInt();
	System.out.print("두번째 정수를 입력해주세요 : ");
	int num2 = s.nextInt();
	
	System.out.println("\n더하기 결과 : "+(num1+num2));
	System.out.println("빼기 결과 : "+(num1-num2));
	System.out.println("곱하기 결과 : "+(num1*num2));
	System.out.println("나누기 몫 결과 : "+(num1/num2));
	
	
//
//		   ex.
//		   첫 번째 정수 : 23
//		   두 번째 정수 : 7
//
//		   더하기 결과 : 30
//		   빼기 결과 : 16
//		   곱하기 결과 : 161
//		   나누기 몫 결과 : 3
//
//		3. 키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
//		   계산 공식 ) 면적 : 가로 * 세로
//			     둘레 : (가로 + 세로) * 2
	System.out.print("사각형의 가로 값을 입력해주세요");
	double row = s.nextDouble();
	System.out.print("사각형의 세로 값을 입력해주세요");
	double col = s.nextDouble();
	System.out.println("\n사각형의 면적 : "+(row*col));
	System.out.println("사각형의 둘레 : "+((row+col)*2));
	
//
//		   ex.
//		   가로 : 13.5
//		   세로 : 41.7
//
//		   면적 : 562.95
//		   둘레 : 110.4
//
//		4. 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
	System.out.print("\n문자열을 입력하세요 : ");
	String str=s.next(); //nextLine로 했을때는 오류가 났다
	char ch1 = str.charAt(0);
	char ch2 = str.charAt(1);
	char ch3 = str.charAt(2);
	System.out.println("\n첫 번째 문자 : "+ch1+"\n두 번째 문자 : "+ch2+"\n세 번째 문자 : "+ch3);
	
//
//		   ex.
//		   문자열을 입력하세요 : apple
//
//		   첫 번째 문자 : a
//		   두 번째 문자 : p
//		   세 번째 문자 : p
	}

}
