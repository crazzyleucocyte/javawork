package _01_File;

import java.io.File;
import java.io.IOException;

public class T01_File {

	public static void main(String[] args) {
		try {
//			File을 써서 파일을 생성하는것인듯
//			1. 경로를 지정하지 않으면 프로젝트 폴더에 생성됨
			File f1 = new File("test.txt");
			f1.createNewFile();//메소드까지 실행해야만 파일이 생성됨
			
//			2. 경로 지정하여 저장
			File f2 = new File("C:\\KMS/temp/test3.txt");
//			 파일 경로 형식
//			 \\를 해도 되도 /를 해도 인식한다.
			f2.createNewFile();
			
//			3. 폴더 만들기
			File tempFolder = new File("C:\\KMS/temp1");
			tempFolder.mkdir();//리눅스에서 쓰는 명령어로 Make Directory라는 뜻이다.
			
			File f3 = new File("C:\\KMS/temp1/Test_java.txt");
			f3.createNewFile();
			
//			존재하는지 체크
			System.out.println("f1이 존재하는가? "+f1.exists());	//true
			System.out.println("f3이 존재하는가? "+f3.exists());	//true
			System.out.println("aaa.txt가 존재하는가? "+new File("aaa.txt").exists());	//객체만 생성하고 create메소드를 실행하지 않았기 때문에 false가 나온다.
			
//			파일인지 아닌지
			System.out.println("f1은 파일인가? "+f1.isFile());	//f1이 파일이냐 아니냐를 물어보는 메소드
			System.out.println("tempFolder는 파일인가? "+tempFolder.isFile());
			
//			폴더인지 아닌지
			System.out.println("f1은 폴더인가? "+f1.isDirectory());	//f1이 폴더냐 아니냐를 물어보는 메소드
			System.out.println("tempFolder는 폴더인가? "+tempFolder.isDirectory());	//tempFolder가 폴더냐 아니냐를 물어보는 메소드
			
//			폴더 생성 디폴트 경로
			File folder = new File("Folder");	//경로를 입력해주지 않을 경우 디폴트 값은 프로젝트 폴더이다.
			folder.mkdir();
			
			File f4 = new File("folder/percon.txt");
			f4.createNewFile();
			
//			파일 이름을 가져오는 메소드
			System.out.println("f4의 파일 명 : "+f4.getName());
			
//			파일의 절대경로를 가져오는 메소드
			System.out.println("f4의 절대경로 : "+f4.getAbsolutePath());
		
//			파일의 용량을 가져오는 메소드
			System.out.println("f4의 파일 용량 : "+f4.length());
			
//			파일의 상위폴더를 가져오는 메소드
			System.out.println("f4의 상위 폴더 : "+f4.getParent());
			
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
//		메소드 실행 결과 해당 자바 프로젝트가 있는 파일 안에 텍스트 파일이 생성되어있다.
		
	}

}
