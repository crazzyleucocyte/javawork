package Network;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
	
	static boolean endCheck=true;
	
	synchronized static boolean endCheck(boolean check) {
		return endCheck=check;
	}
	

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
				
				Runnable r = new Runnable() {

					@Override
					public void run() {
						try {
							String read ;
							while ((!(read = br.readLine()).equals(null))||endCheck!=false) {
								System.out.println("\n서버 : "+read);
								if(read.equals("!exit")) {
									System.out.println("서버가 대화를 종료했습니다.");
									endCheck(false);
									break;
								}
							}
						} catch (NullPointerException e) {
							System.out.println("서버가 대화를 종료했습니다.null");
							endCheck(false);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				};

				
				Thread thr = new Thread(r);
				thr.setDaemon(true);
				thr.start();
				String msg;
				while (endCheck) {
					
					System.out.println();
					msg = s.nextLine();
					System.out.print("클라이언트 : "+msg);
					pw.println(msg);
					pw.flush();
					if(msg.equals("!exit")) {
						pw.println("클라이언트가 대화 종료를 했습니다.");
						endCheck(false);
						break;
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
