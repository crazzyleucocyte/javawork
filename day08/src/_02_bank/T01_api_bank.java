package _02_bank;

import java.util.Scanner;

public class T01_api_bank {
	private int balance;
	private int password;
	Scanner psw = new Scanner(System.in);
	// 비밀번호 생성 입금 출금을 조금 더 메인쪽으로 옮기도록 재작성 필요
	void Deposit(int money) {
		balance+=money;
	}
	void setPassword() {
		while(true) {
		System.out.print("계좌의 비밀번호를 입력해주세요 : ");
		int password1 = psw.nextInt();
		System.out.print("비밀번호를 한 번 더 입력해주세요 : ");
		int password2 = psw.nextInt();
		if(password1==password2) {
			System.out.println("비밀번호 설정이 완료되었습니다.");
			this.password=password1;
			break;
		}else {
			System.out.println("입력하신 비밀번호가 서로 다릅니다.");
			continue;
		}
	}
	}
	void Withdraw(int money) {
		System.out.println("비밀번호를 입력해주세요 : ");
		if(balance<money) System.out.println("잔액이 부족합니다.");
		else balance-=money;
	}
	int getBalance() {
		return balance;
	}
	
	
}
