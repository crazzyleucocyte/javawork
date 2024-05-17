package _02_bank;

public class T01_main_bank {

	public static void main(String[] args) {
		//은행 잔액 조회, 입금, 출금

		T01_api_bank bank = new T01_api_bank();
		
		
		
		
		
		
		
		
		
		bank.Deposit(1000);
		System.out.println("잔액 : "+ bank.getBalance());
		
		bank.Withdraw(500);
		System.out.println("잔액 : "+ bank.getBalance());
		
		
		
		
		
	}

}
