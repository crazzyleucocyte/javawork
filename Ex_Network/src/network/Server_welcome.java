package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Server_welcome implements Runnable {
	Socket socket;
	static boolean endCheck = true;
	static String name;
	static Map<String, PrintWriter> map = new HashMap<String, PrintWriter>();
	static Map<String, PrintWriter> synchronizedClientMap = Collections.synchronizedMap(map);

	synchronized static boolean endCheck(boolean check) {
		return endCheck = check;
	}
	public Server_welcome() {
	}
	
	public Server_welcome(Socket socket) {
		this.socket = socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pr = new PrintWriter(socket.getOutputStream(), true);) {

			pr.println("환영합니다.");
			pr.println("닉네임을 입력해주세요 : ");
			pr.flush();
			name = br.readLine();
			synchronized(synchronizedClientMap) {
			synchronizedClientMap.put(name, pr);
			}
			Server_Reader reader=new Server_Reader(name, br, pr);
			Thread thr1=new Thread(reader, name);
//			thr1.setDaemon(true);
			thr1.start();
			
			while (Server_Reader.endCheck) {
				Thread.sleep(1000);
			}
			System.out.println("웰컴 끝");
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
