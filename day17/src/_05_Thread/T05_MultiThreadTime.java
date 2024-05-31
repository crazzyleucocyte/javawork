package _05_Thread;

class MultiThread extends Thread{

	@Override
	public void run() {
		for(int i = 0;i<500;i++) {
			System.out.println("#");
		}
		T05_MultiThreadTime.endTime = System.currentTimeMillis();
		System.out.println("쓰레드 소요 시간"+(System.currentTimeMillis()-T05_MultiThreadTime.startTime));

	}
}

public class T05_MultiThreadTime {
	static long startTime = 0;
	static long endTime = 0;
	public static void main(String[] args) {
		MultiThread mt = new MultiThread();
		mt.start();		
		startTime = System.currentTimeMillis();



		//이 for문의 소요시간이 궁금하다

		System.out.println(startTime);
		for(int i = 0;i<500;i++) {
			System.out.println("&");
		}
		System.out.println();
		endTime = System.currentTimeMillis();
		System.out.println("메인 소요 시간"+(System.currentTimeMillis()-startTime));



	}

}
