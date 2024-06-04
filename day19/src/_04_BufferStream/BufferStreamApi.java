package _04_BufferStream;

import java.io.*;

public class BufferStreamApi {
		//Buffer는 자주 쓰는 보조스트림
		//buffer는 하나씩 보내는것이 아닌 일괄처리해주는 애다
	/*보조 스트림 : 외부 매체와 직접 연결하지 않음. 단독 사용 불가
	 * 			반드시 기반 스티림과 함께 사용
	 * 
	 * 
	 */
	/*
	void fileSave() {
		//기반스트림 : FileWriter를 사용, 
		//보조스트림 : BufferWriter로 출력 속도 향상
		// 순서
		// 1. 기반스트림 먼저 생성
		// 2. 보조스트림 생성 (기반스트림 객체를 전달하면서 생성)
		// 3. 파일 쓰고
		// 4. 보조스트림과 기반스트림 닫기 
		
		FileWriter fw=null;
		BufferedWriter bw=null;
		try {
			//1
			fw=new FileWriter("C:\\KMS\\javawork\\day19\\Folder/file_buffer.txt");
			
			//2
			bw = new BufferedWriter(fw);
			
//			1번과 2번을 한 줄로 만들 수 있다.
			//BufferesWriter bw = new BufferedWriter(new FileWriter(""));
//			버퍼도 사이즈가 있는데 사이즈가 다 차면 출력하고 자기가 다시 받아서 또 출력함
			bw.write("안녕하세요?\n");
			bw.write("맛점함?\n");
			bw.newLine();	//엔터 치는 메소드
			bw.write("나는 자바가 좋음");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	*/
	
	//try-catch-resource 구문으로 자원반납을 하지 않는다
	//jdk 1.7버전부터 사용 가능
	
	/*
	 * try(매개변수로 트라이 블럭 내에 닫아줘야할 스트림 객체를 넣어준다.){
	 * //알아서 try구문이 다 끝나면 해당 스트림 반납까지 해줌
	 * }
	 */
		
		void fileSave() {
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\KMS\\javawork\\day19\\Folder/file_buffer.txt"))){
				bw.write("안녕하세요?\n");
				bw.write("맛점함?\n");
				bw.newLine();	//엔터 치는 메소드
				bw.write("나는 자바가 좋음");
				bw.write("\n사실 거짓말");
				
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	void fileRead() {
//		FileReader fr;
		try(BufferedReader br= new BufferedReader(new FileReader("C:\\KMS\\javawork\\day19\\Folder/file_buffer.txt"))) {
//			fr = new FileReader("");
			System.out.print((char)br.read());	//read는 숫자로 가져와서 char로 형변환을 해줘야 하지만
			System.out.println(br.readLine());		//readLine은 한 줄을 가져와서 String형태로 반환이 되기 때문에 그대로 출력하면 된다.
			System.out.println(br.readLine());	
			System.out.println(br.readLine());	
			System.out.println(br.readLine());	
			System.out.println(br.readLine());	
			//(br.readLine()): 한 줄 단위로 읽어 오시오라는 뜻인데 메모장에서의 한 줄이 아니라 버퍼에서의 한 줄이다.
			
			//readLine
				String bread=null;
				while((bread=br.readLine())!= null){
					System.out.print(bread);
					
				}
				
			//read
//				int value=0;
//				while((value=br.read())!= -1){
//					System.out.print((char)value);
//				}

		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
	}
	
	
}
