package _03_CharStream;

import java.io.*;

public class CharStreamApi {
	//문자기반 스트림은 2바이트씩 전송
	/*
	 * xxxReader : 입력용 스트림
	 * xxxWriter : 출력용 스트림
	 */

	//출력용 스트림
	FileWriter fw = null;
	void fileSave() {
		 try {
			 //1. 생성
			fw = new FileWriter("file_char.txt");//입력하는 파일이 있으면 연결 없으면 생성 후 연결
			
			//2. 메소드 활용
			fw.write('김');
			fw.write("   젠장 아직도 화요일이네");
			fw.write("\n집 가고 싶다");
			fw.write(' ');
			fw.write('A');
			fw.write("\n");
			
			char arr[]= {'t','j','o','e','u','n'};
			fw.write(arr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
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
			fr=new FileReader("file_char.txt");
			
			//오류
//				int value = fr.read();
//				while(value!=-1) {
//					//(char)로 형변환을 해줘야 한다
//					System.out.print((char)value);
//				}
			
			
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
