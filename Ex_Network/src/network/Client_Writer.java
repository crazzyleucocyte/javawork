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

public class Client_Writer implements Callable{
	PrintWriter pw;
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	static boolean endCheck=true;
	String name;
	StringBuffer msg;
	
	
	@Override
	public String call() {
		try {
			while(!br.ready()) {
				Thread.sleep(50);	//bufferdReader에 시스템으로부터 입력받은 값이 없을경우 while문의ready가 true가 되어 계속 sleep한다.
			}
			return br.readLine();
		}catch(InterruptedException e1) {
			System.out.println("대화를 종료합니다.");
			return null;

		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러가 발생했습니다.");
			return null;
		}
	}
	
	
}


	 

