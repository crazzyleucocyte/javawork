package network;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.concurrent.FutureTask;

public class Client {
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
				StringBuffer msg=new StringBuffer(500);
				
				//서버의 메시지를 읽어오는 read tread객체 생성
				Reader read = new Reader("서버",br,pw);
				Thread thr = new Thread(read);
				
				//리더 쓰레드를 데몬쓰레드로 지정하고 쓰레드 시작
				thr.setDaemon(true);
				thr.start();
				
				//클라이언트의 채팅 닉네임을 받는 부분
				String name = s.nextLine();
				pw.println(name);
				
				//클라이언트가 서버에게 메시지를 보내는 부분
				//콜러블 writer객체 생성
				Reader_callable writer = new Reader_callable(name,br,pw,msg);
				
				//생성한 writer객체를 futureTask객체에 저장
				FutureTask<String> futureTack= new FutureTask<String>(writer);
				
				//writer객체의 쓰레드 생성 후 시작
				Thread thr2= new Thread(futureTack);
				
				//메시지를 보내는 반복문
				while(read.endCheck) {

					//반복문을 쓰레드에 넣지 않고 main에 넣었다.
					thr2.start();

					//클라이언트가 입력한 메시지를 StringBuffer에 넣었다.
					msg.replace(0, msg.length(),futureTack.get());
					pw.println(msg);
					pw.flush();
					if(msg.toString().equalsIgnoreCase("!exit")) {
						pw.println("클라이언트가 대화 종료를 했습니다.");
						endCheck(false);
						break;
					}
				}
				
//				while (read.endCheck) { 
//					
//						System.out.println();
//						synchronized(msg) {
//							
//							System.out.print(name+" : "+(msg.replace(0, msg.length(),s.nextLine())));
//						}
//					pw.println(msg);
//					pw.flush();
//					if(msg.toString().equalsIgnoreCase("!exit")) {
//						pw.println("클라이언트가 대화 종료를 했습니다.");
//						endCheck(false);
//						break;
//					}
//				}
				System.out.println("대화를 종료합니다.");
			}

		} catch (Exception e) {
			s.close();
			e.printStackTrace();
		} 

	}

}
