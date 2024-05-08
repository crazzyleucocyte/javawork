package _01_casting;

import java.util.Scanner;

public class T04_Ex01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//1. 문자 하나를 입력받아 그 문자의 유니코드를 출력하기
		System.out.print("문자 하나를 입력해주세요 : ");
		char ch1 = s.next().charAt(0);
		System.out.println((int)ch1);
		//2. 국어, 영어, 수학 점수를 입력받아 총점 출력
//		평균 출력(소수점 2째자리까지 출력)
		System.out.print("국어 점수를 입력해주세요 : ");
		int kor = s.nextInt();
		System.out.print("영어 점수를 입력해주세요 : ");
		int eng = s.nextInt();
		System.out.print("수학 점수를 입력해주세요 : ");
		int mat = s.nextInt();
		int sum =kor+eng+mat;
		double avg = (double)sum/3;
		
		System.out.print("총점은 "+ sum);
		System.out.printf("이고 평균은 %.2f입니다.",avg);
		
		//3. 
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum= 3.0f;
		double dNum = 2.5;
		char ch = 'K';
		
		
//		3.1 iNum1/iNum2의 몫 출력
		System.out.println("\niNum1/iNum2= "+(iNum1/iNum2));
		
//		3.2 iNum2*dNum한 결과를 변수에 넣고 출력하기
		double square = iNum2*dNum;
		System.out.println("iNum2*dNum = "+square);
		
//		3.3 iNum1의 값이 10.0으로 출력되게 하기
		System.out.println("iNum1 = "+(double)iNum1);
		
//		3.4 iNum1/iNum2한 결과 소수점까지 나오게 출력하기
		//double result = (double)iNum1/iNum2;
		System.out.println("iNum1/iNum2= "+((double)iNum1/iNum2));
		
//		3.5 iNum1/fNum한 결과 3이 출력되게 하시오
		System.out.println("iNum1/fNum = "+(iNum1/(int)fNum));
		
//		 3.6  iNum1 / fNum 한 결과 소수점 13자리까지 나오게 하시오
		double dou1 = (double)iNum1/fNum;
		// iNum1에 double를 안했을때는 3.3333332538605이 나왔고 double을 했을때는 3.3333333이 나왔다
		System.out.print("iNum1 / fNum = ");
		System.out.printf("%.13f",dou1);
		
//		   3.7  ch변수의 유니코드 출력하기
		//int result5 = ch;
		System.out.println("\nch변수의 유니코드 : "+(int)ch);
		
//		   3.8  ch변수에 1을 더해 L 이 출력되게 하시오
		//char result6 =(char)(ch+1);
		System.out.println("ch+1= "+(char)(ch+1));
		
	}

}
