package _07_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class _07_ClientProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			String ip = InetAddress.getLocalHost().getHostAddress();// 오류 발생 가능으로 try-catch필요(UnknownHostException)
			int port = 9003;

			try(Socket socket= new Socket(ip, port);
				BufferedReader br= new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw= new PrintWriter(socket.getOutputStream())){

				//2) 서버와 입출력 기반스트림 생성
				//3) 보조스트림 통해 성능개선


				//서버의 환영매시지 출력
				System.out.println(br.readLine());

				//서버와 클라이언트의 대화를 무한반복
				while(true) {
					
					//클라이언트의 메시지 보내기
					System.out.print("클라이언트 : ");
					String sendMsg = s.nextLine();
					pw.println(sendMsg);
					pw.flush();
					//서버의 대답
					String msg=br.readLine();
					System.out.println("서버 : "+ msg);
					
					if(sendMsg.equals("exit")) 
						break;
					
				}
				System.out.println("서버와 연결 해제");

			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
