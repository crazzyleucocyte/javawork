package _02_conditional;

import java.util.Scanner;

public class T03_multiif {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("점수 입력 : ");
		int score = s.nextInt();

		if (score > 100 || score < 0)
			System.out.println("0부터 100까지만 입력해주세요.");
		else if (score >= 90)
			System.out.println("A학점");
		else if (score >= 80)
			System.out.println("B학점");
		else if (score >= 70)
			System.out.println("C학점");
		else if (score >= 60)
			System.out.println("D학점");
		else
			System.out.println("F학점");

	}

}
