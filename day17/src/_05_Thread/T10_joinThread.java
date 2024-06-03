package _05_Thread;

// join은 쓰레드가 돌아가는 중간에 값을 가져오지 못하도록 쓰레드가 끝난 후 값을 가져오도록 기다리는 메소드

class SumThread extends Thread{
	private int sum;
	
	public int getSum() {
		return sum;
	}
	
	public void run() {
		for(int i = 1;i<1000;i++) {
			sum+=i;
		}
		System.out.println("종료");
	}
}

public class T10_joinThread {

	public static void main(String[] args) {
		SumThread sumT = new SumThread();
		sumT.start();
		System.out.println("1~10000까지 합 : "+sumT.getSum());// join을 안쓸 경우 출력값 : 0 //쓰레드가 다 끝나기 전에 sum값을 가져와서 0이 나온다
//--------------------------------------------------------------------------------------------		
		try {
			sumT.join();//sumT가 끝날때까지 슬립하는 느낌
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//--------------------------------------------------------------------------------------------		
		System.out.println("1~10000까지 합 : "+sumT.getSum());// join을 안쓸 경우 출력값 : 0 //쓰레드가 다 끝나기 전에 sum값을 가져와서 0이 나온다
		
//--------------------------------------------------------------------------------------------		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//--------------------------------------------------------------------------------------------		
		System.out.println("1~10000까지 합 : "+sumT.getSum());// 출력값 : 0 //쓰레드가 다 끝나기 전에 sum값을 가져와서 0이 나온다
	}

}
