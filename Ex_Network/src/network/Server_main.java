package network;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//reader

// 쓰레드 메소드 중 wait을 써서 클라이언트가 처음에 보내기 전까지는 기다리도록 할 수도 있다 
public class Server_main {
	Server_Accepter acc = new Server_Accepter();
	Server_welcome clientMap = new Server_welcome();
	

	static boolean endCheck = true;

	synchronized static boolean endCheck(boolean check) {
		return endCheck = check;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String out;
		int port = 9001;

		try (ServerSocket serverSocket = new ServerSocket(port)) {

			Server_Accepter acc = new Server_Accepter(serverSocket);
			ExecutorService executor = Executors.newSingleThreadExecutor();
			Future<Socket> fture = executor.submit(acc); // 서버에서 클라이언트를 계속 받는 쓰레드 실행

			chat: do{
				System.out.println("sfsfsfsf");
				System.out.print("서버 : " + (out = s.nextLine()));
				System.out.println();
				System.out.println(Server_welcome.synchronizedClientMap);
				
//				synchronized (Server_welcome.synchronizedClientMap) {
					Iterator<PrintWriter> itPrintWriter= Server_welcome.synchronizedClientMap.values().iterator();
		         
					while(itPrintWriter.hasNext()) {
		            	PrintWriter pw=itPrintWriter.next();
		            	pw.println(out);//클라이언트들에게 메세지 전송
		            	if (out.equalsIgnoreCase("!exit")) {
		            		pw.println("서버가 대화 종료를 했습니다.77777");
		            		endCheck(false);
		            		
		            		break;
		            	}
		            	
		            }
					if (out.equalsIgnoreCase("!exit")) {
						executor.shutdownNow();
						while(Thread.currentThread()!=null) {
						Thread.currentThread().interrupt();
						}
						
						break;
					}
					
					
//				}
				
		            //엔드테그
				
			} while (Server_welcome.synchronizedClientMap.size() != 0&&Server_Accepter.endchat&&endCheck);
			System.out.println("대화를 종료합니다.89898989");
			s.close();
			System.exit(0);
		} catch (IOException e1) {
			s.close();
		
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch(Exception e3){
			s.close();
			System.out.println(888888888);
			System.out.println("대화를 종료합니다.");
			e3.printStackTrace();
//			System.exit(0);
		}
	}
}
