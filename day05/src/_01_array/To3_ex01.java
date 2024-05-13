package _01_array;

import java.util.Scanner;

public class To3_ex01 {

	
	
	public static void main(String[] args) {
		// 사용자로부터 5사람의 국어, 수학, 컴퓨터 점수 입력
		Scanner s = new Scanner(System.in);
		int score[][]=new int[3][4];
		
		int kor=0;
		int mat=0;
		int com=0;
		int sum = kor+mat +com;
		
		for(int i =0; i<score.length;i++) {
			System.out.println(i+1+"번째 학생의 ");
			kor=mat=com=sum=0;
			for(int j =0; j<score[i].length-1;j++) {
				switch (j) {
				case 0: 
					System.out.print("국어 점수를 입력해주세요 : ");
				    kor=s.nextInt();
				    score[i][j]=kor;
				    break;
				case 1:
					System.out.print("수학 점수를 입력해주세요 : ");
					mat = s.nextInt();
					score[i][j]=mat;
					break;
				case 2 :
					System.out.print("컴퓨터 점수를 입력해주세요 : ");
					com = s.nextInt();
					score[i][j]=com;
					break;
				default:
				}sum=kor+mat+com;
				score[i][3]=sum;
			}
		}
		System.out.print("\n번호  국어  수학   컴퓨터  총점  평균\n_________________________________________\n");
		for(int i =0;i<score.length;i++) {
			System.out.print(" "+(i+1)+"   ");
			for(int j=0;j<score[i].length;j++) {
				System.out.printf(" %2d  ",score[i][j]);
			}System.out.printf("%.2f",(double)score[i][3]/3);
			System.out.println();
		}
		
			int score1[][]= new int [3][3];
		for(int i = 0;i<score1.length;i++) {
			System.out.print(i+1+".번쨰 학생 국어, 수학, 컴퓨터 점수 입력 : ");
			for(int j=0; j<score1[i].length;j++) {
				score1[i][j]= s.nextInt();
			}
		}System.out.println();
		int sum1=0;
		System.out.println("번호\t국어\t수학\t컴퓨터\t총점\t평균");
		System.out.println("---------------------------------------------");
		for(int i = 0;i<score1.length;i++) {
			sum1=0;
			System.out.print(i+1+"\t");
			for(int j=0;j<score1[i].length;j++) {
				System.out.print(score1[i][j]+"\t");
				sum1+=score1[i][j];
			}System.out.print(sum1+"\t");
			System.out.printf("%.2f\n",(double)sum1/score1.length);
		
		}

		
		
		
	}

}
