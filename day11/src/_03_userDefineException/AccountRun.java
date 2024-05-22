package _03_userDefineException;

public class AccountRun {

	public static void main(String[] args) {

		Account bank = new Account();
		bank.Deposit(1000);
		try {
			bank.Withdraw(4000);
		} catch (UserException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
