package _03_Scanner;

import java.util.Scanner;

public class T02_Ex01 {

	public static void main(String[] args) {
        //국어, 컴퓨터, 수학 점수를 입력받아 저장하고
		// 총점과 평균을 출력하세요
		Scanner s = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		int korScore = s.nextInt();
		System.out.print("컴퓨터 점수를 입력하세요 : ");
		int comScore = s.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int matScore = s.nextInt();
		int sum = korScore+comScore+matScore;
		System.out.println("세 과목의 총점은 : "+sum+" 평균은 : "+(sum/3));

	}

}

