package _03_CharStream;

import java.io.*;

public class CharStreamApi {
	//문자기반 스트림은 2바이트씩 전송
	/*
	 * /바이트 스트림(1바이트)
	 * InputStream 	: 입력용 스트림
	 * OutputStream	: 출력용 스트림
	 * 사용할 상황 		: 특정 외부 매채와 이 컴퓨터를 연결하여 네트워크를 구성할때 기반스트림으로 사용
	 * 
	 * /문자기반 스트림(2바이트)
	 * xxxReader : 입력용 스트림
	 * xxxWriter : 출력용 스트림
	 * 사용할 상황	 : 보조스트림으로써 사용될때는 기반스트림이 1바이트 일때 스트림의 용량을 늘려주어 문자도 전송이 가능하도록 하거나
	 *     		   문자를 전송하고 싶을때 사용
	 */

	/*주의사항
	 * - 스트림을 사용할때는 오류가 발생할 수 있는 코드를 try-catch로 감싸줘야하는게 많다
	 *   어떤 코드를 사용할때 오류가 발생할 수 있는지 알아두어야한다.
	 *   우선 writer나 reader를 생성할때  IOException 오류가 발생할 수 있고 
	 *   입력용 스트림을 쓸때 .read()메소드로 해당 파일에 잇는 값을 읽어 올때 IOException 오류가 발생할 수 있고
	 *   reader를 쓸때 파일을 찾을 수 없는 경우 FileNotFoundException 오류가 발생할 수 있다.
	 * 
	 * - 스트림을 쓰면 마지막에 꼭 .close()메소드로 닫아주어야 한다.
	 *   이때 오류가 발생할 수 있으므로 try-catch로 감싸주어야하고 이때  IOException오류가 발생할 수 있다.
	 * 
	 * 
	 */
	
	
	
	//출력용 스트림
	FileWriter fw = null;
	void fileSave() {
		 try {
			 //1. 생성
			 //fileWriter를 쓰면 괄호에 있는 파일을 생성한다.이때 오류가 발생할 수 있으므로 이 코드때문에 try-catch로 감싸줘야한다.
			fw = new FileWriter("file_char.txt");//입력하는 파일이 있으면 연결 없으면 생성 후 연결
			
			//2. 메소드 활용
			//변수명.write()는 괄호에 있는 내용을 위의 지정한 경로에 있는 파일에 작성을 해준다.
			fw.write('김');
			fw.write("   젠장 아직도 화요일이네");
			fw.write("\n집 가고 싶다");
			fw.write(' ');
			fw.write('A');
			fw.write("\n");
			
			//문자나 문자열도 가능한데 문자 배열도 전송이 가능하다.
			char arr[]= {'t','j','o','e','u','n'};
			fw.write(arr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	//입력용 스트림
	void fileRead() {
		FileReader fr=null;
		try {
			//출력용 스트림은 writer가 아닌 reader를 사용한다.
			fr=new FileReader("file_char.txt");//이 코드 역시 오류가 발생할 수 있으므로 try-catch로 감싸줘야 한다.
			
			//오류
//				int value = fr.read();
//				while(value!=-1) {
//					//(char)로 형변환을 해줘야 한다
//					System.out.print((char)value);
//				}
			
			//reader로 읽어 올때 아래와 같이 작성하여 반복문으로 아무런 내용이 없을때의 값인 -1이 나올때 까지 출력을 해준다.
			//문자기반 스트림의 경우 숫자로 받아오기 때문에 (char)으로 형변환을 해주어야 한다.
				int value = 0;
				while((value=fr.read())!=-1) {
					//(char)로 형변환을 해줘야 한다
					System.out.print((char)value);
				}
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//3. 스트림 닫기
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}



}
