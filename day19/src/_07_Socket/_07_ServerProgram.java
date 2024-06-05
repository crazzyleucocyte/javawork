package _07_Socket;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class _07_ServerProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1)포트번호 지정
		int port = 9003;

		//출력용 보조스트림인데 print()와 관련된 메소드가 있어서 사용하기 편리함

		//1~4번은 소켓 생성하는 과정
		try {
			try(ServerSocket server = new ServerSocket(port)){

				//3. 클라이언트의 요청이 올때까지 대기상태
				System.out.println("클라이언트의 요청을 기다리고 있음...");

				Socket socket =server.accept();	//서버를 수락한다 //ioException
			
				System.out.println(socket.getInetAddress().getHostAddress()+"가 연결 요청함");

				//5. 클라이언트와 입출력할 기반 스트림 생성/소켓을 이용해 통신할때는 문자스트림은 안되고 바이트 스트림만 가능하다
				InputStream is = socket.getInputStream();
				OutputStream ip = socket.getOutputStream();
				
				//향상된 fry문에 두 개의 리더와 라이터를 넣었다.
				try(BufferedReader br=new BufferedReader(new InputStreamReader(is));
						PrintWriter pw=new PrintWriter(socket.getOutputStream())){
				

				pw.println("환영합니다.👌👌👌👏🐱‍🍗🍗🍗🍗🍗🍔🍔🍔🍔🍔🍔");
				pw.flush();	//버퍼를 비워서 버퍼에 쌓아두지 않고 곧바로 보낼 수 있다.

				String msg=null;
				//클라이언트로부터 받은 메시지를 msg에 저장하고 그 값이 null이 아닐때 계속 와일문이 돈다
				while((msg=br.readLine())!=null) {
					//클라리언트로부터 받은 메시지가 익싯이면 종료
					if(msg.equals("exit")) {
						System.out.println("채팅을 종료합니다.");
						break;
					}
					//7. 스트림을 통해 읽고 쓰기
					//클라이언트측의 메시지 읽기
					System.out.println("클라이언트 : "+msg);

					//클라이언트에게 메시지 보내기
					System.out.print("서버 : ");
					pw.println(sc.nextLine());
					pw.flush();
				}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
