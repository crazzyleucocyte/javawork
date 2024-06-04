package _02_ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamApi {
	//폴더에 파일을 생성하고 텍스트 파일에 값을 입력해주는 메소드
	/*
	 * xxxInputStream	:xxx매체로 부터 데이터를 입력받는 통로(외부매체로부터 데이터를 읽어온다)
	 * xxxOutputStream	:xxx매체로 데이터를 출력하는 통로(외부 매체로 데이터를 내보낸다)
	 */

//	이 메소드의 외부 매체는 파일이고 외부매체인 파일에 출력을 한다. 데이터를 파일로 내보내기한다는 뜻. 즉 파일로 저장
	void fileSave() {
		// FileOutStream : 파일과 직접연결해서 1바이트 단위로 출력하는 스트림

		// 순서
		// 1. 스트림 생성(통로를 일단 만들기)
		// 2. 스트림으로 데이터를 출력(메소드 활용)
		// 3. 다 사용한 후에는 스트림을 반납
		FileOutputStream fout=null;
		try {
//		1. 스트림 생성
			// 파일이 없으면 만들어주고 있으면 통로 연결을 해준다.
			fout = new FileOutputStream("file_byte.txt"); // ()안에 어떤 파일에 내보내기 할것인가를 입력

//		2. 파일에 데이터 출력하고자 할때 write 메소드 사용
//		   숫자를 출력하든 문자를 출력하든 파일에 기록되는건 문자로 기록됨(아스키코드)
			fout.write(97);		//97이 유니코드표로 a라서 총 a와 b가 출력되었다.
			fout.write('b'); 	// 문자열은 넣지 못하고 문자만 넣을 수 있다.
			
			//byte 배열로도 입력 할 수 있다.
			byte[]arr= {'J','A','V','A'};
			fout.write(arr);
			
			//write(매개변수 1개) : 매개변수에 있는 문자를 쓰시오(출력하시오)
			//write(매개변수 3개)
			//write(문자[],int offset(얼만큼 떨어져서),int length(길이 몇개))
			fout.write(arr, 1, 3);
			
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		3. 스트림 반납
		try {
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
//	외부 매체로부터 파일을 읽어온다(입력 : 파일로부터 데이터 가져오기)
	void fileRead() {
		//FileInputStream
		
		//순서
		//1. 스트림 생성
		//2. 스트림으로 데이터를 입력(메소드 활용)
		//3. 다 사용한 후 스트림 반납
		
		FileInputStream fin=null; //반납을 위해 try catch밖으로 빼놓음
		try {
			
			//1번
			fin = new FileInputStream("file_byte.txt");
			
			//2번 read() 메소드 이용
				//아래처럼 하면 조건문에서 1번 출력문에서 1번 실행되서 문자가 건너뛰먼서 출력된다.
//				while(fin.read() !=-1) {
//				System.out.println(fin.read());	//1바이트만 가져오시오라는 뜻이다.
//				}
				//출력 결과 아스키코드로 1바이트씩 가져오기 때문에 
//				해결방법1. 무한반복으로 돌면서 매번 조건검사
//				while(true) {
//					int read = fin.read();
//					if(read==-1) {
//						break;
//					}else
//						System.out.println(read);
//				}
				//위처럼 해도 되지만 권장하는 방법이 있다
				//해결방법2. 권장방법
				
				int value =0;
				while((value = fin.read())!=-1) {
					System.out.print((char)value);
				}//이렇게 하면 텍스트 파일에 있는 문자가 그대로 입력된다.
				
				
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
	
	
	
	
	

}
