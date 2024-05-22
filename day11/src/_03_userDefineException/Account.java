package _03_userDefineException;

import java.util.Scanner;

public class Account {
	private int balance;
	
	
	
	void Deposit(int money) {
		balance+=money;
	}
	void Withdraw(int money)throws UserException {
		if(balance<money)
		throw new UserException("잔고부족 "+(money-balance)+"원 모자람");
		//if가 참일때 UserException 예외가 발생하도록
		else balance-=money;
	}
	int getBalance() {
		return balance;
	}
}
