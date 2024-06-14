package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Turn implements Callable{
	PrintWriter pw;
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	static boolean endCheck=true;
	String name;
	StringBuffer msg;
	@Override
	public String call() {
		try {
//			System.out.print("값을 입력해주세요 : ");
//			String msg =br.readLine();
			while(!br.ready()) {
//				System.out.println("ready");
				Thread.sleep(50);	//bufferdReader에 시스템으로부터 입력받은 값이 없을경우 while문의ready가 true가 되어 계속 sleep한다.
			}
//			System.out.print("buffer");
			return br.readLine();

		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
}

public class Run {
	
	 

//	public static void main(String[] args) {
//		
////		executor.execute(()->System.out.println("Hello, World!"));
//		
//		//쓰레드 풀 사이즈 10짜리의 익시큐터를 생성
////		ExecutorService executor = Executors.newFixedThreadPool(10);
////		생성한 익시큐터를 sumit으로 실행한 값을 future에 저장
//		Turn tr = new Turn();
//		
////		Future<String> future = executor.submit(()->"hello"); //
//		int i =0;
//		while(i<5) {
//			try {
//				ExecutorService executor = Executors.newSingleThreadExecutor();
//				Future<String> future2 = executor.submit(tr); //
//				String out =future2.get();
////				Thread.sleep(100);
//				System.out.println(out);
//				executor.shutdown();
//				i++;
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (ExecutionException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//		//ExecutorService는 인터페이스라서  new ExecutorService(writer);를 하지 못한다.
////		Reader_callable writer = new Reader_callable();
////		ExecutorService excutor= Executors.newSingleThreadExecutor();
////		ExecutorService executor = Executors.newSingleThreadExecutor();
////		Future<String>future = executor.
//	}
}
