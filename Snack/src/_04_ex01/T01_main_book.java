package _04_ex01;

public class T01_main_book {

	public static void main(String[] args) {
		//객체 생성할때 다른 값으로 넣고 출력하기
		
		T01_api_book b1 = new T01_api_book();
		T01_api_book b2 =new T01_api_book("개미");
		T01_api_book b3 =new T01_api_book("개미",9788932903491L);
		T01_api_book b4 =new T01_api_book("개미",9788932903491L,8517900);
		
		b1.printOut();
		b2.printOut();
		b3.printOut();
		b4.printOut();
		
		
		
	}
	
	
	
	
	
	
}
