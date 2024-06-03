package _05_Thread;

// 동기화라고 하며 이것을 쓰는 이유는 두 개 이상의 쓰래드가 하나의 객체에 동시에 접근할때 혼동이 생기지 않도록 
//한번에 하나의 쓰레드만 객체에 접근할 수 있도록 객체에 락을 걸어서 데이터의 일관성을 유지하는 것

// 첫번째 쓰레드가 먼저 객체에 접근해서 500이라는 데이터를 저장하고 sleep을 했는데 첫번째 쓰래드가 sleep하는 동안
// 두번째 쓰레드가 객체에 접근해서 1000이라는 데이터를 저장하고 sleep에 들어갔고 
// 첫번째 쓰레드가 sleep에서 깨어났을때 객체에는 500이라는 데이터가 아닌 1000이라는 데이터가 저장되어 있어서
// 오류가 나는데 이것을 싱크로나이즈드 쓰레드가 조정해준다.



//싱크로 나이즈드를 쓰지 않을 경우 두 객체의 money값이 따로 계산 되어 하나의 쓰레드에서 0원이 되어도 두 번째 객체에서는 잔액이 0월이 될때 까지 출금을 한다.

class Account{
	private int balance = 1000;

	public int getBalance() {
		return balance;
	}
//				synchronized를 주석처리 하면 -가 나온다
	synchronized void withdraw(int money) {
		if(balance>=money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			balance-=money;
		}
	}
}
class ThreadC implements Runnable {
	Account acc = new Account();
	
	@Override
	public void run() {
		while(acc.getBalance()>0) {
			int money = ((int)(Math.random()*3)+1)*100;
			System.out.println(money+" 원");
			acc.withdraw(money);
			System.out.println("잔액은 : "+acc.getBalance());
		}
	}
	
	
	
}




public class T11_SynchronizedThread {

	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadC());
		Thread t2 = new Thread(new ThreadC());
//		t1.start();
//		t2.start();
//		Account ac = new Account();
//		Thread는 extends
		//위의 두 줄을 한 줄로 줄일 수 있는데 방법은 
//		new Thread(new ThreadC()).start();//로 쓸 수 있다.
		new Thread(t2).start();
		
		
//		runnable은 implement
//		Runnable r = new ThreadC(); //TreadC가 Runnable 인터페이스를 구현했으니 부모 자료형에 자식 객체를 참조했고
//		Thread t3 = new Thread(r); //객체를 생성해서 r을 넣을 수 있다.
//		예도 줄일 수 있을듯
//		new Thread(new ThreadC()).start();
		new Thread(t2).start();
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
