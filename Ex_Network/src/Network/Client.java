package Network;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int port = 9001;
		String ip;
		try {
			ip = InetAddress.getLocalHost().getHostAddress();

			try(
					Socket client = new Socket(ip,port);
					BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
					PrintWriter pw = new PrintWriter(client.getOutputStream(),true);
					) {
				System.out.println("연결 성공");
				System.out.println( br.readLine());

				while(true) {
					System.out.println("클라이언트 : ");
					pw.println(s.nextLine());
					pw.flush();
					System.out.println("서버 : ");
					System.out.println( br.readLine());
					


				}




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
