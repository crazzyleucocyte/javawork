package _04_document;

public class T01_api_document {
	//제목없음1~...
	
	String name;
	static int count;
	
	T01_api_document(){
		System.out.println("제목없음"+ ++count);
	}
	T01_api_document(String name){
		this.name = name;
		System.out.println("문서"+this.name+" 생성됨");
	}
//	T01_api_document doc1 = new T01_api_document();
//	T01_api_document doc2 = new T01_api_document();
}
