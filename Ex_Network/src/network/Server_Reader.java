package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server_Reader implements Runnable{
	
	PrintWriter pw;
	BufferedReader br;
	static boolean endCheck=true;
	String name;
	Server_Accepter acc = new Server_Accepter();
	
	
	Date now = new Date();
	SimpleDateFormat date = new SimpleDateFormat("yyyy년 MM월 dd일");
	SimpleDateFormat time = new SimpleDateFormat("a hh시 mm분");
	
	
	public Server_Reader(String name,BufferedReader br, PrintWriter pw) {
		this.br=br;
		this.pw=pw;
		this.name = name;
	}
	
	static boolean endCheck(boolean check) {
		return endCheck=check;
	}
	
	@Override
	public void run() {
		try {
			String read =null;
			while(!br.ready()) {
//				System.out.println("ready");
				try {
					Thread.sleep(100);
//					System.out.println(99999);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	//bufferdReader에 시스템으로부터 입력받은 값이 없을경우 while문의ready가 true가 되어 계속 sleep한다.
			}
			
			while(Server_welcome.synchronizedClientMap.size() != 0) {
				try {
				read=br.readLine();
				synchronized(System.out) {
					System.out.println("\n"+name+" : "+read);
				}
				
				if(read.equals("!exit")) {
					synchronized (Server_welcome.synchronizedClientMap) {
						Server_welcome.synchronizedClientMap.remove(name);
					}
					System.out.println(name+"가 대화를 종료했습니다.");
					endCheck(false);
					break;
				}
				} catch (NullPointerException e) {
					System.out.println(name+"가 대화를 종료했습니다.");
					endCheck(false);
					e.printStackTrace();
					break;
				}catch(Exception e1) {
					e1.printStackTrace();
					System.out.println("대화가 종료");
					
				}
			}
	

		} catch (SocketException e) {
			System.out.println(name+"가 접속을 종료했습니다.");
			endCheck(false);
			e.printStackTrace();
	
		} catch (IOException e) {
			endCheck(false);
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("대화가 종료되었습니다.");
			endCheck(false);
		}
	}

}
