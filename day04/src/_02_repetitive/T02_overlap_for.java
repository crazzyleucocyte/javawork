package _02_repetitive;

import java.util.Scanner;

public class T02_overlap_for {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		for(int i =1;i<=3;i++) {
			for(int j = 1;j<=5;j++) {
				System.out.println("i="+i+", j="+j);
			}System.out.println();
		}
		System.out.println("-------------");
		for(int dan =1;dan<=9;dan++) {
			System.out.println(dan+"단");
			for(int i = 1;i<=9;i++) {
				System.out.println(dan +" * "+i+" = "+(dan*i));
			}System.out.println();
			
		}
		//사용자로부터 숫자를 입력 받아 별 출력
		System.out.println("숫자 입력");
		int star = s.nextInt();
		for(int i=1;i<=star;i++	) {
			for(int d=1;d<=i;d++) {
				System.out.print("*");
			}System.out.println();
		}
		
		
		System.out.println("구구단 출력");
		for(int i=1;i<=9;i++) {
			System.out.print("   "+i+"단   ");
		}
		System.out.println();
		for(int i =1;i<=9;i++) {
			for(int dan = 1;dan<=9;dan++) {
				System.out.printf("%d*%d=%2d | ",dan,i,(dan*i) );
			}System.out.println();
			
			
		}
		
		int sum=0;
		System.out.println("숫자 입력");
		int num = s.nextInt();
		
		for(int i=1;i<=num;i++	) {
			
			for(int d=1;d<=i;d++) {
				System.out.print(d);
				sum+=d;
			}System.out.println(" "+sum);
			
			
			
		}
		
		
		
		/*
		
		        System.out.print("삼각형의 높이를 입력하세요: ");
		        int height = s.nextInt();
		        
		        // 삼각형 생성
		        int[][] triangle = new int[height][];
		        for (int i = 0; i < height; i++) {
		            triangle[i] = new int[i + 1];
		        }
		        
		        // 삼각형 값 계산
		        for (int i = 0; i < height; i++) {
		            triangle[i][0] = 1; // 맨 왼쪽 값은 항상 1
		            triangle[i][i] = 1; // 맨 오른쪽 값은 항상 1
		            
		            for (int j = 1; j < i; j++) {
		                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
		            }
		        }
		        
		        // 삼각형 출력
		        for (int i = 0; i < height; i++) {
		            // 공백 출력
		            for (int j = 0; j < height - i - 1; j++) {
		                System.out.print(" ");
		            }
		            
		            // 값 출력
		            for (int j = 0; j <= i; j++) {
		                System.out.print(triangle[i][j] + " ");
		            }
		            System.out.println();
		            */
//		        }
		        
		        
		    
		

		
	}

}
