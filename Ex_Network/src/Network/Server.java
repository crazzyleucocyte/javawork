package Network;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int port = 9001;
		
		Socket socket=null;
		try(ServerSocket serverSocket = new ServerSocket(port);
				) {
			System.out.println("클라이언트의 접속을 기다리는 중...");
			socket= serverSocket.accept();	//accept의 반환형이 socket이므로 소켓=서버소켓.accept를 해줘야 한다.
			System.out.println(socket.getInetAddress().getHostAddress()+"가 접속을 요청함");
			BufferedReader br= new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter pr=new PrintWriter(socket.getOutputStream(),true);
			
//			InputStream is = socket.getInputStream();
//			OutputStream os = socket.getOutputStream();
			
//			BufferedReader br= new BufferedReader(new InputStreamReader(is));
//			PrintWriter pr=new PrintWriter(os,true);
			
			pr.println("환영합니다.");
			while(true) {
				System.out.println("클라이언트 : ");
				System.out.println( br.readLine());
				
				System.out.println("서버 : ");
				pr.println(s.nextLine());
				pr.flush();
			}
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
