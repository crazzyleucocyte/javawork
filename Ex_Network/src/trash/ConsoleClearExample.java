package trash;

import java.util.Scanner;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ConsoleClearExample {








	    static boolean endCheck = true;

	    synchronized static boolean endCheck(boolean check) {
	        return endCheck = check;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int port = 9001;
	        String ip;
	        try {
	            ip = InetAddress.getLocalHost().getHostAddress();

	            try (Socket client = new Socket(ip, port);
	                 BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
	                 PrintWriter pw = new PrintWriter(client.getOutputStream(), true)) {
	                System.out.println("연결 성공");
	                System.out.println(br.readLine());

	                // 서버로부터 메시지를 비동기적으로 수신하는 스레드
	                Thread receiveThread = new Thread(() -> {
	                    try {
	                        String read;
	                        while ((read = br.readLine()) != null || endCheck) {
	                            synchronized (System.out) {
	                                // ANSI 이스케이프 코드를 사용하여 현재 줄을 지우고 서버 메시지 출력
	                                System.out.print("\r" + " ".repeat(50) + "\r"); // 현재 줄 지우기
	                                System.out.println("서버 : " + read);

	                                // 입력 프롬프트를 다시 표시하기 전에 입력했던 내용을 가져옴
	                                String prompt = "클라이언트 : ";
	                                System.out.print(prompt);

	                                // 입력했던 내용을 다시 표시
	                                scanner.reset();
	                            }
	                            if (read.equals("!exit")) {
	                                System.out.println("서버가 대화를 종료했습니다.");
	                                endCheck(false);
	                                break;
	                            }
	                        }
	                    } catch (IOException e) {
	                        e.printStackTrace();
	                    }
	                });

	                receiveThread.setDaemon(true);
	                receiveThread.start();

	                String msg;
	                while (endCheck) {
	                    System.out.print("클라이언트 : ");
	                    msg = "클라이언트 : " + scanner.nextLine();
	                    pw.println(msg);
	                    pw.flush();
	                    if (msg.equals("클라이언트 : !exit")) {
	                        pw.println("클라이언트가 대화 종료를 했습니다.");
	                        endCheck(false);
	                        break;
	                    }
	                }
	                System.out.println("대화를 종료합니다.");
	            }

	        } catch (Exception e) {
	            scanner.close();
	            e.printStackTrace();
	        }

		//----
	}



}
