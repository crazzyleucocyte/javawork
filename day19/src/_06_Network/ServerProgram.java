package _06_Network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {

		
		/*현재 구동중인 서버가 있으면 클라이언트는 그서버로 요청을 보낼수 있음 => 응답결과가 돌아옴
		요청과 응답에 의해서 프로그램은 돌아간다(서버와 클라이언트가 통신한다)
		웹에서는 통신방식 : http 프로토콜 통신(지금은 https로 보안이 강화된것을 사용한다.)
		http 헤더에 요청을 실어 주고 받는다.
		
		자바만을 가지고 서버와 클라이언트간에 간단한통신하기 
		이때 데이터를 입출력하고자 한다면 서버와 클라이언트간에 스트림(연결통로)이 필요하다
		자바에서 서버와 클라이언트간에 통신하려면 스트림을 써야한다.
		
		소켓 : 프로세스간의 통신을 담당. 스트림을 연결하기 위한 문.
		소켓 프로그래밍
		TCP : 데이터를 정확하고 안정적으로 전달 가능 (신뢰성).느림(이메일, http)
		UDP : 신뢰성이 없는 데이터 전달. 빠름(실시간 동영상 서비스)
		
		우리는 tcp만 연습해볼것이다
		*/
		
		/*
		 * TCP(Transmission Control Protocol)
		 *  - 서버, 클라이언트 1:1 소켓 통신
		 *  - 데이터를 교환하기 전에 서버와 클라이언트가 연결이 되어있어야한다

		 * Soket
		 *  - Input/OutoutStream을 가지고 소켓통신을 함


		 * ServerSocket
		 *  - 포트와 연결(Bind)되어 외부의 연결요청을 기다리다 연결 요청이 들어오면수락해줄 용도
		 *    수락 =>통신할수 있는 Socket생성
		 * 
		 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1)포트번호 지정
		int port = 9003;
		
		BufferedReader br=null;	//입력용 스트림/보조스트림
		PrintWriter pw = null; //출력용 스트림./보조스트림
		
		ServerSocket server = null;
		//1~4번은 소켓 생성하는 과정
		try {
			//2. ServerSocket 객체 생성시 포트 결합(Bind)
			server = new ServerSocket(port);
			
			//3. 클라이언트의 요청이 올때까지 대기상태
			System.out.println("클라이언트의 요청을 기다리고 있음...");
			
			//4.요청이 들어오면 수락 후 해당 클라이언트와 통신할 수 있는 서버측 소켓 객체 생성
			Socket socket =server.accept();	//서버를 수락한다
			//아래의 socket.getInetAddress().getHostAddress()는 소켓으로 들어온 클라이언트의 정보중 이름/ip주소를 가져오는데 여기서 이름만 가져온다는 뜻이다.
			System.out.println(socket.getInetAddress().getHostAddress()+"가 연결 요청함");
			
			//5. 클라이언트와 입출력할 기반 스트림 생성/소켓을 이용해 통신할때는 문자스트림은 안되고 바이트 스트림만 가능하다
			InputStream is = socket.getInputStream();
			OutputStream ip = socket.getOutputStream();
			
			//6. 보조스트림 사용
			//inputStream을 inputStreamReader로 바꿔서 BufferedReader로 바꾼 이유는 
			//목적은 bufferedReader를 사용하기 위함이다
			//하지만 bufferedReader는 2바이트 스트림이고 inputStream은 1바이트 스트림인데 소켓으로써 inputStream을 사용하는것이므로
			//바이트 수가 맞지 않고 bufferedReader를 사용하기 위해서 inputStream을 2바이트로 바꿔줘야하는데 그 중간 과정에 있는것이 
			//inputStreamReader인것이다.
			br=new BufferedReader(new InputStreamReader(is));// 위의 inputStream과 합쳐 한 줄로 만들 수 있다.
			pw = new PrintWriter(socket.getOutputStream());
			//printwriter는 데이터 출력시 print(), println() 메소드를 가지고 있는 보조스트림
			
			pw.println("환영합니다.👌👌👌👏🐱‍🍗🍗🍗🍗🍗🍔🍔🍔🍔🍔🍔");
			pw.flush();	//버퍼를 비워서 버퍼에 쌓아두지 않고 곧바로 보낼 수 있다.
			
			while(true) {
			//7. 스트림을 통해 읽고 쓰기
				//클라이언트측의 메시지 읽기
				System.out.println("클라이언트 : "+br.readLine());
				
				//클라이언트에게 메시지 보내기
				System.out.print("서버 : ");
				pw.println(sc.nextLine());
				pw.flush();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pw.close();
				br.close();
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
