package _06_Ex_Network.copy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 서버의 도메인이름을 알야하 하는데 우리는 도메인 이름은 없다
		// 내 피씨에서 서버도 돌리고 , 클라이언트도 돌리고, 도메인도 없어서
		// 서버 ip는 내꺼
		BufferedReader br = null;
		PrintWriter pw = null;
		Socket socket = null;// 클라이언트에서도 소켓이 필요해서 생성
		try {
			String ip = InetAddress.getLocalHost().getHostAddress();// 오류 발생 가능으로 try-catch필요(UnknownHostException)
			int port = 9003;

			// 1)서버에 연결 요청을 보내는 구문(요청하고자하는 서버의 ip주소와 포트번호를 제시하면서 소켓을 생성한다.)

			socket = new Socket(ip, port);// 오류 발생 가능으로 try-catch필요

			//2) 서버와 입출력 기반스트림 생성
			//3) 보조스트림 통해 성능개선
			br= new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());

			//서버의 환영매시지 출력
			System.out.println(br.readLine());
			
			//서버와 클라이언트의 대화를 무한반복
			while(true) {
				//클라이언트의 메시지 보내기
				System.out.print("클라이언트 : ");
				pw.println(s.nextLine());
				pw.flush();
				//서버의 대답
				System.out.println("서버 : "+ br.readLine());
			}
			

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				pw.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
