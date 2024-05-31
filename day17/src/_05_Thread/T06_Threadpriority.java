package _05_Thread;

class PThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.print("-");
			for(int j =0;j<10000000;j++);//두번쨰 포문이 돌긴 하는데 일을 안하므로 sleep이다
		
		}
	}
}

class PThread2 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.print("_");
			for(int j =0;j<10000000;j++);//두번쨰 포문이 돌긴 하는데 일을 안하므로 sleep이다
			
		}
	}
}

public class T06_Threadpriority {

	public static void main(String[] args) {
		Thread pt1 = new PThread();
		Thread pt2 = new PThread2();
		//쓰레드 객체.getpriority() : 해당 쓰레드의 우선순위 출력
		
		
		pt2.setPriority(Thread.MAX_PRIORITY);
		pt2.setPriority(10);
		System.out.println("pt1 우선순위 : "+pt1.getPriority()+", pt2 우선순위 :"+pt2.getPriority());
		
		pt1.start();
		System.out.println("\n\n\n\n\n");
		pt2.start();
		
		
		
		
		
		
		
		
	}

}
