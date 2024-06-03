package _05_Thread;

class ThreadA extends Thread{
	
	//yield를 쓰면 양보를 한다는 개념이지만 거의 멈춰있는 느낌임
	
	boolean stop=false; 	//쓰레드를 종료시킬 목적
	boolean work = true;	//yield 메소드를 호출한 시점을 알기 위해 지정
	
	@Override
	public void run() {
		//데몬으로 하면 여기에 와일을 썼고 일반 쓰레드는 트라이 케치를 썼었다
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작업 내용");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA 쓰레드 종료");
	}
	
	
}
class ThreadB extends Thread{
	
	boolean stop=false; 	//쓰레드를 종료시킬 목적
	boolean work = true;	//yield 메소드를 호출한 시점을 알기 위해 지정
	
	@Override
	public void run() {
		//데몬으로 하면 여기에 와일을 썼고 일반 쓰레드는 트라이 케치를 썼었다
		while(!stop) {
			if(work) {
				System.out.println("ThreadB 작업 내용");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB 쓰레드 종료");
	}
	
	
}

public class T09_yieldThread {

	public static void main(String[] args) {
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		ta.start();
		tb.start();
		//3초 동안 잠들었다가 a의 work가 flase가 된다.
		
		//
		//a,b 3초 동안은 번갈아가면서 실행
		try {
			Thread.sleep(2);// start후 3초 동안은 번갈아가면서 진행하다가 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("1------------------------");
		ta.work=false;	//3초 후에는 B가 실행
		
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("2-----------------------------");
		ta.work=true;//다시 a가 일하기 시작
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("3-----------------------------");
		
		
		ta.stop = true;
		tb.stop = true;
		
		
	}

}
