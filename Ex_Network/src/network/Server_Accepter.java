package network;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class Server_Accepter implements Callable<Socket>{
	
	ServerSocket serverSocket;
	Socket socket;
	static Map<String, PrintWriter> map = new HashMap<String, PrintWriter>();
	static Map<String, PrintWriter> synchronizedClientMap = Collections.synchronizedMap(map);
	static List <PrintWriter> clientList = new ArrayList<PrintWriter>();
	
	
	public Server_Accepter() {
	}
	public Server_Accepter(ServerSocket serverSocket) {
		this.serverSocket = serverSocket;
	}

	@Override
	public Socket call() throws Exception {
		int i=0;
		while(i !=10) {
			try{
				System.out.println("클라이언트의 접속을 기다리는 중...");
				socket= serverSocket.accept();	//accept의 반환형이 socket이므로 소켓=서버소켓.accept를 해줘야 한다.
				System.out.println(socket.getInetAddress().getHostAddress()+"가 접속을 요청함");
			
				synchronized(clientList) {
					clientList.add(new PrintWriter(socket.getOutputStream(),true));
				}
				System.out.println(12321321);
				new Thread(new Server_welcome(socket)).start();
				System.out.println();
			}catch(Exception e) {
				e.printStackTrace();
			}
			i++;
		}
		return socket;
	}
}