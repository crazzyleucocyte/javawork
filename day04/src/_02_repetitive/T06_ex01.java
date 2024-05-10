package _02_repetitive;

import java.util.Scanner;

public class T06_ex01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//주사위의 숫자 맞추기 게임		
		//com의 숫자는 1~6		
		int com =(int)(Math.random()*6+1);//1~6
				System.out.println(com);
				
				int user;
				int sum=0;
				int com2;
				do { System.out.println("\n주사위의 숫자를 맞춰보세요.");
				com2 = (int)(Math.random()*6+1);
				user = s.nextInt();
				if(com2!=user) {
					System.out.println("틀렸습니다!!\n주사위 눈은"+com2+"였습니다~!");
					
				}else {
					System.out.println("축하합니다 맞추셨습니다~");
				}
				sum++;
					
				}while(com2!=user);
				System.out.println(sum+"번 만에 맞추셨습니다~!");
		
	}

}
