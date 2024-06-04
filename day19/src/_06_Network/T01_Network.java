package _06_Network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class T01_Network {

	public static void main(String[] args) {
		// 서버에 요청하기 위해서는 그 요청하고자 하는 서버의 ip주소(또는 도메인 명), port번호를 알아야함
//		InetAddress : 네트워크 정보(ip주소 관련)를 확인할 수 있는 클래스
		
		try {
			InetAddress localhost = InetAddress.getLocalHost();	//내 pc에 대한 정보 반환
			System.out.println(localhost);
			//pc이름
			System.out.println(localhost.getHostName());
			
			//pc주소
			System.out.println(localhost.getHostAddress());
			
			
			//도메인을 통해서 그 서버의 정보를 가져온다
			
			InetAddress google = InetAddress.getByName("google.com");	//google에 대한 정보 반환
			System.out.println(google.getHostName()); //구글의 이름
			System.out.println(google.getHostAddress()); //구글의 주소
			
			InetAddress naver[] = InetAddress.getAllByName("naver.com");	
			//naver에 대한 정보 반환인데 getByName은 하나만 가져오는거고getAllByName이게 여러개 가져오는거라 배열에 넣었다
			
			for(InetAddress Inet : naver) {
				System.out.println("네이버의 호스트 이릅"+Inet.getHostName());
				System.out.println("네이버의 호스트 주소"+Inet.getHostAddress());
			}
			
			
		} catch (UnknownHostException e) {
			// UnknownHostException : 서버의 DNS 설정이 되어있지 않아 host를 찾지 못할때
//									  서버의 설정된 DNS가 해당 도메인을 찾을 수 없을 때 발생되는 예외
			e.printStackTrace();
		}
		
		
		
	}

}
