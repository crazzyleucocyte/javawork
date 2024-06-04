package _05_ObjectStream;

import java.io.*;

public class ObjectStreamApi {
	//객체 스트림은 보조스트림을 사용해야한다
	
	
//	ObjectInputStream, ObjectOutputStream 보조스트림을 사용
//	출력 메소드 : writeObject(객체);
//	입력 메소드 : readObject()
	
	//객체를 파일로 출력
	void fileSave() {
		//우선 객체를 생성해준다
		Phone p1 = new Phone("갤락서",8000000);
		Phone p2 = new Phone("Nothing Phone",7500000);
		Phone p3 = new Phone("ePhone",9000000);
		
		//기반스트림 : fileOutputStream(1byte단위로 넣어주는것)
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/KMS/javawork/day19/Folder/file_object.txt"))){
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			oos.writeObject(p3);
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/KMS/javawork/day19/Folder/file_object.txt"))){
			
			System.out.println(ois.readObject());
			
			while(true) {
				System.out.println(ois.readObject());
			}
		}catch(EOFException e) {
			System.out.println("파일을 모두 읽었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
