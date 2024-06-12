package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;

public class Reader_callable implements Callable{

	PrintWriter pw;
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));;
	static boolean endCheck=true;
	String name;
	StringBuffer msg;

	//	
	//	Date now = new Date();
	//	SimpleDateFormat date = new SimpleDateFormat("yyyy년 MM월 dd일");
	//	SimpleDateFormat time = new SimpleDateFormat("a hh시 mm분");


	public Reader_callable(String name,BufferedReader br, PrintWriter pw, StringBuffer msg) {
		this.br=br;
		this.pw=pw;
		this.name = name;
		this.msg=msg;
	}



	static boolean endCheck(boolean check) {
		return endCheck=check;
	}

	@Override
	public String call() throws Exception {
		try {
			System.out.print("값을 입력해주세요 : ");
			System.out.println(br.readLine());
			while(!br.ready()) {
				System.out.println("ready");
				Thread.sleep(200);	//bufferdReader에 시스템으로부터 입력받은 값이 없을경우 while문의ready가 true가 되어 계속 sleep한다.
			}
			System.out.println("buffer");
			msg.replace(0, msg.length(),br.readLine());
			System.out.println("msg"+msg);
			return msg.toString();

		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}



//		} catch (NullPointerException e) {
//			System.out.println(name+"가 대화를 종료했습니다.");
//			endCheck(false);
//	
//
//		} catch (SocketException e) {
//			System.out.println(name+"가 접속을 종료했습니다.");
//			endCheck(false);
//	
//		} catch (IOException e) {
//			endCheck(false);
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			System.out.println("대화가 종료되었습니다.");
//			endCheck(false);
//		}
//	}





