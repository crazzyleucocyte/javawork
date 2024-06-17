package network;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Client2 {
	static boolean endCheck=true;

	synchronized static boolean endCheck(boolean check) {
		return endCheck=check;
	}
	// reader와 writer를 모두 callable로 구현하고 synchronized STringBuffer에 저장해서 이전에 들어온 값이 서버면 클라이언크 : 출력 후 입력

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int port = 9001;
		String ip;
		try {
			ip = InetAddress.getLocalHost().getHostAddress();

			try (Socket client = new Socket(ip, port);
					BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
					PrintWriter pw = new PrintWriter(client.getOutputStream(), true);) {
				System.out.println("연결 성공");
				System.out.println(br.readLine());
				System.out.println(br.readLine());

				//				//서버에서 읽어온 값과 서버로 보낼 값을 저장하는 StringBuffer////동기화 예정

				//서버의 메시지를 읽어오는 read tread객체 생성
				Clients_Reader read = new Clients_Reader("서버",br,pw);
				Thread thr = new Thread(read);

				//리더 쓰레드를 데몬쓰레드로 지정하고 쓰레드 시작
				thr.setDaemon(true);
				thr.start();

				//클라이언트의 채팅 닉네임을 받는 부분
				String name = s.nextLine();
				pw.println(name);

				Client_Writer tr = new Client_Writer();
				while(read.endCheck&&endCheck!=false) {
					try {
						ExecutorService executor = Executors.newSingleThreadExecutor();
						Future<String> future2 = executor.submit(tr); //
						String out =future2.get();
						//						Thread.sleep(100);
						System.out.println(name + " : "+out);
						pw.println(out);
						pw.flush();
						if(out.equalsIgnoreCase("!exit")) {
							pw.println("클라이언트가 대화 종료를 했습니다.");
							endCheck(false);
							break;
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ExecutionException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("대화를 종료합니다.");
			}

		} catch (Exception e) {
			s.close();
			e.printStackTrace();
		} 

	}

}
