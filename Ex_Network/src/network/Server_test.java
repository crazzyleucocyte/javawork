package network;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

// 쓰레드 메소드 중 wait을 써서 클라이언트가 처음에 보내기 전까지는 기다리도록 할 수도 있다 
public class Server_test {
	static boolean endCheck=true;

	synchronized static boolean endCheck(boolean check) {
		return endCheck=check;
	}
	Runnable run = run(()->System.out.println());


	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int port = 9001;

		Socket socket=null;
		try(ServerSocket serverSocket = new ServerSocket(port);
				) {
			System.out.println("클라이언트의 접속을 기다리는 중...");
			socket= serverSocket.accept();	//accept의 반환형이 socket이므로 소켓=서버소켓.accept를 해줘야 한다.
			System.out.println(socket.getInetAddress().getHostAddress()+"가 접속을 요청함");

			try(
					BufferedReader br= new BufferedReader(new InputStreamReader(socket.getInputStream()));
					PrintWriter pr=new PrintWriter(socket.getOutputStream(),true);){

				//			InputStream is = socket.getInputStream();
				//			OutputStream os = socket.getOutputStream();

				//			BufferedReader br= new BufferedReader(new InputStreamReader(is));
				//			PrintWriter pr=new PrintWriter(os,true);

				pr.println("환영합니다.");
				pr.println("닉네임을 입력해주세요 : ");
				pr.flush();
				String name = br.readLine();
				
				/*Runnable r = new Runnable() {

					@Override
					public void run() {
						try {
							String read =null;
							while((!(read = br.readLine()).equals(null))||endCheck!=false) {
								System.out.println("\n클라이언트 : "+read);
								if(read.equals("!today")) {
									pr.println(date.format(now));
								}else if(read.equals("!exit")) {

									System.out.println("클라이언트가 대화를 종료했습니다.");
									endCheck(false);
									break;
								}
							}
						} catch (NullPointerException e) {
							System.out.println("클라이언트가 대화를 종료했습니다.");
							endCheck(false);

						} catch (SocketException e) {
							System.out.println("클라이언트가 접속을 종료했습니다.");
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}



			};

				 */
				Reader read = new Reader(name,br,pr);

				Thread thr = new Thread(read);
				thr.setDaemon(true);
				thr.start();
				String msg;

				while(read.endCheck&&endCheck!=false) {
					System.out.println();
					System.out.print("서버 : "+(msg=s.nextLine()));
					pr.println(msg);
					pr.flush();
					if(msg.equals("!exit")) {
						pr.println("서버가 대화 종료를 했습니다.");
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


	private Runnable run(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
}


